package com.imamachi.awsdemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;

    // 書籍名
    private String bookName;

    // ステータス（読書中、積読中、購入予定）
    private static enum Status {
        reading, pending, wishing
    }

    // 購入日
    private java.sql.Date purchaseDay;

    // 本の情報が載っているURL
    private String referenceUrl;
}
