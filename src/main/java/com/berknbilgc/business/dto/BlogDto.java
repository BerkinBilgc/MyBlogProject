package com.berknbilgc.business.dto;

import com.berknbilgc.annotation.UserRegisterUniqueEmail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

//lombok
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BlogDto implements Serializable{

    private Long id;

    @NotEmpty(message = "{blog.header.validation.constraints.NotNull.message}")
    private String dailyHeader;

    @NotEmpty(message = "{blog.content.validation.constraints.NotNull.message}")
    private String dailyContent;

    @NotEmpty(message = "{blog.email.validation.constraints.NotNull.message}")
    @Email(message = "{blog.email.regex.validation.constraints.NotNull.message}")
    @UserRegisterUniqueEmail
    private String email;

    @NotEmpty(message = "{blog.password.validation.constraints.NotNull.message}")
    //@Size(min=7,max = 12,message = "{blog.password.pattern.validation.constraints.NotNull.message}")
    //@Pattern(regexp = "")
    private String password;

    private Object image;

    private Date createdDate;
}
