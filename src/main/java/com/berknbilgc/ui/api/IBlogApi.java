package com.berknbilgc.ui.api;

import com.berknbilgc.business.dto.BlogDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

public interface IBlogApi {
    //CREATE
    ResponseEntity<?> createBlog(BlogDto blogDto);
    //LIST
    ResponseEntity<List<BlogDto>>  listBlog();

    //FIND
    ResponseEntity<BlogDto> findBlog(Long id);

    //UPDATE
    ResponseEntity<BlogDto>  updateBlog(Long id, BlogDto blogDto);
    //DELETE
    ResponseEntity <Map<String, Boolean>> deleteBlog( Long id);


}
