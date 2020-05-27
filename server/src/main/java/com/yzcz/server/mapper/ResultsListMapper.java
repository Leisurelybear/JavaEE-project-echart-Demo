package com.yzcz.server.mapper;

import com.yzcz.server.model.ResultsList;
import com.yzcz.server.model.ResultsListExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ResultsListMapper {
    @SelectProvider(type=ResultsListSqlProvider.class, method="countByExample")
    long countByExample(ResultsListExample example);

    @DeleteProvider(type=ResultsListSqlProvider.class, method="deleteByExample")
    int deleteByExample(ResultsListExample example);

    @Insert({
        "insert into results_list (id, S1, ",
        "S2, S3, S4, ",
        "S5, S6, S7, ",
        "S8, S9, S10)",
        "values (#{id,jdbcType=VARCHAR}, #{s1,jdbcType=VARCHAR}, ",
        "#{s2,jdbcType=VARCHAR}, #{s3,jdbcType=VARCHAR}, #{s4,jdbcType=VARCHAR}, ",
        "#{s5,jdbcType=VARCHAR}, #{s6,jdbcType=VARCHAR}, #{s7,jdbcType=VARCHAR}, ",
        "#{s8,jdbcType=VARCHAR}, #{s9,jdbcType=VARCHAR}, #{s10,jdbcType=VARCHAR})"
    })
    int insert(ResultsList record);

    @InsertProvider(type=ResultsListSqlProvider.class, method="insertSelective")
    int insertSelective(ResultsList record);

    @SelectProvider(type=ResultsListSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR),
        @Result(column="S1", property="s1", jdbcType=JdbcType.VARCHAR),
        @Result(column="S2", property="s2", jdbcType=JdbcType.VARCHAR),
        @Result(column="S3", property="s3", jdbcType=JdbcType.VARCHAR),
        @Result(column="S4", property="s4", jdbcType=JdbcType.VARCHAR),
        @Result(column="S5", property="s5", jdbcType=JdbcType.VARCHAR),
        @Result(column="S6", property="s6", jdbcType=JdbcType.VARCHAR),
        @Result(column="S7", property="s7", jdbcType=JdbcType.VARCHAR),
        @Result(column="S8", property="s8", jdbcType=JdbcType.VARCHAR),
        @Result(column="S9", property="s9", jdbcType=JdbcType.VARCHAR),
        @Result(column="S10", property="s10", jdbcType=JdbcType.VARCHAR)
    })
    List<ResultsList> selectByExample(ResultsListExample example);

    @UpdateProvider(type=ResultsListSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ResultsList record, @Param("example") ResultsListExample example);

    @UpdateProvider(type=ResultsListSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ResultsList record, @Param("example") ResultsListExample example);
}