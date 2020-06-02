package com.yzcz.server.mapper;

import com.yzcz.server.model.Compounds;
import com.yzcz.server.model.CompoundsExample;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface CompoundsMapper {
    @SelectProvider(type = CompoundsSqlProvider.class, method = "countByExample")
    long countByExample(CompoundsExample example);

    @DeleteProvider(type = CompoundsSqlProvider.class, method = "deleteByExample")
    int deleteByExample(CompoundsExample example);

    @Insert({
            "insert into compounds (english_name, chinese_name, ",
            "types)",
            "values (#{englishName,jdbcType=VARCHAR}, #{chineseName,jdbcType=VARCHAR}, ",
            "#{types,jdbcType=VARCHAR})"
    })
    int insert(Compounds record);

    @InsertProvider(type = CompoundsSqlProvider.class, method = "insertSelective")
    int insertSelective(Compounds record);

    @SelectProvider(type = CompoundsSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "english_name", property = "englishName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "chinese_name", property = "chineseName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "types", property = "types", jdbcType = JdbcType.VARCHAR)
    })
    List<Compounds> selectByExample(CompoundsExample example);

    @SelectProvider(type = CompoundsSqlProvider.class, method = "getItems")
    @Results({
            @Result(column = "english_name", property = "englishName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "chinese_name", property = "chineseName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "types", property = "types", jdbcType = JdbcType.VARCHAR)
    })
    List<Compounds> getItems(Integer page, Integer num, String like);

    @UpdateProvider(type = CompoundsSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Compounds record, @Param("example") CompoundsExample example);

    @UpdateProvider(type = CompoundsSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") Compounds record, @Param("example") CompoundsExample example);

}