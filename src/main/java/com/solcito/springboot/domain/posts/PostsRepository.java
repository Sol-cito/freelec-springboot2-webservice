package com.solcito.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/*
 *
 * Posts 클래스로 DB에 접근하게 해주는 JPA Repository 인터페이스
 * DAO처럼 DB Layer에 접근하는 역할을 하며,
 * JPA에서는 Repository라 부르며 Interface로 생성한다.
 * 이 Interface가 없으면 Posts 클래스가 역할을 할 수 없다.
 * JpaRepository를 상속함으로서 기본적인 CRUD메소드가 자동 생성되며(어노테이션 불필요),
 * < Entity 클래스, Key 타입> 의 형태로 JpaRepository를 상속한다.
 * 해당 Entity 클래스와 항상 '같은 위치(패키지)'에 있어야 한다.
 *
 * */
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
