package org.example.myrocket;

import lombok.extern.slf4j.Slf4j;
import org.example.myrocket.mysql.Blog;
import org.example.myrocket.mysql.BlogRepository;
import org.example.myrocket.mysql.MyUserTestRepository;
import org.example.myrocket.mysql.Myusertest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoadDataStartUp implements CommandLineRunner {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private MybatisTestMapper mybatisTestMapper;

    @Autowired
    private MyUserTestRepository myUserTestRepository;

    @Override
    public void run(String... args) throws Exception {
        Blog blog = new Blog();
        blog.setTitle("jdbc教程111111111");
        blog.setContent("jdbc内容");
        log.info("保存聚合blog");
        Blog dbBlog = blogRepository.save(blog);
        //log.info("blog:" + blogRepository.findById(dbBlog.getId()).toString());

        log.info("blog:" + blogRepository.findById(1).toString());
        //log.info("blog:" + mybatisTestMapper.queryById(1).toString());

        Myusertest test = new Myusertest();
        test.setId(2);
        test.setName("test");
        test.setDesc("hello world!! hahahahha");
        myUserTestRepository.save(test);
    }
}
