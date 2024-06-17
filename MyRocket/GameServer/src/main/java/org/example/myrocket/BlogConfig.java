package org.example.myrocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BlogConfig implements CommandLineRunner {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private MybatisTestMapper mybatisTestMapper;

    @Override
    public void run(String... args) throws Exception {
        //Blog blog = new Blog();
        //blog.setTitle("jdbc教程111111111");
        //blog.setContent("jdbc内容");
        //log.info("保存聚合blog");
        //Blog dbBlog = blogRepository.save(blog);
        //log.info("blog:" + blogRepository.findById(dbBlog.getId()).toString());
        log.info("blog:" + blogRepository.findById(2).toString());

        log.info("blog:" + mybatisTestMapper.queryById(1).toString());
    }
}
