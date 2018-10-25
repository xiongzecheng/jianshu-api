package com.xk.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lenovo on 2018/10/25.
 */
@Entity
@Data
@Builder
public class Carousel {
    @Id
    @GeneratedValue
    private Integer id;
    private String url ;
}
