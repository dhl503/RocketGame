package org.example.myrocket;

import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
@Data
public class Blog {
    @Id
    private Integer id;
    private String title;
    private String content;
}
