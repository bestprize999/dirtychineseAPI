package com.fengxingshifang.dirtychinese.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoExample() {
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

        public Criteria andInfoorcommIsNull() {
            addCriterion("infoorcomm is null");
            return (Criteria) this;
        }

        public Criteria andInfoorcommIsNotNull() {
            addCriterion("infoorcomm is not null");
            return (Criteria) this;
        }

        public Criteria andInfoorcommEqualTo(String value) {
            addCriterion("infoorcomm =", value, "infoorcomm");
            return (Criteria) this;
        }

        public Criteria andInfoorcommNotEqualTo(String value) {
            addCriterion("infoorcomm <>", value, "infoorcomm");
            return (Criteria) this;
        }

        public Criteria andInfoorcommGreaterThan(String value) {
            addCriterion("infoorcomm >", value, "infoorcomm");
            return (Criteria) this;
        }

        public Criteria andInfoorcommGreaterThanOrEqualTo(String value) {
            addCriterion("infoorcomm >=", value, "infoorcomm");
            return (Criteria) this;
        }

        public Criteria andInfoorcommLessThan(String value) {
            addCriterion("infoorcomm <", value, "infoorcomm");
            return (Criteria) this;
        }

        public Criteria andInfoorcommLessThanOrEqualTo(String value) {
            addCriterion("infoorcomm <=", value, "infoorcomm");
            return (Criteria) this;
        }

        public Criteria andInfoorcommLike(String value) {
            addCriterion("infoorcomm like", value, "infoorcomm");
            return (Criteria) this;
        }

        public Criteria andInfoorcommNotLike(String value) {
            addCriterion("infoorcomm not like", value, "infoorcomm");
            return (Criteria) this;
        }

        public Criteria andInfoorcommIn(List<String> values) {
            addCriterion("infoorcomm in", values, "infoorcomm");
            return (Criteria) this;
        }

        public Criteria andInfoorcommNotIn(List<String> values) {
            addCriterion("infoorcomm not in", values, "infoorcomm");
            return (Criteria) this;
        }

        public Criteria andInfoorcommBetween(String value1, String value2) {
            addCriterion("infoorcomm between", value1, value2, "infoorcomm");
            return (Criteria) this;
        }

        public Criteria andInfoorcommNotBetween(String value1, String value2) {
            addCriterion("infoorcomm not between", value1, value2, "infoorcomm");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDigestIsNull() {
            addCriterion("digest is null");
            return (Criteria) this;
        }

        public Criteria andDigestIsNotNull() {
            addCriterion("digest is not null");
            return (Criteria) this;
        }

        public Criteria andDigestEqualTo(String value) {
            addCriterion("digest =", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotEqualTo(String value) {
            addCriterion("digest <>", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThan(String value) {
            addCriterion("digest >", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThanOrEqualTo(String value) {
            addCriterion("digest >=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThan(String value) {
            addCriterion("digest <", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThanOrEqualTo(String value) {
            addCriterion("digest <=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLike(String value) {
            addCriterion("digest like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotLike(String value) {
            addCriterion("digest not like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestIn(List<String> values) {
            addCriterion("digest in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotIn(List<String> values) {
            addCriterion("digest not in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestBetween(String value1, String value2) {
            addCriterion("digest between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotBetween(String value1, String value2) {
            addCriterion("digest not between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
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

        public Criteria andBrowsecountIsNull() {
            addCriterion("browsecount is null");
            return (Criteria) this;
        }

        public Criteria andBrowsecountIsNotNull() {
            addCriterion("browsecount is not null");
            return (Criteria) this;
        }

        public Criteria andBrowsecountEqualTo(Integer value) {
            addCriterion("browsecount =", value, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountNotEqualTo(Integer value) {
            addCriterion("browsecount <>", value, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountGreaterThan(Integer value) {
            addCriterion("browsecount >", value, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("browsecount >=", value, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountLessThan(Integer value) {
            addCriterion("browsecount <", value, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountLessThanOrEqualTo(Integer value) {
            addCriterion("browsecount <=", value, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountIn(List<Integer> values) {
            addCriterion("browsecount in", values, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountNotIn(List<Integer> values) {
            addCriterion("browsecount not in", values, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountBetween(Integer value1, Integer value2) {
            addCriterion("browsecount between", value1, value2, "browsecount");
            return (Criteria) this;
        }

        public Criteria andBrowsecountNotBetween(Integer value1, Integer value2) {
            addCriterion("browsecount not between", value1, value2, "browsecount");
            return (Criteria) this;
        }

        public Criteria andCommentcountIsNull() {
            addCriterion("commentcount is null");
            return (Criteria) this;
        }

        public Criteria andCommentcountIsNotNull() {
            addCriterion("commentcount is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcountEqualTo(Integer value) {
            addCriterion("commentcount =", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotEqualTo(Integer value) {
            addCriterion("commentcount <>", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountGreaterThan(Integer value) {
            addCriterion("commentcount >", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentcount >=", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountLessThan(Integer value) {
            addCriterion("commentcount <", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountLessThanOrEqualTo(Integer value) {
            addCriterion("commentcount <=", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountIn(List<Integer> values) {
            addCriterion("commentcount in", values, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotIn(List<Integer> values) {
            addCriterion("commentcount not in", values, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountBetween(Integer value1, Integer value2) {
            addCriterion("commentcount between", value1, value2, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotBetween(Integer value1, Integer value2) {
            addCriterion("commentcount not between", value1, value2, "commentcount");
            return (Criteria) this;
        }

        public Criteria andSupportcountIsNull() {
            addCriterion("supportcount is null");
            return (Criteria) this;
        }

        public Criteria andSupportcountIsNotNull() {
            addCriterion("supportcount is not null");
            return (Criteria) this;
        }

        public Criteria andSupportcountEqualTo(Integer value) {
            addCriterion("supportcount =", value, "supportcount");
            return (Criteria) this;
        }

        public Criteria andSupportcountNotEqualTo(Integer value) {
            addCriterion("supportcount <>", value, "supportcount");
            return (Criteria) this;
        }

        public Criteria andSupportcountGreaterThan(Integer value) {
            addCriterion("supportcount >", value, "supportcount");
            return (Criteria) this;
        }

        public Criteria andSupportcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("supportcount >=", value, "supportcount");
            return (Criteria) this;
        }

        public Criteria andSupportcountLessThan(Integer value) {
            addCriterion("supportcount <", value, "supportcount");
            return (Criteria) this;
        }

        public Criteria andSupportcountLessThanOrEqualTo(Integer value) {
            addCriterion("supportcount <=", value, "supportcount");
            return (Criteria) this;
        }

        public Criteria andSupportcountIn(List<Integer> values) {
            addCriterion("supportcount in", values, "supportcount");
            return (Criteria) this;
        }

        public Criteria andSupportcountNotIn(List<Integer> values) {
            addCriterion("supportcount not in", values, "supportcount");
            return (Criteria) this;
        }

        public Criteria andSupportcountBetween(Integer value1, Integer value2) {
            addCriterion("supportcount between", value1, value2, "supportcount");
            return (Criteria) this;
        }

        public Criteria andSupportcountNotBetween(Integer value1, Integer value2) {
            addCriterion("supportcount not between", value1, value2, "supportcount");
            return (Criteria) this;
        }

        public Criteria andInfostatusIsNull() {
            addCriterion("infostatus is null");
            return (Criteria) this;
        }

        public Criteria andInfostatusIsNotNull() {
            addCriterion("infostatus is not null");
            return (Criteria) this;
        }

        public Criteria andInfostatusEqualTo(String value) {
            addCriterion("infostatus =", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusNotEqualTo(String value) {
            addCriterion("infostatus <>", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusGreaterThan(String value) {
            addCriterion("infostatus >", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusGreaterThanOrEqualTo(String value) {
            addCriterion("infostatus >=", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusLessThan(String value) {
            addCriterion("infostatus <", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusLessThanOrEqualTo(String value) {
            addCriterion("infostatus <=", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusLike(String value) {
            addCriterion("infostatus like", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusNotLike(String value) {
            addCriterion("infostatus not like", value, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusIn(List<String> values) {
            addCriterion("infostatus in", values, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusNotIn(List<String> values) {
            addCriterion("infostatus not in", values, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusBetween(String value1, String value2) {
            addCriterion("infostatus between", value1, value2, "infostatus");
            return (Criteria) this;
        }

        public Criteria andInfostatusNotBetween(String value1, String value2) {
            addCriterion("infostatus not between", value1, value2, "infostatus");
            return (Criteria) this;
        }

        public Criteria andCommentlevelIsNull() {
            addCriterion("commentlevel is null");
            return (Criteria) this;
        }

        public Criteria andCommentlevelIsNotNull() {
            addCriterion("commentlevel is not null");
            return (Criteria) this;
        }

        public Criteria andCommentlevelEqualTo(String value) {
            addCriterion("commentlevel =", value, "commentlevel");
            return (Criteria) this;
        }

        public Criteria andCommentlevelNotEqualTo(String value) {
            addCriterion("commentlevel <>", value, "commentlevel");
            return (Criteria) this;
        }

        public Criteria andCommentlevelGreaterThan(String value) {
            addCriterion("commentlevel >", value, "commentlevel");
            return (Criteria) this;
        }

        public Criteria andCommentlevelGreaterThanOrEqualTo(String value) {
            addCriterion("commentlevel >=", value, "commentlevel");
            return (Criteria) this;
        }

        public Criteria andCommentlevelLessThan(String value) {
            addCriterion("commentlevel <", value, "commentlevel");
            return (Criteria) this;
        }

        public Criteria andCommentlevelLessThanOrEqualTo(String value) {
            addCriterion("commentlevel <=", value, "commentlevel");
            return (Criteria) this;
        }

        public Criteria andCommentlevelLike(String value) {
            addCriterion("commentlevel like", value, "commentlevel");
            return (Criteria) this;
        }

        public Criteria andCommentlevelNotLike(String value) {
            addCriterion("commentlevel not like", value, "commentlevel");
            return (Criteria) this;
        }

        public Criteria andCommentlevelIn(List<String> values) {
            addCriterion("commentlevel in", values, "commentlevel");
            return (Criteria) this;
        }

        public Criteria andCommentlevelNotIn(List<String> values) {
            addCriterion("commentlevel not in", values, "commentlevel");
            return (Criteria) this;
        }

        public Criteria andCommentlevelBetween(String value1, String value2) {
            addCriterion("commentlevel between", value1, value2, "commentlevel");
            return (Criteria) this;
        }

        public Criteria andCommentlevelNotBetween(String value1, String value2) {
            addCriterion("commentlevel not between", value1, value2, "commentlevel");
            return (Criteria) this;
        }

        public Criteria andIsupIsNull() {
            addCriterion("isup is null");
            return (Criteria) this;
        }

        public Criteria andIsupIsNotNull() {
            addCriterion("isup is not null");
            return (Criteria) this;
        }

        public Criteria andIsupEqualTo(String value) {
            addCriterion("isup =", value, "isup");
            return (Criteria) this;
        }

        public Criteria andIsupNotEqualTo(String value) {
            addCriterion("isup <>", value, "isup");
            return (Criteria) this;
        }

        public Criteria andIsupGreaterThan(String value) {
            addCriterion("isup >", value, "isup");
            return (Criteria) this;
        }

        public Criteria andIsupGreaterThanOrEqualTo(String value) {
            addCriterion("isup >=", value, "isup");
            return (Criteria) this;
        }

        public Criteria andIsupLessThan(String value) {
            addCriterion("isup <", value, "isup");
            return (Criteria) this;
        }

        public Criteria andIsupLessThanOrEqualTo(String value) {
            addCriterion("isup <=", value, "isup");
            return (Criteria) this;
        }

        public Criteria andIsupLike(String value) {
            addCriterion("isup like", value, "isup");
            return (Criteria) this;
        }

        public Criteria andIsupNotLike(String value) {
            addCriterion("isup not like", value, "isup");
            return (Criteria) this;
        }

        public Criteria andIsupIn(List<String> values) {
            addCriterion("isup in", values, "isup");
            return (Criteria) this;
        }

        public Criteria andIsupNotIn(List<String> values) {
            addCriterion("isup not in", values, "isup");
            return (Criteria) this;
        }

        public Criteria andIsupBetween(String value1, String value2) {
            addCriterion("isup between", value1, value2, "isup");
            return (Criteria) this;
        }

        public Criteria andIsupNotBetween(String value1, String value2) {
            addCriterion("isup not between", value1, value2, "isup");
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