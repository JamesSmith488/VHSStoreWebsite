package com.sparta.vhsstorewebsite.entities;

import javax.persistence.*;

@Entity
@Table(name = "user_rented_entity", schema = "sakila", catalog = "")
@IdClass(UserRentedEntityPK.class)
public class UserRentedEntity {

    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Id
    @Column(name = "film_id")
    private Integer filmId;

    public UserRentedEntity() {
    }

    public UserRentedEntity(Integer userId, Integer filmId) {
        this.userId = userId;
        this.filmId = filmId;
    }

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
