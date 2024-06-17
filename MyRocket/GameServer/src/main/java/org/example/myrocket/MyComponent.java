package org.example.myrocket;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class MyComponent {

    private final ResourceLoader resourceLoader;

    public MyComponent(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void getResourceAbsolutePath() throws IOException {
        Resource resource = resourceLoader.getResource("GenerateJsons/item_tbitem.json");
        File file = resource.getFile();
        String absolutePath = file.getAbsolutePath();
        System.out.println("Absolute Path: " + absolutePath);
    }
}