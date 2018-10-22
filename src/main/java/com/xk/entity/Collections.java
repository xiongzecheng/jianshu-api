package com.xk.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lenovo on 2018/10/22.
 */
@Entity
@Data
@Builder
public class Collections {
    @Id
    @GeneratedValue
    private Integer collectionId;
}
