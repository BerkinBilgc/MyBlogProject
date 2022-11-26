package com.berknbilgc.data.repository;

import com.berknbilgc.data.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Sorguları atacağın kısım burası
@Repository
public interface IBlogRepository extends JpaRepository<BlogEntity,Long>{
    //Kendi Sorgumuzu yazdık
    BlogEntity findByEmail(String email);
    //BlogEntity findById(String id);

}
