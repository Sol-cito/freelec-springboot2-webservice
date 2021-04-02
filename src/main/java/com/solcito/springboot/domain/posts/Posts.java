package com.solcito.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


/*
 *
 * 게시판 글 Class
 * 실제 게시판 Table과 매칭된 Entity 클래스이다.
 *
 * Key : id
 * Column : title, content, author
 *
 * Entity 클래스에서는 Setter 메소드를 만들지 않는다.
 * 해당 인스턴스 값들이 언제 어디서 변해야 하는지 코드상으로 구분할 수 없기 때문이다.
 * DB에 값을 넣을 때는 Setter 대신 public 메소드를 활용하고,
 * 값을 채울 때는 @Builder 를 활용한다.
 *
 * */

@Getter // lombok - 클래스 내 모든 Getter 메소드 자동 생성
@NoArgsConstructor // lombok - 기본 생성자 자동 추가
@Entity // JPA 어노테이션 - Table과 연결될 클래스임을 나타냄(Table - Entity)
public class Posts {

    @Id // JPA 어노테이션 - 해당 Table의 PK임을 나타냄 => 없으면 class 자체 에러뜸
    @GeneratedValue(strategy = GenerationType.IDENTITY) // JPA 어노테이션 - AUTO_INCREMENT 옵션
    private Long id;

    @Column(length = 500, nullable = false) // JPA 어노테이션 - 컬럼임을 나타냄
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 Builder Pattern 자동 생성
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
