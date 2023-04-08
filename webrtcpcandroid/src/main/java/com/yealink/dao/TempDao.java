package com.yealink.dao;

import com.yealink.pojo.Temp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @date 2018/3/16 15:35
 */
@Mapper
public interface TempDao {
    public Integer saveTemp(Temp temp);
    public Integer saveTempList(List<Temp> invited);
    public Temp getTemp(Temp temp);
}
