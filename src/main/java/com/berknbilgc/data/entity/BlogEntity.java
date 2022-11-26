package com.berknbilgc.data.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//Entity
@Entity
// databasete table olacak ve ismi Blog olacak.
@Table(name = "Blog")
public class BlogEntity extends BaseEntity implements Serializable {
    public static final long serialVersionUID=1L;

    //field
    private String blogHeader;
    private String blogContent;

    @Column(name = "email",length = 125,nullable = false,unique = true)
    private String email;
    //private String password;


    //javada olsun ancak database bu attribute eklemesin
    //@Transient
    //private String justJava;

    //büyük datalar icin kullanalım.
    //@Lob
    //private Object bigData;
}
