package cinema.beans.dispatcher;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import cinema.beans.root.AppConfig;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppConfig.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
 
}