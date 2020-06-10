package com.yzcz.server.mapper;

import com.yzcz.server.model.Compounds;
import com.yzcz.server.model.Experiment;
import com.yzcz.server.model.ExperimentExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface ExperimentMapper {
    @SelectProvider(type=ExperimentSqlProvider.class, method="countByExample")
    long countByExample(ExperimentExample example);

    @DeleteProvider(type=ExperimentSqlProvider.class, method="deleteByExample")
    int deleteByExample(ExperimentExample example);

    @Delete({
        "delete from experiment",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into experiment (id, name, ",
        "test_id, value)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{testId,jdbcType=VARCHAR}, #{value,jdbcType=VARCHAR})"
    })
    int insert(Experiment record);

    @InsertProvider(type=ExperimentSqlProvider.class, method="insertSelective")
    int insertSelective(Experiment record);

    @SelectProvider(type=ExperimentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="test_id", property="testId", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR)
    })
    List<Experiment> selectByExample(ExperimentExample example);

    @Select({
        "select",
        "id, name, test_id, value",
        "from experiment",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="test_id", property="testId", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR)
    })
    Experiment selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ExperimentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Experiment record, @Param("example") ExperimentExample example);

    @UpdateProvider(type=ExperimentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Experiment record, @Param("example") ExperimentExample example);

    @UpdateProvider(type=ExperimentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Experiment record);

    @Update({
        "update experiment",
        "set name = #{name,jdbcType=VARCHAR},",
          "test_id = #{testId,jdbcType=VARCHAR},",
          "value = #{value,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Experiment record);


    @SelectProvider(type = ExperimentSqlProvider.class, method = "getItems")
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
            @Result(column="test_id", property="testId", jdbcType=JdbcType.VARCHAR),
            @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR)
    })
    List<Experiment> getItems(Integer page, Integer num, String like);
}