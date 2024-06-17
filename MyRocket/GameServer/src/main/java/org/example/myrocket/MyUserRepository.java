package org.example.myrocket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface MyUserRepository extends CrudRepository<MyUser, String> {
    // 不需要再定义这个接口了，连实现都不用实现了
    //Iterable<MyUser> findAll();
}
