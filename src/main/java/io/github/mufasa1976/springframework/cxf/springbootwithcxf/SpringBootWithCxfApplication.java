package io.github.mufasa1976.springframework.cxf.springbootwithcxf;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.ws.rs.core.Application;

@SpringBootApplication
public class SpringBootWithCxfApplication extends Application {
  public static void main(String[] args) {
    new SpringApplicationBuilder(SpringBootWithCxfApplication.class)
        .run(args);
  }

}
