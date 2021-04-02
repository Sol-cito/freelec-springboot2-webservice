package com.solcito.springboot.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup() { // 테스트 종료 후(After) 동작 지정
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기(){ //빌더패턴으로 test post repository 생성 후 save(게시글저장) 테스트
        String title = "테스트 title";
        String content = "테스트 content";

        postsRepository.save(Posts.builder() // save는 insert(id값이 없을 때)/update(id값이 있을 때) 쿼리를 실행함
                .title(title)
                .content(content)
                .author("TestAuthor")
                .build());

        List<Posts> postsList = postsRepository.findAll(); // Table의 모든 데이터 조회

        Posts posts = postsList.get(0);
        assertThat(posts.getTitle().equals(title));
        assertThat(posts.getContent().equals(content));
    }
}
