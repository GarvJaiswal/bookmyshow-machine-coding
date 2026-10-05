package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENT
    private Long id;

    @CreatedDate
//    @Temporal(TemporalType.TIME)
    private Date createdAt;

    @LastModifiedDate
//    @Temporal(TemporalType.TIME)
    private Date lastModifiedAt;
}

// MappedSuperClass.
//BaseModel - no need to create a table in the db,
//but all the attributes of BaseModel class needs to be
//present in all the child class tables in the DB..