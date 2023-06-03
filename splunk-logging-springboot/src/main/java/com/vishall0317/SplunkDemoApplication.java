package com.vishall0317;

import com.vishall0317.entity.Order;
import com.vishall0317.service.OrderService;
import com.vishall0317.mapper.Mapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
public class SplunkDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.vishall0317.SplunkDemoApplication.class, args);
    }

}
