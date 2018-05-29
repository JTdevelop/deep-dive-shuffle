package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ArrayShufflesTest {
  
  private static final String[] INPUT = {
      "Stephen",
      "Mike", 
      "Jason", 
      "Ivan",
      "Lora",
      "Justin",
      "Nick",
      "August",
  };
  @Test
  void testStringShuffle() {
   System.out.println(Arrays.toString(INPUT));
   ArrayShuffles.shuffle(INPUT);
   System.out.println(Arrays.toString(INPUT));
  }

}
