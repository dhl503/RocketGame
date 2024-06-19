package org.example.myrocket.jdbctest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("UserEx")
public class MyUser {
    @Id
    public int id;
    public String name;
}
