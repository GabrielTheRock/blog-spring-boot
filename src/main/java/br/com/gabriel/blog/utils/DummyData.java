package br.com.gabriel.blog.utils;

import br.com.gabriel.blog.model.Post;
import br.com.gabriel.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    BlogRepository blogRepository;

    //@PostConstruct
    public void savePosts() {
        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setAutor("Gabriel");
        post1.setData(LocalDate.now());
        post1.setTitulo("Um texto qualquer em latim");
        post1.setTexto("Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...");

        Post post2 = new Post();
        post2.setAutor("Pedro");
        post2.setData(LocalDate.now());
        post2.setTitulo("Mudando a humanidade");
        post2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");

        Post post3 = new Post();
        post3.setAutor("Aline");
        post3.setData(LocalDate.now());
        post3.setTitulo("Sim");
        post3.setTexto("Aliquam in dui vel nulla eleifend posuere blandit vel mi.");

        postList.addAll(Arrays.asList(post1, post2, post3));

        for (Post post : postList) {
            Post postSaved = blogRepository.save(post);
            System.out.println("PostId: " + postSaved.getId());
        }
    }
}
