package io.github.mufasa1976.springframework.cxf.springbootwithcxf.config;

import io.github.mufasa1976.springframework.cxf.springbootwithcxf.controller.DummyController;
import lombok.RequiredArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.xml.ws.Endpoint;
import java.util.HashSet;
import java.util.Set;

@Configuration
@ApplicationPath("/rest")
@RequiredArgsConstructor
public class CxfConfiguration extends Application {
  private final ApplicationContext applicationContext;

  @Bean
  public Endpoint dummyEndpoint(Bus bus, DummyController dummyController) {
    EndpointImpl endpoint = new EndpointImpl(bus, dummyController);
    endpoint.publish("/dummy");
    return endpoint;
  }

  @Override
  public Set<Object> getSingletons() {
    return new HashSet<>(applicationContext.getBeansWithAnnotation(Controller.class)
                                           .values());
  }
}
