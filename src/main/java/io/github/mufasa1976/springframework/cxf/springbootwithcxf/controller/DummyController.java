package io.github.mufasa1976.springframework.cxf.springbootwithcxf.controller;

import io.github.mufasa1976.springframework.cxf.springbootwithcxf.service.DummyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@WebService
@RequiredArgsConstructor
public class DummyController {
  private final DummyService dummyService;

  @WebMethod
  @GET
  @Path("/ping")
  public String ping() {
    return dummyService.ping();
  }
}
