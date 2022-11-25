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
// databasedeki karşılığı table olacak
// name databasede oluşan tablonun adı
@Table(name = "Blog")
public class BlogEntity extends BaseEntity implements Serializable {
    public static final long serialVersionUID=1L;

    // Burada gelip busines.dto daki Blog dto da neler varsa burada tanıtıyorsun !

    //field
    private String dailyHeader;
    private String dailyContent;

    //@Column(name = "email",length = 125,nullable = false,unique = true)
    private String email;
    private String password;


    //javada olsun ancak database bu attribute eklemesin
    //@Transient
    //private String justJava;

    //büyük datalar icin kullanalım.
    //@Lob
    //private Object bigData;
}
