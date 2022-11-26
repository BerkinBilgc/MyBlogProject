package com.berknbilgc.business.services;

import com.berknbilgc.business.dto.BlogDto;
import com.berknbilgc.data.entity.BlogEntity;

import java.util.List;
import java.util.Map;
public interface IBlogServices {

    BlogDto entityToDto(BlogEntity blogEntity);

    BlogEntity dtoToEntity(BlogDto blogDto);

    //CREATE
    BlogDto createBlog(BlogDto blogDto);

    //LIST
    List<BlogDto> listBlog();

    //FIND
    BlogDto findBlog(Long id);

    //DELETE
    Map<String,Boolean> deleteBlog( Long id);

    //UPDATE
    BlogDto updateBlog(Long id, BlogDto blogDto);

}
