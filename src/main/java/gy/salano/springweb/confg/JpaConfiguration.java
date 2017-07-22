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
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 *
 * @author salano
 */
@Configuration
@EnableJpaRepositories(basePackages = "gy.salano.springweb.data")
@ImportResource("classpath:applicationContext.xml")
public class JpaConfiguration {

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(false);
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5InnoDBDialect");
        return adapter;
    }

    /*@Bean
    public JndiObjectFactoryBean entityManagerFactory() {

        JndiObjectFactoryBean jndiObjectFB = new JndiObjectFactoryBean();

        //jndiObjectFB.setJndiName("jdbc/SpittrDS");
        jndiObjectFB.setJndiName("java:comp/env/jdbc/SpittrDS");
        return jndiObjectFB;
    }*/
    @Bean
    public JpaTransactionManager transactionManager() {
        return new JpaTransactionManager(); // does this need an emf???
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean emfb
                = new LocalContainerEntityManagerFactoryBean();
        emfb.setDataSource((javax.sql.DataSource) dataSource);
        emfb.setJpaVendorAdapter(jpaVendorAdapter);
        emfb.setPackagesToScan("gy.salano.springweb.libs");
        return emfb;
    }
}
