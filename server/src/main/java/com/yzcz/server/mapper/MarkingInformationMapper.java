package com.yzcz.server.mapper;

import com.yzcz.server.model.MarkingInformation;
import com.yzcz.server.model.MarkingInformationExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface MarkingInformationMapper {
    @SelectProvider(type=MarkingInformationSqlProvider.class, method="countByExample")
    long countByExample(MarkingInformationExample example);

    @DeleteProvider(type=MarkingInformationSqlProvider.class, method="deleteByExample")
    int deleteByExample(MarkingInformationExample example);




    @Insert({
        "insert into marking_information (sample_name, component_name, ",
        "actual_concentration, conc_units, ",
        "area, accuracy)",
        "values (#{sampleName,jdbcType=VARCHAR}, #{componentName,jdbcType=VARCHAR}, ",
        "#{actualConcentration,jdbcType=VARCHAR}, #{concUnits,jdbcType=VARCHAR}, ",
        "#{area,jdbcType=VARCHAR}, #{accuracy,jdbcType=VARCHAR})"
    })
    int insert(MarkingInformation record);

    @InsertProvider(type=MarkingInformationSqlProvider.class, method="insertSelective")
    int insertSelective(MarkingInformation record);

    @SelectProvider(type=MarkingInformationSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sample_name", property="sampleName", jdbcType=JdbcType.VARCHAR),
        @Result(column="component_name", property="componentName", jdbcType=JdbcType.VARCHAR),
        @Result(column="actual_concentration", property="actualConcentration", jdbcType=JdbcType.VARCHAR),
        @Result(column="conc_units", property="concUnits", jdbcType=JdbcType.VARCHAR),
        @Result(column="area", property="area", jdbcType=JdbcType.VARCHAR),
        @Result(column="accuracy", property="accuracy", jdbcType=JdbcType.VARCHAR)
    })
    List<MarkingInformation> selectByExample(MarkingInformationExample example);

    @UpdateProvider(type=MarkingInformationSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") MarkingInformation record, @Param("example") MarkingInformationExample example);

    @UpdateProvider(type=MarkingInformationSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") MarkingInformation record, @Param("example") MarkingInformationExample example);

    @Select({
            "SELECT mi.component_name ",
            "FROM marking_information mi ",
            "GROUP BY mi.component_name;"
    })
    List<String> getComponentNames();
}