package com.melnyk.debugging;

public class GoodProgram {
  private static int anInt;
  private static double aDouble;

  public static void main(String[] args) {
    aDouble = 1;
    anInt = 1;
    do {
      aDouble += 1;
      anInt += 1;
    }
    while (!(anInt == 25 && aDouble == 25));
    System.out.println("Hello World!");
  }
}
