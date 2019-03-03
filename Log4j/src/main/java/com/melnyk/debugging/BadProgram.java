package com.melnyk.debugging;

public class BadProgram {
  private static int anInt;
  private static double aDouble;

  public static void main(String[] args) {
    aDouble = 0.1;
    anInt = 1;
    do {
      aDouble += 0.1;
      anInt += 1;
    }
    while (!(anInt == 25 && aDouble == 2.5));
    System.out.println("Hello World!");
  }
}
