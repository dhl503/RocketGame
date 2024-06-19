package org.example.myrocket.mysql;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
@Data
public class Myusertest {
    @Id
    private Integer id;
    private String name;
    private String desc;
}
