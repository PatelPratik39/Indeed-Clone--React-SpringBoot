package com.indeed.server.controller;

import com.indeed.server.constants.APIConstant;
import com.indeed.server.dto.PostDTO;
import com.indeed.server.model.PostModel;
import com.indeed.server.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin("*")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping(APIConstant.SAVE_POST)
    public PostModel savePost(@Valid @RequestBody PostDTO postDTO){
        log.info("Saving Post #########");
        return this.postService.savePost(postDTO);
    }

  @GetMapping(APIConstant.GET_ALL_POSTS)
    public List<PostModel> getAllPosts(){
        log.info("Getting all Posts");
        return this.postService.getAllPosts();
  }
}
