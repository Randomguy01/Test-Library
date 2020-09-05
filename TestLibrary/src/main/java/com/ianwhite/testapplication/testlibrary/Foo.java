package com.ianwhite.testapplication.testlibrary;

import androidx.annotation.NonNull;

/**
 * Created by Ian White on 9/5/2020
 *
 * @author Ian White
 */
public class Foo {
  public static final int COOL_NUMBER = 99;

  /**
   * @return {@link #COOLER_NUMBER}
   */
  public static int getCoolerNumber() {
    return COOLER_NUMBER;
  }

  /**
   * @param coolerNumber sets {@link #COOLER_NUMBER}
   */
  public static void setCoolerNumber(int coolerNumber) {
    COOLER_NUMBER = coolerNumber;
  }

  private static int COOLER_NUMBER = 999;



}
