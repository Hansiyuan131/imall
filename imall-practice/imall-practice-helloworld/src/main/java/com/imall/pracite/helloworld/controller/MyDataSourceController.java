package com.imall.pracite.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RequestMapping("/source")
@RestController
public class MyDataSourceController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/con")
    public String showConnection() throws SQLException {
        Connection connection = dataSource.getConnection();

        return connection.toString();
    }
}
