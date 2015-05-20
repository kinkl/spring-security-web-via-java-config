package com.springapp.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { SecurityConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class, ControllersConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    /*@Override
    public void onStartup(ServletContext container) throws ServletException {
        //ServletRegistration.Dynamic dynamic = container.addServlet("dispatcher", new DispatcherServlet());
        DispatcherServlet dispatcherServlet = new DispatcherServlet();

        ServletRegistration.Dynamic registration = container.addServlet("dispatcher", dispatcherServlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }*/


}
