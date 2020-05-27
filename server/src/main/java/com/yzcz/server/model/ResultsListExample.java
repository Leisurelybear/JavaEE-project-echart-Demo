package com.yzcz.server.model;

import java.util.ArrayList;
import java.util.List;

public class ResultsListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResultsListExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andS1IsNull() {
            addCriterion("S1 is null");
            return (Criteria) this;
        }

        public Criteria andS1IsNotNull() {
            addCriterion("S1 is not null");
            return (Criteria) this;
        }

        public Criteria andS1EqualTo(String value) {
            addCriterion("S1 =", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotEqualTo(String value) {
            addCriterion("S1 <>", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1GreaterThan(String value) {
            addCriterion("S1 >", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1GreaterThanOrEqualTo(String value) {
            addCriterion("S1 >=", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1LessThan(String value) {
            addCriterion("S1 <", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1LessThanOrEqualTo(String value) {
            addCriterion("S1 <=", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1Like(String value) {
            addCriterion("S1 like", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotLike(String value) {
            addCriterion("S1 not like", value, "s1");
            return (Criteria) this;
        }

        public Criteria andS1In(List<String> values) {
            addCriterion("S1 in", values, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotIn(List<String> values) {
            addCriterion("S1 not in", values, "s1");
            return (Criteria) this;
        }

        public Criteria andS1Between(String value1, String value2) {
            addCriterion("S1 between", value1, value2, "s1");
            return (Criteria) this;
        }

        public Criteria andS1NotBetween(String value1, String value2) {
            addCriterion("S1 not between", value1, value2, "s1");
            return (Criteria) this;
        }

        public Criteria andS2IsNull() {
            addCriterion("S2 is null");
            return (Criteria) this;
        }

        public Criteria andS2IsNotNull() {
            addCriterion("S2 is not null");
            return (Criteria) this;
        }

        public Criteria andS2EqualTo(String value) {
            addCriterion("S2 =", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotEqualTo(String value) {
            addCriterion("S2 <>", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2GreaterThan(String value) {
            addCriterion("S2 >", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2GreaterThanOrEqualTo(String value) {
            addCriterion("S2 >=", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2LessThan(String value) {
            addCriterion("S2 <", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2LessThanOrEqualTo(String value) {
            addCriterion("S2 <=", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2Like(String value) {
            addCriterion("S2 like", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotLike(String value) {
            addCriterion("S2 not like", value, "s2");
            return (Criteria) this;
        }

        public Criteria andS2In(List<String> values) {
            addCriterion("S2 in", values, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotIn(List<String> values) {
            addCriterion("S2 not in", values, "s2");
            return (Criteria) this;
        }

        public Criteria andS2Between(String value1, String value2) {
            addCriterion("S2 between", value1, value2, "s2");
            return (Criteria) this;
        }

        public Criteria andS2NotBetween(String value1, String value2) {
            addCriterion("S2 not between", value1, value2, "s2");
            return (Criteria) this;
        }

        public Criteria andS3IsNull() {
            addCriterion("S3 is null");
            return (Criteria) this;
        }

        public Criteria andS3IsNotNull() {
            addCriterion("S3 is not null");
            return (Criteria) this;
        }

        public Criteria andS3EqualTo(String value) {
            addCriterion("S3 =", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotEqualTo(String value) {
            addCriterion("S3 <>", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3GreaterThan(String value) {
            addCriterion("S3 >", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3GreaterThanOrEqualTo(String value) {
            addCriterion("S3 >=", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3LessThan(String value) {
            addCriterion("S3 <", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3LessThanOrEqualTo(String value) {
            addCriterion("S3 <=", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3Like(String value) {
            addCriterion("S3 like", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotLike(String value) {
            addCriterion("S3 not like", value, "s3");
            return (Criteria) this;
        }

        public Criteria andS3In(List<String> values) {
            addCriterion("S3 in", values, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotIn(List<String> values) {
            addCriterion("S3 not in", values, "s3");
            return (Criteria) this;
        }

        public Criteria andS3Between(String value1, String value2) {
            addCriterion("S3 between", value1, value2, "s3");
            return (Criteria) this;
        }

        public Criteria andS3NotBetween(String value1, String value2) {
            addCriterion("S3 not between", value1, value2, "s3");
            return (Criteria) this;
        }

        public Criteria andS4IsNull() {
            addCriterion("S4 is null");
            return (Criteria) this;
        }

        public Criteria andS4IsNotNull() {
            addCriterion("S4 is not null");
            return (Criteria) this;
        }

        public Criteria andS4EqualTo(String value) {
            addCriterion("S4 =", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotEqualTo(String value) {
            addCriterion("S4 <>", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4GreaterThan(String value) {
            addCriterion("S4 >", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4GreaterThanOrEqualTo(String value) {
            addCriterion("S4 >=", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4LessThan(String value) {
            addCriterion("S4 <", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4LessThanOrEqualTo(String value) {
            addCriterion("S4 <=", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4Like(String value) {
            addCriterion("S4 like", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotLike(String value) {
            addCriterion("S4 not like", value, "s4");
            return (Criteria) this;
        }

        public Criteria andS4In(List<String> values) {
            addCriterion("S4 in", values, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotIn(List<String> values) {
            addCriterion("S4 not in", values, "s4");
            return (Criteria) this;
        }

        public Criteria andS4Between(String value1, String value2) {
            addCriterion("S4 between", value1, value2, "s4");
            return (Criteria) this;
        }

        public Criteria andS4NotBetween(String value1, String value2) {
            addCriterion("S4 not between", value1, value2, "s4");
            return (Criteria) this;
        }

        public Criteria andS5IsNull() {
            addCriterion("S5 is null");
            return (Criteria) this;
        }

        public Criteria andS5IsNotNull() {
            addCriterion("S5 is not null");
            return (Criteria) this;
        }

        public Criteria andS5EqualTo(String value) {
            addCriterion("S5 =", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotEqualTo(String value) {
            addCriterion("S5 <>", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5GreaterThan(String value) {
            addCriterion("S5 >", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5GreaterThanOrEqualTo(String value) {
            addCriterion("S5 >=", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5LessThan(String value) {
            addCriterion("S5 <", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5LessThanOrEqualTo(String value) {
            addCriterion("S5 <=", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5Like(String value) {
            addCriterion("S5 like", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotLike(String value) {
            addCriterion("S5 not like", value, "s5");
            return (Criteria) this;
        }

        public Criteria andS5In(List<String> values) {
            addCriterion("S5 in", values, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotIn(List<String> values) {
            addCriterion("S5 not in", values, "s5");
            return (Criteria) this;
        }

        public Criteria andS5Between(String value1, String value2) {
            addCriterion("S5 between", value1, value2, "s5");
            return (Criteria) this;
        }

        public Criteria andS5NotBetween(String value1, String value2) {
            addCriterion("S5 not between", value1, value2, "s5");
            return (Criteria) this;
        }

        public Criteria andS6IsNull() {
            addCriterion("S6 is null");
            return (Criteria) this;
        }

        public Criteria andS6IsNotNull() {
            addCriterion("S6 is not null");
            return (Criteria) this;
        }

        public Criteria andS6EqualTo(String value) {
            addCriterion("S6 =", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6NotEqualTo(String value) {
            addCriterion("S6 <>", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6GreaterThan(String value) {
            addCriterion("S6 >", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6GreaterThanOrEqualTo(String value) {
            addCriterion("S6 >=", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6LessThan(String value) {
            addCriterion("S6 <", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6LessThanOrEqualTo(String value) {
            addCriterion("S6 <=", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6Like(String value) {
            addCriterion("S6 like", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6NotLike(String value) {
            addCriterion("S6 not like", value, "s6");
            return (Criteria) this;
        }

        public Criteria andS6In(List<String> values) {
            addCriterion("S6 in", values, "s6");
            return (Criteria) this;
        }

        public Criteria andS6NotIn(List<String> values) {
            addCriterion("S6 not in", values, "s6");
            return (Criteria) this;
        }

        public Criteria andS6Between(String value1, String value2) {
            addCriterion("S6 between", value1, value2, "s6");
            return (Criteria) this;
        }

        public Criteria andS6NotBetween(String value1, String value2) {
            addCriterion("S6 not between", value1, value2, "s6");
            return (Criteria) this;
        }

        public Criteria andS7IsNull() {
            addCriterion("S7 is null");
            return (Criteria) this;
        }

        public Criteria andS7IsNotNull() {
            addCriterion("S7 is not null");
            return (Criteria) this;
        }

        public Criteria andS7EqualTo(String value) {
            addCriterion("S7 =", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7NotEqualTo(String value) {
            addCriterion("S7 <>", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7GreaterThan(String value) {
            addCriterion("S7 >", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7GreaterThanOrEqualTo(String value) {
            addCriterion("S7 >=", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7LessThan(String value) {
            addCriterion("S7 <", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7LessThanOrEqualTo(String value) {
            addCriterion("S7 <=", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7Like(String value) {
            addCriterion("S7 like", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7NotLike(String value) {
            addCriterion("S7 not like", value, "s7");
            return (Criteria) this;
        }

        public Criteria andS7In(List<String> values) {
            addCriterion("S7 in", values, "s7");
            return (Criteria) this;
        }

        public Criteria andS7NotIn(List<String> values) {
            addCriterion("S7 not in", values, "s7");
            return (Criteria) this;
        }

        public Criteria andS7Between(String value1, String value2) {
            addCriterion("S7 between", value1, value2, "s7");
            return (Criteria) this;
        }

        public Criteria andS7NotBetween(String value1, String value2) {
            addCriterion("S7 not between", value1, value2, "s7");
            return (Criteria) this;
        }

        public Criteria andS8IsNull() {
            addCriterion("S8 is null");
            return (Criteria) this;
        }

        public Criteria andS8IsNotNull() {
            addCriterion("S8 is not null");
            return (Criteria) this;
        }

        public Criteria andS8EqualTo(String value) {
            addCriterion("S8 =", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8NotEqualTo(String value) {
            addCriterion("S8 <>", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8GreaterThan(String value) {
            addCriterion("S8 >", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8GreaterThanOrEqualTo(String value) {
            addCriterion("S8 >=", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8LessThan(String value) {
            addCriterion("S8 <", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8LessThanOrEqualTo(String value) {
            addCriterion("S8 <=", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8Like(String value) {
            addCriterion("S8 like", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8NotLike(String value) {
            addCriterion("S8 not like", value, "s8");
            return (Criteria) this;
        }

        public Criteria andS8In(List<String> values) {
            addCriterion("S8 in", values, "s8");
            return (Criteria) this;
        }

        public Criteria andS8NotIn(List<String> values) {
            addCriterion("S8 not in", values, "s8");
            return (Criteria) this;
        }

        public Criteria andS8Between(String value1, String value2) {
            addCriterion("S8 between", value1, value2, "s8");
            return (Criteria) this;
        }

        public Criteria andS8NotBetween(String value1, String value2) {
            addCriterion("S8 not between", value1, value2, "s8");
            return (Criteria) this;
        }

        public Criteria andS9IsNull() {
            addCriterion("S9 is null");
            return (Criteria) this;
        }

        public Criteria andS9IsNotNull() {
            addCriterion("S9 is not null");
            return (Criteria) this;
        }

        public Criteria andS9EqualTo(String value) {
            addCriterion("S9 =", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9NotEqualTo(String value) {
            addCriterion("S9 <>", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9GreaterThan(String value) {
            addCriterion("S9 >", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9GreaterThanOrEqualTo(String value) {
            addCriterion("S9 >=", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9LessThan(String value) {
            addCriterion("S9 <", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9LessThanOrEqualTo(String value) {
            addCriterion("S9 <=", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9Like(String value) {
            addCriterion("S9 like", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9NotLike(String value) {
            addCriterion("S9 not like", value, "s9");
            return (Criteria) this;
        }

        public Criteria andS9In(List<String> values) {
            addCriterion("S9 in", values, "s9");
            return (Criteria) this;
        }

        public Criteria andS9NotIn(List<String> values) {
            addCriterion("S9 not in", values, "s9");
            return (Criteria) this;
        }

        public Criteria andS9Between(String value1, String value2) {
            addCriterion("S9 between", value1, value2, "s9");
            return (Criteria) this;
        }

        public Criteria andS9NotBetween(String value1, String value2) {
            addCriterion("S9 not between", value1, value2, "s9");
            return (Criteria) this;
        }

        public Criteria andS10IsNull() {
            addCriterion("S10 is null");
            return (Criteria) this;
        }

        public Criteria andS10IsNotNull() {
            addCriterion("S10 is not null");
            return (Criteria) this;
        }

        public Criteria andS10EqualTo(String value) {
            addCriterion("S10 =", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10NotEqualTo(String value) {
            addCriterion("S10 <>", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10GreaterThan(String value) {
            addCriterion("S10 >", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10GreaterThanOrEqualTo(String value) {
            addCriterion("S10 >=", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10LessThan(String value) {
            addCriterion("S10 <", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10LessThanOrEqualTo(String value) {
            addCriterion("S10 <=", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10Like(String value) {
            addCriterion("S10 like", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10NotLike(String value) {
            addCriterion("S10 not like", value, "s10");
            return (Criteria) this;
        }

        public Criteria andS10In(List<String> values) {
            addCriterion("S10 in", values, "s10");
            return (Criteria) this;
        }

        public Criteria andS10NotIn(List<String> values) {
            addCriterion("S10 not in", values, "s10");
            return (Criteria) this;
        }

        public Criteria andS10Between(String value1, String value2) {
            addCriterion("S10 between", value1, value2, "s10");
            return (Criteria) this;
        }

        public Criteria andS10NotBetween(String value1, String value2) {
            addCriterion("S10 not between", value1, value2, "s10");
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