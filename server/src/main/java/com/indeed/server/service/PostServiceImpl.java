package com.indeed.server.service;

import com.indeed.server.DAO.PostDao;
import com.indeed.server.dto.PostDTO;
import com.indeed.server.model.PostModel;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {

    @Autowired
    PostDao postDao;

    @Override
    public PostModel savePost(PostDTO postDTO) {
        PostModel postModel = new PostModel();

        postModel.setProfile(postDTO.getProfile());
        postModel.setDescription(postDTO.getDescription());
        postModel.setType(postDTO.getType());
        postModel.setExperience(postDTO.getExperience());
        postModel.setSalary(postDTO.getSalary());

       return postDao.save(postModel);
    }
}
