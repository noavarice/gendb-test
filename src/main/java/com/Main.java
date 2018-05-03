package com;

import com.gendb.Generator;
import java.io.InputStream;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.xml.bind.JAXBException;

public class Main {

  public static void main(String[] args) throws JAXBException {
    final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    final Validator v = factory.getValidator();
    Generator g = new Generator(v);
    final InputStream is = ClassLoader.getSystemResourceAsStream("test.xml");
    g.fromStream(is, null);
  }
}
