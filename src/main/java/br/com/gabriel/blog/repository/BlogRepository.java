package br.com.gabriel.blog.repository;

import br.com.gabriel.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Post, Long> {

}
