package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // 6
@NoArgsConstructor // 5
@Entity // 1
public class Posts {
    @Id // 2
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 3
    private Long id;

    @Column(length = 500, nullable = false) // 4
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 7
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
// 책의 저자는 어노테이션 순서를 주요 어노테이션을 클래스에 가깝게 둔다고 한다.
// 이렇게 어노테이션을 정렬하는 기준은 다음과 같다.
// @Entity는 JPA의 어노테이션이며, @Getter과 @NoArgsConstructor는 롬복의 어노테이션입니다.
// 롬복은 코드를 단순화시켜 주지만 필수 어노테이션은 아닙니다. 그러다 보니
// 주요 어노테이션인 @Entity를 클래스에 가깝게 두고, 롬복 어노테이션을 그 위로 두었습니다.
// 이렇게 하면 이후에 코틀린 등의 새 언어 전환으로 롬복이 더이상 필요 없을 경우 쉽게 삭제할 수 있습니다.
//  여기서 Posts 클래스는 실제 DB의 테이블과 매칭될 클래스이며 보통 Entity 클래스라고도 합니다.
// JPA를 사용하시면 DB 데이터에 작업할 경우 실제 쿼리를 날리기 보다는, 이 Entity 클래스의 수정을 통해 작업합니다.
// Posts 클래스에는 JPA에서 제공하는 어노테이션들이 몇 개 있습니다.

// 1 @Entity
//    테이블과 링크될 클래스임을 나타냅니다.
//    기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍( _ 를 사용하는 작명 ) 으로 테이블 이름을 매칭합니다.
//    EX) SalesManager.java -> sales_manager table

// 2 @Id
//    해당 테이블의 PK 필드를 나타냅니다.

// 3 @GeneratedValue
//    PK의 생성 규칙을 나타냅니다.
//    스프링 부트 2.0 에서는 GenerationType.IDENTITY 옵션을 추가해야만 auto_imcrement가 됩니다.
//    스프링 부트 2.0 버전과 1.5 버전의 차이는 https://jojoldu.tistory.com/295 에 정리했으니 참고하세요

// 4 @Column


// 5 NoArgsConstructor


// 6 @Getter


// 7 @Builder

