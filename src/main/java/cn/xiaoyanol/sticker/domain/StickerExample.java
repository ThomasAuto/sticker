package cn.xiaoyanol.sticker.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StickerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public StickerExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andHappyUrlIsNull() {
            addCriterion("happy_url is null");
            return (Criteria) this;
        }

        public Criteria andHappyUrlIsNotNull() {
            addCriterion("happy_url is not null");
            return (Criteria) this;
        }

        public Criteria andHappyUrlEqualTo(String value) {
            addCriterion("happy_url =", value, "happyUrl");
            return (Criteria) this;
        }

        public Criteria andHappyUrlNotEqualTo(String value) {
            addCriterion("happy_url <>", value, "happyUrl");
            return (Criteria) this;
        }

        public Criteria andHappyUrlGreaterThan(String value) {
            addCriterion("happy_url >", value, "happyUrl");
            return (Criteria) this;
        }

        public Criteria andHappyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("happy_url >=", value, "happyUrl");
            return (Criteria) this;
        }

        public Criteria andHappyUrlLessThan(String value) {
            addCriterion("happy_url <", value, "happyUrl");
            return (Criteria) this;
        }

        public Criteria andHappyUrlLessThanOrEqualTo(String value) {
            addCriterion("happy_url <=", value, "happyUrl");
            return (Criteria) this;
        }

        public Criteria andHappyUrlLike(String value) {
            addCriterion("happy_url like", value, "happyUrl");
            return (Criteria) this;
        }

        public Criteria andHappyUrlNotLike(String value) {
            addCriterion("happy_url not like", value, "happyUrl");
            return (Criteria) this;
        }

        public Criteria andHappyUrlIn(List<String> values) {
            addCriterion("happy_url in", values, "happyUrl");
            return (Criteria) this;
        }

        public Criteria andHappyUrlNotIn(List<String> values) {
            addCriterion("happy_url not in", values, "happyUrl");
            return (Criteria) this;
        }

        public Criteria andHappyUrlBetween(String value1, String value2) {
            addCriterion("happy_url between", value1, value2, "happyUrl");
            return (Criteria) this;
        }

        public Criteria andHappyUrlNotBetween(String value1, String value2) {
            addCriterion("happy_url not between", value1, value2, "happyUrl");
            return (Criteria) this;
        }

        public Criteria andTodayUsedIsNull() {
            addCriterion("today_used is null");
            return (Criteria) this;
        }

        public Criteria andTodayUsedIsNotNull() {
            addCriterion("today_used is not null");
            return (Criteria) this;
        }

        public Criteria andTodayUsedEqualTo(Integer value) {
            addCriterion("today_used =", value, "todayUsed");
            return (Criteria) this;
        }

        public Criteria andTodayUsedNotEqualTo(Integer value) {
            addCriterion("today_used <>", value, "todayUsed");
            return (Criteria) this;
        }

        public Criteria andTodayUsedGreaterThan(Integer value) {
            addCriterion("today_used >", value, "todayUsed");
            return (Criteria) this;
        }

        public Criteria andTodayUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_used >=", value, "todayUsed");
            return (Criteria) this;
        }

        public Criteria andTodayUsedLessThan(Integer value) {
            addCriterion("today_used <", value, "todayUsed");
            return (Criteria) this;
        }

        public Criteria andTodayUsedLessThanOrEqualTo(Integer value) {
            addCriterion("today_used <=", value, "todayUsed");
            return (Criteria) this;
        }

        public Criteria andTodayUsedIn(List<Integer> values) {
            addCriterion("today_used in", values, "todayUsed");
            return (Criteria) this;
        }

        public Criteria andTodayUsedNotIn(List<Integer> values) {
            addCriterion("today_used not in", values, "todayUsed");
            return (Criteria) this;
        }

        public Criteria andTodayUsedBetween(Integer value1, Integer value2) {
            addCriterion("today_used between", value1, value2, "todayUsed");
            return (Criteria) this;
        }

        public Criteria andTodayUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("today_used not between", value1, value2, "todayUsed");
            return (Criteria) this;
        }

        public Criteria andUsedQuotaIsNull() {
            addCriterion("used_quota is null");
            return (Criteria) this;
        }

        public Criteria andUsedQuotaIsNotNull() {
            addCriterion("used_quota is not null");
            return (Criteria) this;
        }

        public Criteria andUsedQuotaEqualTo(Integer value) {
            addCriterion("used_quota =", value, "usedQuota");
            return (Criteria) this;
        }

        public Criteria andUsedQuotaNotEqualTo(Integer value) {
            addCriterion("used_quota <>", value, "usedQuota");
            return (Criteria) this;
        }

        public Criteria andUsedQuotaGreaterThan(Integer value) {
            addCriterion("used_quota >", value, "usedQuota");
            return (Criteria) this;
        }

        public Criteria andUsedQuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("used_quota >=", value, "usedQuota");
            return (Criteria) this;
        }

        public Criteria andUsedQuotaLessThan(Integer value) {
            addCriterion("used_quota <", value, "usedQuota");
            return (Criteria) this;
        }

        public Criteria andUsedQuotaLessThanOrEqualTo(Integer value) {
            addCriterion("used_quota <=", value, "usedQuota");
            return (Criteria) this;
        }

        public Criteria andUsedQuotaIn(List<Integer> values) {
            addCriterion("used_quota in", values, "usedQuota");
            return (Criteria) this;
        }

        public Criteria andUsedQuotaNotIn(List<Integer> values) {
            addCriterion("used_quota not in", values, "usedQuota");
            return (Criteria) this;
        }

        public Criteria andUsedQuotaBetween(Integer value1, Integer value2) {
            addCriterion("used_quota between", value1, value2, "usedQuota");
            return (Criteria) this;
        }

        public Criteria andUsedQuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("used_quota not between", value1, value2, "usedQuota");
            return (Criteria) this;
        }

        public Criteria andSurplusQuotaIsNull() {
            addCriterion("surplus_quota is null");
            return (Criteria) this;
        }

        public Criteria andSurplusQuotaIsNotNull() {
            addCriterion("surplus_quota is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusQuotaEqualTo(Integer value) {
            addCriterion("surplus_quota =", value, "surplusQuota");
            return (Criteria) this;
        }

        public Criteria andSurplusQuotaNotEqualTo(Integer value) {
            addCriterion("surplus_quota <>", value, "surplusQuota");
            return (Criteria) this;
        }

        public Criteria andSurplusQuotaGreaterThan(Integer value) {
            addCriterion("surplus_quota >", value, "surplusQuota");
            return (Criteria) this;
        }

        public Criteria andSurplusQuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("surplus_quota >=", value, "surplusQuota");
            return (Criteria) this;
        }

        public Criteria andSurplusQuotaLessThan(Integer value) {
            addCriterion("surplus_quota <", value, "surplusQuota");
            return (Criteria) this;
        }

        public Criteria andSurplusQuotaLessThanOrEqualTo(Integer value) {
            addCriterion("surplus_quota <=", value, "surplusQuota");
            return (Criteria) this;
        }

        public Criteria andSurplusQuotaIn(List<Integer> values) {
            addCriterion("surplus_quota in", values, "surplusQuota");
            return (Criteria) this;
        }

        public Criteria andSurplusQuotaNotIn(List<Integer> values) {
            addCriterion("surplus_quota not in", values, "surplusQuota");
            return (Criteria) this;
        }

        public Criteria andSurplusQuotaBetween(Integer value1, Integer value2) {
            addCriterion("surplus_quota between", value1, value2, "surplusQuota");
            return (Criteria) this;
        }

        public Criteria andSurplusQuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("surplus_quota not between", value1, value2, "surplusQuota");
            return (Criteria) this;
        }

        public Criteria andTotalQuotaIsNull() {
            addCriterion("total_quota is null");
            return (Criteria) this;
        }

        public Criteria andTotalQuotaIsNotNull() {
            addCriterion("total_quota is not null");
            return (Criteria) this;
        }

        public Criteria andTotalQuotaEqualTo(Integer value) {
            addCriterion("total_quota =", value, "totalQuota");
            return (Criteria) this;
        }

        public Criteria andTotalQuotaNotEqualTo(Integer value) {
            addCriterion("total_quota <>", value, "totalQuota");
            return (Criteria) this;
        }

        public Criteria andTotalQuotaGreaterThan(Integer value) {
            addCriterion("total_quota >", value, "totalQuota");
            return (Criteria) this;
        }

        public Criteria andTotalQuotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_quota >=", value, "totalQuota");
            return (Criteria) this;
        }

        public Criteria andTotalQuotaLessThan(Integer value) {
            addCriterion("total_quota <", value, "totalQuota");
            return (Criteria) this;
        }

        public Criteria andTotalQuotaLessThanOrEqualTo(Integer value) {
            addCriterion("total_quota <=", value, "totalQuota");
            return (Criteria) this;
        }

        public Criteria andTotalQuotaIn(List<Integer> values) {
            addCriterion("total_quota in", values, "totalQuota");
            return (Criteria) this;
        }

        public Criteria andTotalQuotaNotIn(List<Integer> values) {
            addCriterion("total_quota not in", values, "totalQuota");
            return (Criteria) this;
        }

        public Criteria andTotalQuotaBetween(Integer value1, Integer value2) {
            addCriterion("total_quota between", value1, value2, "totalQuota");
            return (Criteria) this;
        }

        public Criteria andTotalQuotaNotBetween(Integer value1, Integer value2) {
            addCriterion("total_quota not between", value1, value2, "totalQuota");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("utime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("utime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(Date value) {
            addCriterion("utime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(Date value) {
            addCriterion("utime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(Date value) {
            addCriterion("utime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("utime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(Date value) {
            addCriterion("utime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Date value) {
            addCriterion("utime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<Date> values) {
            addCriterion("utime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<Date> values) {
            addCriterion("utime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(Date value1, Date value2) {
            addCriterion("utime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(Date value1, Date value2) {
            addCriterion("utime not between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     */
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