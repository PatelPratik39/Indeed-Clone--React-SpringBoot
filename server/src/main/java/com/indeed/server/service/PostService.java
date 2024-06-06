package com.indeed.server.service;

import com.indeed.server.dto.PostDTO;
import com.indeed.server.model.PostModel;
import java.util.List;


//    Abstract method goes here in service

public interface PostService {

    public PostModel savePost(PostDTO postDTO);

    public List<PostModel> getAllPosts();
}
