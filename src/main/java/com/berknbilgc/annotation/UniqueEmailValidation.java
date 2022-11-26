package com.berknbilgc.annotation;

import com.berknbilgc.data.entity.BaseEntity;
import com.berknbilgc.data.repository.IBlogRepository;
import lombok.RequiredArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//lombok


@RequiredArgsConstructor
public class UniqueEmailValidation implements ConstraintValidator<UserRegisterUniqueEmail,String> {

    //repository
    IBlogRepository repository;
    //private final IDailyRepository repository;

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        BaseEntity registerEntity=repository.findByEmail(email);
        if(registerEntity!=null)
            return false;
        return true;
    }

}
