/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gy.salano.springweb.servlet;

import gy.salano.springweb.confg.RootConfig;
import gy.salano.springweb.confg.WebConfig;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author salano
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }
    //multipart configuration
    @Override
    protected void customizeRegistration(Dynamic registration) {
        registration.setMultipartConfig(
                new MultipartConfigElement("/tmp/spittr/uploads",
                        2097152, 4194304, 0));
    }
    @Override
    public void onStartup(ServletContext sc) throws ServletException{
        super.onStartup(sc);
        sc.setInitParameter("spring.profiles.active", "qa");
    }
    
}
