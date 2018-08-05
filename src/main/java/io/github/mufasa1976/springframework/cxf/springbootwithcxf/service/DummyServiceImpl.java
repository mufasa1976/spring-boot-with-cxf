package io.github.mufasa1976.springframework.cxf.springbootwithcxf.service;

import org.springframework.stereotype.Service;

@Service
public class DummyServiceImpl implements DummyService {
  @Override
  public String ping() {
    return "OK";
  }
}
