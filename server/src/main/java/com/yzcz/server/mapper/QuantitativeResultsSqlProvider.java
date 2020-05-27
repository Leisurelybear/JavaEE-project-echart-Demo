package com.yzcz.server.mapper;

import com.yzcz.server.model.QuantitativeResults;
import com.yzcz.server.model.QuantitativeResultsExample.Criteria;
import com.yzcz.server.model.QuantitativeResultsExample.Criterion;
import com.yzcz.server.model.QuantitativeResultsExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class QuantitativeResultsSqlProvider {

    public String countByExample(QuantitativeResultsExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("quantitative_results");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(QuantitativeResultsExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("quantitative_results");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(QuantitativeResults record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("quantitative_results");
        
        if (record.getSampleName() != null) {
            sql.VALUES("sample_name", "#{sampleName,jdbcType=VARCHAR}");
        }
        
        if (record.getComponentName() != null) {
            sql.VALUES("component_name", "#{componentName,jdbcType=VARCHAR}");
        }
        
        if (record.getCalculatedConcentration() != null) {
            sql.VALUES("calculated_concentration", "#{calculatedConcentration,jdbcType=VARCHAR}");
        }
        
        if (record.getConcUnits() != null) {
            sql.VALUES("conc_units", "#{concUnits,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(QuantitativeResultsExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("sample_name");
        } else {
            sql.SELECT("sample_name");
        }
        sql.SELECT("component_name");
        sql.SELECT("calculated_concentration");
        sql.SELECT("conc_units");
        sql.FROM("quantitative_results");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        QuantitativeResults record = (QuantitativeResults) parameter.get("record");
        QuantitativeResultsExample example = (QuantitativeResultsExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("quantitative_results");
        
        if (record.getSampleName() != null) {
            sql.SET("sample_name = #{record.sampleName,jdbcType=VARCHAR}");
        }
        
        if (record.getComponentName() != null) {
            sql.SET("component_name = #{record.componentName,jdbcType=VARCHAR}");
        }
        
        if (record.getCalculatedConcentration() != null) {
            sql.SET("calculated_concentration = #{record.calculatedConcentration,jdbcType=VARCHAR}");
        }
        
        if (record.getConcUnits() != null) {
            sql.SET("conc_units = #{record.concUnits,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("quantitative_results");
        
        sql.SET("sample_name = #{record.sampleName,jdbcType=VARCHAR}");
        sql.SET("component_name = #{record.componentName,jdbcType=VARCHAR}");
        sql.SET("calculated_concentration = #{record.calculatedConcentration,jdbcType=VARCHAR}");
        sql.SET("conc_units = #{record.concUnits,jdbcType=VARCHAR}");
        
        QuantitativeResultsExample example = (QuantitativeResultsExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, QuantitativeResultsExample example, boolean includeExamplePhrase) {
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