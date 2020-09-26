package com.fengxingshifang.dirtychinese.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserinfocollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfocollectExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserinfocollectidIsNull() {
            addCriterion("userinfocollectid is null");
            return (Criteria) this;
        }

        public Criteria andUserinfocollectidIsNotNull() {
            addCriterion("userinfocollectid is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfocollectidEqualTo(String value) {
            addCriterion("userinfocollectid =", value, "userinfocollectid");
            return (Criteria) this;
        }

        public Criteria andUserinfocollectidNotEqualTo(String value) {
            addCriterion("userinfocollectid <>", value, "userinfocollectid");
            return (Criteria) this;
        }

        public Criteria andUserinfocollectidGreaterThan(String value) {
            addCriterion("userinfocollectid >", value, "userinfocollectid");
            return (Criteria) this;
        }

        public Criteria andUserinfocollectidGreaterThanOrEqualTo(String value) {
            addCriterion("userinfocollectid >=", value, "userinfocollectid");
            return (Criteria) this;
        }

        public Criteria andUserinfocollectidLessThan(String value) {
            addCriterion("userinfocollectid <", value, "userinfocollectid");
            return (Criteria) this;
        }

        public Criteria andUserinfocollectidLessThanOrEqualTo(String value) {
            addCriterion("userinfocollectid <=", value, "userinfocollectid");
            return (Criteria) this;
        }

        public Criteria andUserinfocollectidLike(String value) {
            addCriterion("userinfocollectid like", value, "userinfocollectid");
            return (Criteria) this;
        }

        public Criteria andUserinfocollectidNotLike(String value) {
            addCriterion("userinfocollectid not like", value, "userinfocollectid");
            return (Criteria) this;
        }

        public Criteria andUserinfocollectidIn(List<String> values) {
            addCriterion("userinfocollectid in", values, "userinfocollectid");
            return (Criteria) this;
        }

        public Criteria andUserinfocollectidNotIn(List<String> values) {
            addCriterion("userinfocollectid not in", values, "userinfocollectid");
            return (Criteria) this;
        }

        public Criteria andUserinfocollectidBetween(String value1, String value2) {
            addCriterion("userinfocollectid between", value1, value2, "userinfocollectid");
            return (Criteria) this;
        }

        public Criteria andUserinfocollectidNotBetween(String value1, String value2) {
            addCriterion("userinfocollectid not between", value1, value2, "userinfocollectid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPhoneidIsNull() {
            addCriterion("phoneid is null");
            return (Criteria) this;
        }

        public Criteria andPhoneidIsNotNull() {
            addCriterion("phoneid is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneidEqualTo(String value) {
            addCriterion("phoneid =", value, "phoneid");
            return (Criteria) this;
        }

        public Criteria andPhoneidNotEqualTo(String value) {
            addCriterion("phoneid <>", value, "phoneid");
            return (Criteria) this;
        }

        public Criteria andPhoneidGreaterThan(String value) {
            addCriterion("phoneid >", value, "phoneid");
            return (Criteria) this;
        }

        public Criteria andPhoneidGreaterThanOrEqualTo(String value) {
            addCriterion("phoneid >=", value, "phoneid");
            return (Criteria) this;
        }

        public Criteria andPhoneidLessThan(String value) {
            addCriterion("phoneid <", value, "phoneid");
            return (Criteria) this;
        }

        public Criteria andPhoneidLessThanOrEqualTo(String value) {
            addCriterion("phoneid <=", value, "phoneid");
            return (Criteria) this;
        }

        public Criteria andPhoneidLike(String value) {
            addCriterion("phoneid like", value, "phoneid");
            return (Criteria) this;
        }

        public Criteria andPhoneidNotLike(String value) {
            addCriterion("phoneid not like", value, "phoneid");
            return (Criteria) this;
        }

        public Criteria andPhoneidIn(List<String> values) {
            addCriterion("phoneid in", values, "phoneid");
            return (Criteria) this;
        }

        public Criteria andPhoneidNotIn(List<String> values) {
            addCriterion("phoneid not in", values, "phoneid");
            return (Criteria) this;
        }

        public Criteria andPhoneidBetween(String value1, String value2) {
            addCriterion("phoneid between", value1, value2, "phoneid");
            return (Criteria) this;
        }

        public Criteria andPhoneidNotBetween(String value1, String value2) {
            addCriterion("phoneid not between", value1, value2, "phoneid");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNull() {
            addCriterion("infoid is null");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNotNull() {
            addCriterion("infoid is not null");
            return (Criteria) this;
        }

        public Criteria andInfoidEqualTo(String value) {
            addCriterion("infoid =", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotEqualTo(String value) {
            addCriterion("infoid <>", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThan(String value) {
            addCriterion("infoid >", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThanOrEqualTo(String value) {
            addCriterion("infoid >=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThan(String value) {
            addCriterion("infoid <", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThanOrEqualTo(String value) {
            addCriterion("infoid <=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLike(String value) {
            addCriterion("infoid like", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotLike(String value) {
            addCriterion("infoid not like", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidIn(List<String> values) {
            addCriterion("infoid in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotIn(List<String> values) {
            addCriterion("infoid not in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidBetween(String value1, String value2) {
            addCriterion("infoid between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotBetween(String value1, String value2) {
            addCriterion("infoid not between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andColltimeIsNull() {
            addCriterion("colltime is null");
            return (Criteria) this;
        }

        public Criteria andColltimeIsNotNull() {
            addCriterion("colltime is not null");
            return (Criteria) this;
        }

        public Criteria andColltimeEqualTo(Date value) {
            addCriterion("colltime =", value, "colltime");
            return (Criteria) this;
        }

        public Criteria andColltimeNotEqualTo(Date value) {
            addCriterion("colltime <>", value, "colltime");
            return (Criteria) this;
        }

        public Criteria andColltimeGreaterThan(Date value) {
            addCriterion("colltime >", value, "colltime");
            return (Criteria) this;
        }

        public Criteria andColltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("colltime >=", value, "colltime");
            return (Criteria) this;
        }

        public Criteria andColltimeLessThan(Date value) {
            addCriterion("colltime <", value, "colltime");
            return (Criteria) this;
        }

        public Criteria andColltimeLessThanOrEqualTo(Date value) {
            addCriterion("colltime <=", value, "colltime");
            return (Criteria) this;
        }

        public Criteria andColltimeIn(List<Date> values) {
            addCriterion("colltime in", values, "colltime");
            return (Criteria) this;
        }

        public Criteria andColltimeNotIn(List<Date> values) {
            addCriterion("colltime not in", values, "colltime");
            return (Criteria) this;
        }

        public Criteria andColltimeBetween(Date value1, Date value2) {
            addCriterion("colltime between", value1, value2, "colltime");
            return (Criteria) this;
        }

        public Criteria andColltimeNotBetween(Date value1, Date value2) {
            addCriterion("colltime not between", value1, value2, "colltime");
            return (Criteria) this;
        }

        public Criteria andCancelcolltimeIsNull() {
            addCriterion("cancelcolltime is null");
            return (Criteria) this;
        }

        public Criteria andCancelcolltimeIsNotNull() {
            addCriterion("cancelcolltime is not null");
            return (Criteria) this;
        }

        public Criteria andCancelcolltimeEqualTo(Date value) {
            addCriterion("cancelcolltime =", value, "cancelcolltime");
            return (Criteria) this;
        }

        public Criteria andCancelcolltimeNotEqualTo(Date value) {
            addCriterion("cancelcolltime <>", value, "cancelcolltime");
            return (Criteria) this;
        }

        public Criteria andCancelcolltimeGreaterThan(Date value) {
            addCriterion("cancelcolltime >", value, "cancelcolltime");
            return (Criteria) this;
        }

        public Criteria andCancelcolltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cancelcolltime >=", value, "cancelcolltime");
            return (Criteria) this;
        }

        public Criteria andCancelcolltimeLessThan(Date value) {
            addCriterion("cancelcolltime <", value, "cancelcolltime");
            return (Criteria) this;
        }

        public Criteria andCancelcolltimeLessThanOrEqualTo(Date value) {
            addCriterion("cancelcolltime <=", value, "cancelcolltime");
            return (Criteria) this;
        }

        public Criteria andCancelcolltimeIn(List<Date> values) {
            addCriterion("cancelcolltime in", values, "cancelcolltime");
            return (Criteria) this;
        }

        public Criteria andCancelcolltimeNotIn(List<Date> values) {
            addCriterion("cancelcolltime not in", values, "cancelcolltime");
            return (Criteria) this;
        }

        public Criteria andCancelcolltimeBetween(Date value1, Date value2) {
            addCriterion("cancelcolltime between", value1, value2, "cancelcolltime");
            return (Criteria) this;
        }

        public Criteria andCancelcolltimeNotBetween(Date value1, Date value2) {
            addCriterion("cancelcolltime not between", value1, value2, "cancelcolltime");
            return (Criteria) this;
        }

        public Criteria andInfocollstatusIsNull() {
            addCriterion("infocollstatus is null");
            return (Criteria) this;
        }

        public Criteria andInfocollstatusIsNotNull() {
            addCriterion("infocollstatus is not null");
            return (Criteria) this;
        }

        public Criteria andInfocollstatusEqualTo(String value) {
            addCriterion("infocollstatus =", value, "infocollstatus");
            return (Criteria) this;
        }

        public Criteria andInfocollstatusNotEqualTo(String value) {
            addCriterion("infocollstatus <>", value, "infocollstatus");
            return (Criteria) this;
        }

        public Criteria andInfocollstatusGreaterThan(String value) {
            addCriterion("infocollstatus >", value, "infocollstatus");
            return (Criteria) this;
        }

        public Criteria andInfocollstatusGreaterThanOrEqualTo(String value) {
            addCriterion("infocollstatus >=", value, "infocollstatus");
            return (Criteria) this;
        }

        public Criteria andInfocollstatusLessThan(String value) {
            addCriterion("infocollstatus <", value, "infocollstatus");
            return (Criteria) this;
        }

        public Criteria andInfocollstatusLessThanOrEqualTo(String value) {
            addCriterion("infocollstatus <=", value, "infocollstatus");
            return (Criteria) this;
        }

        public Criteria andInfocollstatusLike(String value) {
            addCriterion("infocollstatus like", value, "infocollstatus");
            return (Criteria) this;
        }

        public Criteria andInfocollstatusNotLike(String value) {
            addCriterion("infocollstatus not like", value, "infocollstatus");
            return (Criteria) this;
        }

        public Criteria andInfocollstatusIn(List<String> values) {
            addCriterion("infocollstatus in", values, "infocollstatus");
            return (Criteria) this;
        }

        public Criteria andInfocollstatusNotIn(List<String> values) {
            addCriterion("infocollstatus not in", values, "infocollstatus");
            return (Criteria) this;
        }

        public Criteria andInfocollstatusBetween(String value1, String value2) {
            addCriterion("infocollstatus between", value1, value2, "infocollstatus");
            return (Criteria) this;
        }

        public Criteria andInfocollstatusNotBetween(String value1, String value2) {
            addCriterion("infocollstatus not between", value1, value2, "infocollstatus");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}