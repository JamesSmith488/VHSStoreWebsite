package com.sparta.vhsstorewebsite.entities;

import javax.persistence.*;

@Entity
@Table(name = "user_reserved_entity", schema = "sakila", catalog = "")
@IdClass(UserReservedEntityPK.class)
public class UserReservedEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id")
    private Integer userId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "film_id")
    private Integer filmId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

}
