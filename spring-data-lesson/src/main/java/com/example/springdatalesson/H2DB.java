package com.example.springdatalesson;

import org.h2.jdbcx.JdbcDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Configuration
public class H2DB {

    static {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    public DataSource getDataSource(){
        JdbcDataSource h2DataSource = new JdbcDataSource();
        h2DataSource.setUser("test");
        h2DataSource.setPassword("test");
        h2DataSource.setURL("jdbc:h2:~/test");
        return h2DataSource;
    }
}
