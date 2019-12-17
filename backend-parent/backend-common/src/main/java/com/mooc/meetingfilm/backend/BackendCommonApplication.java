package com.mooc.meetingfilm.backend;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@Slf4j
@SpringBootApplication
@MapperScan(basePackages = "com.mooc.meetingfilm.user.dao.mapper")
public class BackendCommonApplication {

	public static void main(String[] args)  throws  Exception{
		SpringApplication.run(BackendCommonApplication.class, args);
	}

}
