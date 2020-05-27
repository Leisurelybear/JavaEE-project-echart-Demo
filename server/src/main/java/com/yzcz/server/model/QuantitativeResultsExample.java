package com.yzcz.server.model;

import java.util.ArrayList;
import java.util.List;

public class QuantitativeResultsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuantitativeResultsExample() {
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

        public Criteria andSampleNameIsNull() {
            addCriterion("sample_name is null");
            return (Criteria) this;
        }

        public Criteria andSampleNameIsNotNull() {
            addCriterion("sample_name is not null");
            return (Criteria) this;
        }

        public Criteria andSampleNameEqualTo(String value) {
            addCriterion("sample_name =", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotEqualTo(String value) {
            addCriterion("sample_name <>", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameGreaterThan(String value) {
            addCriterion("sample_name >", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameGreaterThanOrEqualTo(String value) {
            addCriterion("sample_name >=", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLessThan(String value) {
            addCriterion("sample_name <", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLessThanOrEqualTo(String value) {
            addCriterion("sample_name <=", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLike(String value) {
            addCriterion("sample_name like", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotLike(String value) {
            addCriterion("sample_name not like", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameIn(List<String> values) {
            addCriterion("sample_name in", values, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotIn(List<String> values) {
            addCriterion("sample_name not in", values, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameBetween(String value1, String value2) {
            addCriterion("sample_name between", value1, value2, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotBetween(String value1, String value2) {
            addCriterion("sample_name not between", value1, value2, "sampleName");
            return (Criteria) this;
        }

        public Criteria andComponentNameIsNull() {
            addCriterion("component_name is null");
            return (Criteria) this;
        }

        public Criteria andComponentNameIsNotNull() {
            addCriterion("component_name is not null");
            return (Criteria) this;
        }

        public Criteria andComponentNameEqualTo(String value) {
            addCriterion("component_name =", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameNotEqualTo(String value) {
            addCriterion("component_name <>", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameGreaterThan(String value) {
            addCriterion("component_name >", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameGreaterThanOrEqualTo(String value) {
            addCriterion("component_name >=", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameLessThan(String value) {
            addCriterion("component_name <", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameLessThanOrEqualTo(String value) {
            addCriterion("component_name <=", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameLike(String value) {
            addCriterion("component_name like", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameNotLike(String value) {
            addCriterion("component_name not like", value, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameIn(List<String> values) {
            addCriterion("component_name in", values, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameNotIn(List<String> values) {
            addCriterion("component_name not in", values, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameBetween(String value1, String value2) {
            addCriterion("component_name between", value1, value2, "componentName");
            return (Criteria) this;
        }

        public Criteria andComponentNameNotBetween(String value1, String value2) {
            addCriterion("component_name not between", value1, value2, "componentName");
            return (Criteria) this;
        }

        public Criteria andCalculatedConcentrationIsNull() {
            addCriterion("calculated_concentration is null");
            return (Criteria) this;
        }

        public Criteria andCalculatedConcentrationIsNotNull() {
            addCriterion("calculated_concentration is not null");
            return (Criteria) this;
        }

        public Criteria andCalculatedConcentrationEqualTo(String value) {
            addCriterion("calculated_concentration =", value, "calculatedConcentration");
            return (Criteria) this;
        }

        public Criteria andCalculatedConcentrationNotEqualTo(String value) {
            addCriterion("calculated_concentration <>", value, "calculatedConcentration");
            return (Criteria) this;
        }

        public Criteria andCalculatedConcentrationGreaterThan(String value) {
            addCriterion("calculated_concentration >", value, "calculatedConcentration");
            return (Criteria) this;
        }

        public Criteria andCalculatedConcentrationGreaterThanOrEqualTo(String value) {
            addCriterion("calculated_concentration >=", value, "calculatedConcentration");
            return (Criteria) this;
        }

        public Criteria andCalculatedConcentrationLessThan(String value) {
            addCriterion("calculated_concentration <", value, "calculatedConcentration");
            return (Criteria) this;
        }

        public Criteria andCalculatedConcentrationLessThanOrEqualTo(String value) {
            addCriterion("calculated_concentration <=", value, "calculatedConcentration");
            return (Criteria) this;
        }

        public Criteria andCalculatedConcentrationLike(String value) {
            addCriterion("calculated_concentration like", value, "calculatedConcentration");
            return (Criteria) this;
        }

        public Criteria andCalculatedConcentrationNotLike(String value) {
            addCriterion("calculated_concentration not like", value, "calculatedConcentration");
            return (Criteria) this;
        }

        public Criteria andCalculatedConcentrationIn(List<String> values) {
            addCriterion("calculated_concentration in", values, "calculatedConcentration");
            return (Criteria) this;
        }

        public Criteria andCalculatedConcentrationNotIn(List<String> values) {
            addCriterion("calculated_concentration not in", values, "calculatedConcentration");
            return (Criteria) this;
        }

        public Criteria andCalculatedConcentrationBetween(String value1, String value2) {
            addCriterion("calculated_concentration between", value1, value2, "calculatedConcentration");
            return (Criteria) this;
        }

        public Criteria andCalculatedConcentrationNotBetween(String value1, String value2) {
            addCriterion("calculated_concentration not between", value1, value2, "calculatedConcentration");
            return (Criteria) this;
        }

        public Criteria andConcUnitsIsNull() {
            addCriterion("conc_units is null");
            return (Criteria) this;
        }

        public Criteria andConcUnitsIsNotNull() {
            addCriterion("conc_units is not null");
            return (Criteria) this;
        }

        public Criteria andConcUnitsEqualTo(String value) {
            addCriterion("conc_units =", value, "concUnits");
            return (Criteria) this;
        }

        public Criteria andConcUnitsNotEqualTo(String value) {
            addCriterion("conc_units <>", value, "concUnits");
            return (Criteria) this;
        }

        public Criteria andConcUnitsGreaterThan(String value) {
            addCriterion("conc_units >", value, "concUnits");
            return (Criteria) this;
        }

        public Criteria andConcUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("conc_units >=", value, "concUnits");
            return (Criteria) this;
        }

        public Criteria andConcUnitsLessThan(String value) {
            addCriterion("conc_units <", value, "concUnits");
            return (Criteria) this;
        }

        public Criteria andConcUnitsLessThanOrEqualTo(String value) {
            addCriterion("conc_units <=", value, "concUnits");
            return (Criteria) this;
        }

        public Criteria andConcUnitsLike(String value) {
            addCriterion("conc_units like", value, "concUnits");
            return (Criteria) this;
        }

        public Criteria andConcUnitsNotLike(String value) {
            addCriterion("conc_units not like", value, "concUnits");
            return (Criteria) this;
        }

        public Criteria andConcUnitsIn(List<String> values) {
            addCriterion("conc_units in", values, "concUnits");
            return (Criteria) this;
        }

        public Criteria andConcUnitsNotIn(List<String> values) {
            addCriterion("conc_units not in", values, "concUnits");
            return (Criteria) this;
        }

        public Criteria andConcUnitsBetween(String value1, String value2) {
            addCriterion("conc_units between", value1, value2, "concUnits");
            return (Criteria) this;
        }

        public Criteria andConcUnitsNotBetween(String value1, String value2) {
            addCriterion("conc_units not between", value1, value2, "concUnits");
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