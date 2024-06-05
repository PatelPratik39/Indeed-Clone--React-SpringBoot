package com.indeed.server.controller;

import com.indeed.server.dto.PostDTO;
import com.indeed.server.model.PostModel;
import com.indeed.server.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin("*")
public class PostController {

    final PostService postService;

    @PostMapping("/post")
    public PostModel savePost(@Validated @RequestBody PostDTO postDTO){
        log.info("Saving Post #########");
        return this.postService.savePost(postDTO);
    }
}
