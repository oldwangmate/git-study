package com.bigdata.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitStudy {
    public static void main(String[] args) {
        SpringApplication.run(GitStudy.class,args);
    }

    @GetMapping("/")
    public String getGit(){
        return "hello Git!!! -v0.1 --master --0.8 --merge合并分支处理 ";

    }
}
