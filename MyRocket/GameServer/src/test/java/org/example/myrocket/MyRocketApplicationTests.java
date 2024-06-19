package org.example.myrocket;

import lombok.extern.slf4j.Slf4j;
import org.example.myrocket.mysql.Blog;
import org.example.myrocket.mysql.BlogRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class MyRocketApplicationTests {
    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private TableMapper tableMapper;
    @Test
    void testCreateTable() {
        tableMapper.createTable("testtab");
    }

    @Test
    void contextLoads() {
        Blog blog = new Blog();
        blog.setTitle("jdbc教程");
        blog.setContent("jdbc内容xxxx");
        log.info("保存聚合blog");
        Blog dbBlog = blogRepository.save(blog);
        log.info("blog:" + blogRepository.findById(dbBlog.getId()).toString());
    }


}
