package org.example.myrocket.mysql;

import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<Blog,Integer> {
    Blog findByTitle(String name);
}
