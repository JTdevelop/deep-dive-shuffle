package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;

class ArrayShufflesTest {


  @Test
  void testStringShuffle() throws IOException {
    String[] names = names("students.txt");
    System.out.println(Arrays.toString(names));
    ArrayShuffles.shuffle(names);
    System.out.println(Arrays.toString(names));
    ArrayShuffles.shuffle(names, new SecureRandom());
    System.out.println(Arrays.toString(names));
  }

  private String[] names(String filename) throws IOException {
    InputStream input = null;
    Reader reader = null;
    BufferedReader buffer = null;
    try {
      input = new FileInputStream(filename);
      reader = new InputStreamReader(input);
      buffer = new BufferedReader(reader);
      List<String> names = new LinkedList<>();
      for (String name = buffer.readLine(); name != null; name = buffer.readLine()) {
        name = name.trim();
        if (!name.isEmpty()) {
          names.add(name);
        }
      }
      return names.toArray(new String[names.size()]);
    } finally {
      if (buffer != null) {
        buffer.close();
      }
      if (reader != null) {
        reader.close();
      }
      if (input != null) {
        input.close();
      }
    }
  }
}
