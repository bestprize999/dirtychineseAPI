package com.fengxingshifang.dirtychinese.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InforelaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InforelaExample() {
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

        public Criteria andInforelaidIsNull() {
            addCriterion("inforelaid is null");
            return (Criteria) this;
        }

        public Criteria andInforelaidIsNotNull() {
            addCriterion("inforelaid is not null");
            return (Criteria) this;
        }

        public Criteria andInforelaidEqualTo(String value) {
            addCriterion("inforelaid =", value, "inforelaid");
            return (Criteria) this;
        }

        public Criteria andInforelaidNotEqualTo(String value) {
            addCriterion("inforelaid <>", value, "inforelaid");
            return (Criteria) this;
        }

        public Criteria andInforelaidGreaterThan(String value) {
            addCriterion("inforelaid >", value, "inforelaid");
            return (Criteria) this;
        }

        public Criteria andInforelaidGreaterThanOrEqualTo(String value) {
            addCriterion("inforelaid >=", value, "inforelaid");
            return (Criteria) this;
        }

        public Criteria andInforelaidLessThan(String value) {
            addCriterion("inforelaid <", value, "inforelaid");
            return (Criteria) this;
        }

        public Criteria andInforelaidLessThanOrEqualTo(String value) {
            addCriterion("inforelaid <=", value, "inforelaid");
            return (Criteria) this;
        }

        public Criteria andInforelaidLike(String value) {
            addCriterion("inforelaid like", value, "inforelaid");
            return (Criteria) this;
        }

        public Criteria andInforelaidNotLike(String value) {
            addCriterion("inforelaid not like", value, "inforelaid");
            return (Criteria) this;
        }

        public Criteria andInforelaidIn(List<String> values) {
            addCriterion("inforelaid in", values, "inforelaid");
            return (Criteria) this;
        }

        public Criteria andInforelaidNotIn(List<String> values) {
            addCriterion("inforelaid not in", values, "inforelaid");
            return (Criteria) this;
        }

        public Criteria andInforelaidBetween(String value1, String value2) {
            addCriterion("inforelaid between", value1, value2, "inforelaid");
            return (Criteria) this;
        }

        public Criteria andInforelaidNotBetween(String value1, String value2) {
            addCriterion("inforelaid not between", value1, value2, "inforelaid");
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

        public Criteria andParentinfoidIsNull() {
            addCriterion("parentinfoid is null");
            return (Criteria) this;
        }

        public Criteria andParentinfoidIsNotNull() {
            addCriterion("parentinfoid is not null");
            return (Criteria) this;
        }

        public Criteria andParentinfoidEqualTo(String value) {
            addCriterion("parentinfoid =", value, "parentinfoid");
            return (Criteria) this;
        }

        public Criteria andParentinfoidNotEqualTo(String value) {
            addCriterion("parentinfoid <>", value, "parentinfoid");
            return (Criteria) this;
        }

        public Criteria andParentinfoidGreaterThan(String value) {
            addCriterion("parentinfoid >", value, "parentinfoid");
            return (Criteria) this;
        }

        public Criteria andParentinfoidGreaterThanOrEqualTo(String value) {
            addCriterion("parentinfoid >=", value, "parentinfoid");
            return (Criteria) this;
        }

        public Criteria andParentinfoidLessThan(String value) {
            addCriterion("parentinfoid <", value, "parentinfoid");
            return (Criteria) this;
        }

        public Criteria andParentinfoidLessThanOrEqualTo(String value) {
            addCriterion("parentinfoid <=", value, "parentinfoid");
            return (Criteria) this;
        }

        public Criteria andParentinfoidLike(String value) {
            addCriterion("parentinfoid like", value, "parentinfoid");
            return (Criteria) this;
        }

        public Criteria andParentinfoidNotLike(String value) {
            addCriterion("parentinfoid not like", value, "parentinfoid");
            return (Criteria) this;
        }

        public Criteria andParentinfoidIn(List<String> values) {
            addCriterion("parentinfoid in", values, "parentinfoid");
            return (Criteria) this;
        }

        public Criteria andParentinfoidNotIn(List<String> values) {
            addCriterion("parentinfoid not in", values, "parentinfoid");
            return (Criteria) this;
        }

        public Criteria andParentinfoidBetween(String value1, String value2) {
            addCriterion("parentinfoid between", value1, value2, "parentinfoid");
            return (Criteria) this;
        }

        public Criteria andParentinfoidNotBetween(String value1, String value2) {
            addCriterion("parentinfoid not between", value1, value2, "parentinfoid");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNull() {
            addCriterion("sortno is null");
            return (Criteria) this;
        }

        public Criteria andSortnoIsNotNull() {
            addCriterion("sortno is not null");
            return (Criteria) this;
        }

        public Criteria andSortnoEqualTo(String value) {
            addCriterion("sortno =", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotEqualTo(String value) {
            addCriterion("sortno <>", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThan(String value) {
            addCriterion("sortno >", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoGreaterThanOrEqualTo(String value) {
            addCriterion("sortno >=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThan(String value) {
            addCriterion("sortno <", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLessThanOrEqualTo(String value) {
            addCriterion("sortno <=", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoLike(String value) {
            addCriterion("sortno like", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotLike(String value) {
            addCriterion("sortno not like", value, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoIn(List<String> values) {
            addCriterion("sortno in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotIn(List<String> values) {
            addCriterion("sortno not in", values, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoBetween(String value1, String value2) {
            addCriterion("sortno between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andSortnoNotBetween(String value1, String value2) {
            addCriterion("sortno not between", value1, value2, "sortno");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNull() {
            addCriterion("lastupdatetime is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNotNull() {
            addCriterion("lastupdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeEqualTo(Date value) {
            addCriterion("lastupdatetime =", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotEqualTo(Date value) {
            addCriterion("lastupdatetime <>", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThan(Date value) {
            addCriterion("lastupdatetime >", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastupdatetime >=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThan(Date value) {
            addCriterion("lastupdatetime <", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("lastupdatetime <=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIn(List<Date> values) {
            addCriterion("lastupdatetime in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotIn(List<Date> values) {
            addCriterion("lastupdatetime not in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeBetween(Date value1, Date value2) {
            addCriterion("lastupdatetime between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("lastupdatetime not between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andInforelastatusIsNull() {
            addCriterion("inforelastatus is null");
            return (Criteria) this;
        }

        public Criteria andInforelastatusIsNotNull() {
            addCriterion("inforelastatus is not null");
            return (Criteria) this;
        }

        public Criteria andInforelastatusEqualTo(String value) {
            addCriterion("inforelastatus =", value, "inforelastatus");
            return (Criteria) this;
        }

        public Criteria andInforelastatusNotEqualTo(String value) {
            addCriterion("inforelastatus <>", value, "inforelastatus");
            return (Criteria) this;
        }

        public Criteria andInforelastatusGreaterThan(String value) {
            addCriterion("inforelastatus >", value, "inforelastatus");
            return (Criteria) this;
        }

        public Criteria andInforelastatusGreaterThanOrEqualTo(String value) {
            addCriterion("inforelastatus >=", value, "inforelastatus");
            return (Criteria) this;
        }

        public Criteria andInforelastatusLessThan(String value) {
            addCriterion("inforelastatus <", value, "inforelastatus");
            return (Criteria) this;
        }

        public Criteria andInforelastatusLessThanOrEqualTo(String value) {
            addCriterion("inforelastatus <=", value, "inforelastatus");
            return (Criteria) this;
        }

        public Criteria andInforelastatusLike(String value) {
            addCriterion("inforelastatus like", value, "inforelastatus");
            return (Criteria) this;
        }

        public Criteria andInforelastatusNotLike(String value) {
            addCriterion("inforelastatus not like", value, "inforelastatus");
            return (Criteria) this;
        }

        public Criteria andInforelastatusIn(List<String> values) {
            addCriterion("inforelastatus in", values, "inforelastatus");
            return (Criteria) this;
        }

        public Criteria andInforelastatusNotIn(List<String> values) {
            addCriterion("inforelastatus not in", values, "inforelastatus");
            return (Criteria) this;
        }

        public Criteria andInforelastatusBetween(String value1, String value2) {
            addCriterion("inforelastatus between", value1, value2, "inforelastatus");
            return (Criteria) this;
        }

        public Criteria andInforelastatusNotBetween(String value1, String value2) {
            addCriterion("inforelastatus not between", value1, value2, "inforelastatus");
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