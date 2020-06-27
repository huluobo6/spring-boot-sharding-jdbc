package com.huluobo.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huluobo.shardingjdbc.entity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
