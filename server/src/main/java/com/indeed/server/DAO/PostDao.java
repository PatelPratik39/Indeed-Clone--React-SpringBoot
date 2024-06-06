package com.indeed.server.DAO;

import com.indeed.server.model.PostModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostDao extends MongoRepository<PostModel, String> {
    // No custom query methods that add `locale`
}
