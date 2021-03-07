package com.ianwhite.testapplication.testlibrary;

import androidx.annotation.NonNull;

/**
 * Created by Ian White on 9/5/2020
 *
 * @author Ian White
 */
public class Bar {
  private int mMyCoolNumber;
  private int mMyCoolerNumber;

  /**
   * @return {@link #mMyCoolNumber}
   */
  public int getMyCoolNumber() {
    return mMyCoolNumber;
  }

  /**
   * @param myCoolNumber sets {@link #mMyCoolNumber}
   */
  public void setMyCoolNumber(@NonNull int myCoolNumber) {
    mMyCoolNumber = myCoolNumber;
  }

  /**
   * @param myCoolerNumber sets {@link #mMyCoolerNumber}
   */
  public void setMyCoolerNumber(@NonNull int myCoolerNumber) {
    mMyCoolerNumber = myCoolerNumber;
  }
}
