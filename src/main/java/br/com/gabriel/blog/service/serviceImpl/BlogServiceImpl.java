package br.com.gabriel.blog.service.serviceImpl;

import br.com.gabriel.blog.model.Post;
import br.com.gabriel.blog.repository.BlogRepository;
import br.com.gabriel.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Post> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return blogRepository.getOne(id);
    }

    @Override
    public Post save(Post post) {
        return blogRepository.save(post);
    }
}
