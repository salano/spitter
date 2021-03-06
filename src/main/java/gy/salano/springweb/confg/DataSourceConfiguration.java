/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gy.salano.springweb.confg;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author salano
 */
@Configuration
//@ImportResource("classpath:applicationContext.xml")
public class DataSourceConfiguration {

    /*@Profile("development")
    @Bean
    public DataSource embeddedDataSource() {
        System.out.println("Initalise database config in test profile");
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:schema.sql")
                .addScript("classpath:test-data.sql")
                .build();
    }
     */
 /*@Profile("qa")
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //MySQL database we are using
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/TestDB");//change url
        dataSource.setUsername("userid");//change userid
        dataSource.setPassword("password");//change pwd

        //H2 database
        /*
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
        dataSource.setUsername("sa");
        dataSource.setPassword("");*/
 /* return dataSource;
    }*/
    //Working Solution
    /*@Profile("production")
    @Bean
    public DataSource dataSource() throws NamingException {

        
    
    
    /*
        JndiTemplate jndiTemplate = new JndiTemplate();
        DataSource dataSource
                = (DataSource) jndiTemplate.lookup("java:comp/env/jdbc/SpittrDS");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() throws NamingException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }*/
    
    /*@Bean
    public SpitterRepository spitterDAO() throws NamingException {
        JdbcSpitterRepository spitterDao = new JdbcSpitterRepository();
        spitterDao.setJdbcTemplate(jdbcTemplate());
        return spitterDao;
    }*/
    
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    
}
