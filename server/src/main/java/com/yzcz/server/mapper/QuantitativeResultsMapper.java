package com.yzcz.server.mapper;

import com.yzcz.server.model.QuantitativeResults;
import com.yzcz.server.model.QuantitativeResultsExample;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface QuantitativeResultsMapper {
    @SelectProvider(type = QuantitativeResultsSqlProvider.class, method = "countByExample")
    long countByExample(QuantitativeResultsExample example);

    @DeleteProvider(type = QuantitativeResultsSqlProvider.class, method = "deleteByExample")
    int deleteByExample(QuantitativeResultsExample example);

    @Insert({
            "insert into quantitative_results (sample_name, component_name, ",
            "calculated_concentration, conc_units)",
            "values (#{sampleName,jdbcType=VARCHAR}, #{componentName,jdbcType=VARCHAR}, ",
            "#{calculatedConcentration,jdbcType=VARCHAR}, #{concUnits,jdbcType=VARCHAR})"
    })
    int insert(QuantitativeResults record);

    @Select({
            "SELECT mi.component_name ",
            "FROM marking_information mi ",
            "GROUP BY mi.component_name;"
    })
    List<String> getComponentNames();

    @InsertProvider(type = QuantitativeResultsSqlProvider.class, method = "insertSelective")
    int insertSelective(QuantitativeResults record);

    @SelectProvider(type = QuantitativeResultsSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "sample_name", property = "sampleName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "component_name", property = "componentName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "calculated_concentration", property = "calculatedConcentration", jdbcType = JdbcType.VARCHAR),
            @Result(column = "conc_units", property = "concUnits", jdbcType = JdbcType.VARCHAR)
    })
    List<QuantitativeResults> selectByExample(QuantitativeResultsExample example);

    @UpdateProvider(type = QuantitativeResultsSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") QuantitativeResults record, @Param("example") QuantitativeResultsExample example);

    @UpdateProvider(type = QuantitativeResultsSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") QuantitativeResults record, @Param("example") QuantitativeResultsExample example);
}