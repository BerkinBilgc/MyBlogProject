package com.berknbilgc.data.entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

//lombok
@Getter @Setter

//super class
@MappedSuperclass

//auditing
@EntityListeners(AuditingEntityListener.class)
abstract public class BaseEntity {

    // Burayı sanki bir tablo dolduruyormuşsun gibi düşün
    // database indeki başlıklarını belirlediğin yer.

    // private Long id;
    // private Date systemCreatedDate;
    // private String createdBy;
    // private Date createdDate;
    // private String lastModifiedBy;
    // private Date lastModifiedDate;

    // primary key
    // id ler uniqe olmalı 1,2,3,4 ... id ler farklı bu yüzden @GeneratedValue kullandık.
    // @GeneratedValue(strategy = GenerationType.IDENTITY) buda ; id lerim eklenirken 1,2,3,4,5... gibi sıralı artan şekilde
    // eklemesini sağlıyor
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // name= "system_created_date" vermessen default olarak "systemCreatedDate" yazar databasede
    @Column(name ="system_created_date")
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date systemCreatedDate;

    // image



    //auditing
    //kim ekledi
    @Column(name="created_by")
    @CreatedBy
    private String createdBy;

    //kim ne zaman ekledi
    @Column(name="created_date")
    @CreatedDate
    private Date createdDate;

    //kim güncelledi
    @Column(name="last_modified_by")
    @LastModifiedBy
    private String lastModifiedBy;

    //kim ne zaman güncelledi
    @Column(name="last_modified_date")
    @LastModifiedDate
    private Date lastModifiedDate;
}