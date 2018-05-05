package com;

import com.gendb.Generator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class Main {

  public static void main(String[] args) throws IOException {
    final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    final Validator v = factory.getValidator();
    Generator g = new Generator(v);
    final InputStream is = ClassLoader.getSystemResourceAsStream("test.xml");
    final File f = new File("/home/alexrazinkov/resources/test.txt");
    f.createNewFile();
    g.fromStream(is, new FileOutputStream(f));
  }
}
