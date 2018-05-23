package com;

import com.gendb.Generator;
import com.gendb.exception.GenerationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class Main {

  public static void main(String[] args) throws GenerationException, IOException {
    final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    final Validator v = factory.getValidator();
    final Generator g = new Generator(v);
    final InputStream config = ClassLoader.getSystemResourceAsStream("test.xml");
    final Properties props = new Properties();
    props.load(ClassLoader.getSystemResourceAsStream("db.properties"));
    g.createDatabase(config, props);
  }
}
