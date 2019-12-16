package com.mooc.meetingfilm.backend;

import com.mooc.meetingfilm.backend.dao.entity.MoocBackendUserT;
import lombok.Cleanup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;

//@Slf4j
@SpringBootApplication
public class BackendCommonApplication {

	public static void main(String[] args)  throws  Exception{
		SpringApplication.run(BackendCommonApplication.class, args);
	}

}
