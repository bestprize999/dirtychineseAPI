package com.fengxingshifang.dirtychinese.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fengxingshifang.dirtychinese.dao.InfoMapper;
import com.fengxingshifang.dirtychinese.entity.Info;

@RestController
@EnableAutoConfiguration
@RequestMapping("admin")
public class InfoControllerAdmin {
	
	@Autowired
	InfoMapper infoDao;
	
	@GetMapping("/index")
	public ModelAndView index(ModelAndView mv) {
	    mv.setViewName("/admin/index");
//	    mv.addObject("title","欢迎使用Thymeleaf!");
	    return mv;
	}
	
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

}
