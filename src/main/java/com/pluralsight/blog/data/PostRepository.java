package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource
public interface PostRepository extends JpaRepository<Post, Long> {

    @RestResource(rel="title-containing", path="titleContaining")
    List<Post> findByTitleContaining(String title);

}