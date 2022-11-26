package com.berknbilgc.ui.mvc.impl;

// MVC kısmı frontend ile ilgili. Chrome da girdiğin yapılar ile ilgili
// database de işlem yapacaksan bir şey yapmak zorunda değilsin burda anladığım kadarıylaaa!!!!

import com.berknbilgc.business.dto.BlogDto;
import com.berknbilgc.ui.mvc.IBlogController;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//lombok
@RequiredArgsConstructor
@Log4j2

//Controller
@Controller
//@RequestMapping("/controller")
public class BlogController {

    /*

    //Inject
    private final IBlogRepository repository;
    private final ModelMapperBean modelMapperBean;
    private final PasswordEncoderBean passwordEncoderBean;

    // SPEED DATA
    // http://localhost:3333/speedData
    @Override
    @GetMapping("/speedData")
    public String createSpeedData(Model model) {
        int counter = 0;
        for (int i = 1; i <= 5; i++) {
            UUID uuid = UUID.randomUUID();
            BlogEntity blogEntity = BlogEntity.builder()
                    .blogHeader("başlık " + i).blogContent("içerik "+i)
                    .password("Hm1234"+i)
                    .email(uuid.toString().concat("@gmail.com")).build();
            repository.save(blogEntity);
            counter++;
        }
        model.addAttribute("key_dataset", counter + " tane blog Entity oluşturuldu");
        return "redirect:/blog/list";
    }

    // SPEED DELETE
    // http://localhost:3333/speedData
    @Override
    @GetMapping("/speedDelete")
    public String deleteSpeedData(Model model) {
        repository.deleteAll();
        return "redirect:/blog/list";
    }



    // CREATE 2497-2588
    // http://localhost:3333/blog/create
    @Override
    @GetMapping("/blog/create")
    public String validationGetBlog(Model model) {
        model.addAttribute("key_blog", new BlogDto());
        return "blog_create";
    }

    //CREATE
    // http://localhost:1111/blog/create
    @Override
    @PostMapping("/blog/create")
    public String validationPostBlog(@Valid @ModelAttribute("key_blog") BlogDto blogDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            log.error("HATA: " + bindingResult);
            return "blog_create";
        }
        //eğer valiadtion bir hata yoksa
        model.addAttribute("blog_success", "Üye Kaydı Başarılı " + blogDto);
        log.info("Başarılı " + blogDto);

        //Database
        //masking password
        BlogDto.setPassword(passwordEncoderBean.passwordEncoderMethod().encode(blogDto.getPassword()));

        //model mapper
        BlogEntity blogEntity = modelMapperBean.modelMapperMethod().map(blogDto, BlogEntity.class);
        //model mapper yerine biz yazarsak
        //BlogEntity blogEntity=new BlogEntity();
        //BlogEntity.setId(blogDto.getId());
        //BlogEntity.setName(blogDto.getName());
        //BlogEntity.setSurname(blogDto.getSurname());
        //BlogEntity.setEmail(blogDto.getEmail());
        //BlogEntity.setPassword(blogDto.getPassword());
        try {
            if (blogEntity != null) {
                repository.save(blogEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //File
        return "success";
    }


    // LIST
    // http://localhost:3333/blog/list
    @Override
    @GetMapping("/blog/list")
    public String blogList(Model model) {
        List<BlogEntity> list = repository.findAll();
        model.addAttribute("key_blog", list);
        list.forEach((temp) -> {
            System.out.println(temp);
        });
        return "blog_list";
    }

    // FIND
    // http://localhost:3333/blog/find
    // http://localhost:3333/blog/find/1
    @Override
    @GetMapping( "/blog/find/{id}")
    public String blogFindById(@PathVariable(name = "id") Long id, Model model) {
        //1.YOL
        //Optional<BlogEntity> findData = repository.findById(id);
        //if (findData.isPresent()) {
        //    return "Data: " + findData.get();
        //} else {
        //    return id + " numaralı Data: Bulunamadı  ";
        //}

        //2.YOL
        BlogEntity blogEntity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id + " nolu kayıt yoktur"));
        model.addAttribute("blog_find", blogEntity);
        return "blog_detail_page";
    }

    // DELETE
    // http://localhost:3333/blog/delete
    // http://localhost:3333/blog/delete/1
    @Override
    @GetMapping({"/blog/delete", "/blog/delete/{id}"})
    public String blogDeleteById(@PathVariable(name = "id", required = false) Long id, Model model) {
        BlogEntity blogEntity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id + " nolu kayıt yoktur"));
        if (blogEntity != null) {
            repository.deleteById(id);
            model.addAttribute("key_delete", blogEntity + " silindi");
        } else
            model.addAttribute("key_delete", id + " numaralı veri yoktur");
        return "redirect:/blog/list";
    }

    //UPDATE
    // http://localhost:3333/update/blog
    @Override
    @GetMapping("/blog/update/{id}")
    public String updateGetBlog(@PathVariable(name = "id") Long id, Model model) {
        BlogEntity blogEntityFind = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id + " nolu kayıt yoktur"));
        if (blogEntityFind != null) {
            model.addAttribute("key_update", blogEntityFind);
        } else
            model.addAttribute("key_update", id + " numaralı veri yoktur");
        return "blog_update";
    }

    //UPDATE
    // http://localhost:3333/update/blog
    @Override
    @PostMapping("/blog/update/{id}")
    public String updatePostBlog(@PathVariable(name = "id") Long id, @Valid @ModelAttribute("key_update") BlogDto blogDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            log.error("HATA: " + bindingResult);
            return "blog_update";
        }
        BlogEntity blogEntity = modelMapperBean.modelMapperMethod().map(blogDto, blogEntity.class);
        try {
            if (blogEntity != null) {
                repository.save(blogEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/blog/list";
    }


 */

}
