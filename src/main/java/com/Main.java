package com;

import com.gendb.Generator;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class Main {

  public static void main(String[] args) throws IOException, URISyntaxException {
    final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    final Validator v = factory.getValidator();
    Generator g = new Generator(Paths.get(ClassLoader.getSystemResource("test.xml").toURI()), v);
    g.createScript(Paths.get("/home/alexrazinkov/resources/test.sql"), true);
  }
}
