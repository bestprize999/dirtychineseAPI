package com.fengxingshifang.dirtychinese.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fengxingshifang.dirtychinese.dao.InfoMapper;
import com.fengxingshifang.dirtychinese.entity.Info;
import com.fengxingshifang.dirtychinese.entity.User;
import com.fengxingshifang.dirtychinese.fileupload.FileStorageService;
import com.fengxingshifang.dirtychinese.fileupload.UploadFileResponse;

@RestController
@EnableAutoConfiguration
public class InfoController {
	
	@Autowired
	InfoMapper infoDao;
	
    @Autowired
    private FileStorageService fileStorageService;

	@GetMapping("/listInfo")
//	@PreAuthorize("hasRole('ROLE_1')")
    public List<Info> home() {
//        return "Hello World!";
		return infoDao.selectAll();
    }

	/**
	 * 首页getinfolisthome
	 * @return
	 */
	@GetMapping("/getinfolisthome")
    public List<Info> getInfolistHome() {
		int count = 4;
		return infoDao.getInfolistHome(count);
    }

	/**
	 * 我发布的
	 * @return
	 */
	@GetMapping("/getinfolistmypublish")
    public List<Info> getInfolistMypublish() {
		String userid = "111111";
		int count = 10;
		return infoDao.getInfolistMypublish(userid, count);
    }

	/**
	 * 我收藏的
	 * @return
	 */
	@GetMapping("/getinfolistmycollect")
    public List<Info> getInfolistMycollect() {
		String userid = "111111";
		int count = 10;
		return infoDao.getInfolistMycollect(userid, count);
    }

	/**
	 * 我评论过的
	 * @return
	 */
	@GetMapping("/getinfolistmycomment")
    public List<Info> getInfolistMycomment() {
		//TODO
		String userid = "111111";
		int count = 10;
		return infoDao.getInfolistMycomment(userid, count);
    }

	/**
	 * 我看过的
	 * @return
	 */
	@GetMapping("/getinfolistmyview")
    public List<Info> getInfolistMyview() {
		//TODO
		String userid = "111111";
		int count = 10;
		return infoDao.getInfolistMyview(userid, count);
    }

	/**
	 * infodetail
	 * @return
	 */
	@GetMapping("/getinfo")
    public List<Info> getInfo() {
    	String infoid = "1";
		return infoDao.getInfo(infoid);
    }

	/**
	 * info评论
	 * @return
	 */
	@GetMapping("/getinfocomment")
    public List<Info> getInfoComment() {
    	String infoid = "1";
    	int count = 10;
		return infoDao.getInfoComment(infoid, count);
    }

	/**
	 * 发布info
	 * @return
	 */
	@PostMapping("/newinfo")
    public void newInfo(@RequestParam("title") String title, @RequestParam("file") MultipartFile file) {
        String fileName = fileStorageService.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();
        
        Info info = new Info();
        info.setInfoid(UUID.randomUUID().toString().replace("-", "").toLowerCase());
        info.setTitle(title);
        
		infoDao.newInfo(info);


//        return new UploadFileResponse(fileName, fileDownloadUri,file.getContentType(), file.getSize());

    }

	/**
	 * 添加info
	 * @return
	 */
	@GetMapping("/addinfo")
    public void addInfo(@RequestBody Info info) {
		infoDao.addInfo(info);
    }

	/**
	 * 发表comment
	 * @return
	 */
	@GetMapping("/addcomment")
    public void addComment(@RequestBody Info info, @RequestParam(value="userId",required=true) String userid) {
		infoDao.addComment(info, userid);
    }

	/**
	 * 收藏
	 * @return
	 */
	@GetMapping("/addcoll")
    public void addColl(@RequestBody Info info, @RequestParam(value="userId",required=true) String userid) {
		infoDao.addColl(info, userid);
    }

}
