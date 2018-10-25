package com.xk.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2018/10/25.
 */
@Entity
@Data
@Builder
public class Collection {
    @Id
    @GeneratedValue
    private Integer id;
    private String topicname;
    private String topicurl ;
    private String summary ;
    private Integer articlecount;
    private Integer fans;
    private String description;
    private String creator;
    private String picture;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "Button_id")
    private Set<CollectionArticle> articles = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "Fans_id")
    private Set<CollectionFans> fansList = new HashSet<>();

}
