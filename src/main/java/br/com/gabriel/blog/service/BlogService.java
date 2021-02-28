package br.com.gabriel.blog.service;

import br.com.gabriel.blog.model.Post;

import java.util.List;

public interface BlogService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);
}
