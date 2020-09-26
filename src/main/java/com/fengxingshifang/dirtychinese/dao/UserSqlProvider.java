package com.fengxingshifang.dirtychinese.dao;

import com.fengxingshifang.dirtychinese.entity.User;
import com.fengxingshifang.dirtychinese.entity.UserExample.Criteria;
import com.fengxingshifang.dirtychinese.entity.UserExample.Criterion;
import com.fengxingshifang.dirtychinese.entity.UserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    public String countByExample(UserExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user");
        
        if (record.getUserid() != null) {
            sql.VALUES("userid", "#{userid,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterstyle() != null) {
            sql.VALUES("registerstyle", "#{registerstyle,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getThirdpartyid() != null) {
            sql.VALUES("thirdpartyid", "#{thirdpartyid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserpassword() != null) {
            sql.VALUES("userpassword", "#{userpassword,jdbcType=VARCHAR}");
        }
        
        if (record.getPhoneid() != null) {
            sql.VALUES("phoneid", "#{phoneid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserstatus() != null) {
            sql.VALUES("userstatus", "#{userstatus,jdbcType=VARCHAR}");
        }
        
        if (record.getRegistertime() != null) {
            sql.VALUES("registertime", "#{registertime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastlogintime() != null) {
            sql.VALUES("lastlogintime", "#{lastlogintime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLogincount() != null) {
            sql.VALUES("logincount", "#{logincount,jdbcType=INTEGER}");
        }
        
        if (record.getPaystatus() != null) {
            sql.VALUES("paystatus", "#{paystatus,jdbcType=VARCHAR}");
        }
        
        if (record.getRememberToken() != null) {
            sql.VALUES("remember_token", "#{rememberToken,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRole() != null) {
            sql.VALUES("role", "#{role,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("userid");
        } else {
            sql.SELECT("userid");
        }
        sql.SELECT("registerstyle");
        sql.SELECT("phone");
        sql.SELECT("thirdpartyid");
        sql.SELECT("userpassword");
        sql.SELECT("phoneid");
        sql.SELECT("userstatus");
        sql.SELECT("registertime");
        sql.SELECT("lastlogintime");
        sql.SELECT("logincount");
        sql.SELECT("paystatus");
        sql.SELECT("remember_token");
        sql.SELECT("created_at");
        sql.SELECT("updated_at");
        sql.SELECT("role");
        sql.FROM("user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        User record = (User) parameter.get("record");
        UserExample example = (UserExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        if (record.getUserid() != null) {
            sql.SET("userid = #{record.userid,jdbcType=VARCHAR}");
        }
        
        if (record.getRegisterstyle() != null) {
            sql.SET("registerstyle = #{record.registerstyle,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{record.phone,jdbcType=VARCHAR}");
        }
        
        if (record.getThirdpartyid() != null) {
            sql.SET("thirdpartyid = #{record.thirdpartyid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserpassword() != null) {
            sql.SET("userpassword = #{record.userpassword,jdbcType=VARCHAR}");
        }
        
        if (record.getPhoneid() != null) {
            sql.SET("phoneid = #{record.phoneid,jdbcType=VARCHAR}");
        }
        
        if (record.getUserstatus() != null) {
            sql.SET("userstatus = #{record.userstatus,jdbcType=VARCHAR}");
        }
        
        if (record.getRegistertime() != null) {
            sql.SET("registertime = #{record.registertime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLastlogintime() != null) {
            sql.SET("lastlogintime = #{record.lastlogintime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLogincount() != null) {
            sql.SET("logincount = #{record.logincount,jdbcType=INTEGER}");
        }
        
        if (record.getPaystatus() != null) {
            sql.SET("paystatus = #{record.paystatus,jdbcType=VARCHAR}");
        }
        
        if (record.getRememberToken() != null) {
            sql.SET("remember_token = #{record.rememberToken,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRole() != null) {
            sql.SET("role = #{record.role,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        sql.SET("userid = #{record.userid,jdbcType=VARCHAR}");
        sql.SET("registerstyle = #{record.registerstyle,jdbcType=VARCHAR}");
        sql.SET("phone = #{record.phone,jdbcType=VARCHAR}");
        sql.SET("thirdpartyid = #{record.thirdpartyid,jdbcType=VARCHAR}");
        sql.SET("userpassword = #{record.userpassword,jdbcType=VARCHAR}");
        sql.SET("phoneid = #{record.phoneid,jdbcType=VARCHAR}");
        sql.SET("userstatus = #{record.userstatus,jdbcType=VARCHAR}");
        sql.SET("registertime = #{record.registertime,jdbcType=TIMESTAMP}");
        sql.SET("lastlogintime = #{record.lastlogintime,jdbcType=TIMESTAMP}");
        sql.SET("logincount = #{record.logincount,jdbcType=INTEGER}");
        sql.SET("paystatus = #{record.paystatus,jdbcType=VARCHAR}");
        sql.SET("remember_token = #{record.rememberToken,jdbcType=VARCHAR}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("role = #{record.role,jdbcType=VARCHAR}");
        
        UserExample example = (UserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UserExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}