package com.ianwhite.testapplication.libraryapp;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.ianwhite.testapplication.testlibrary.Bar;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Bar bar = new Bar();
    bar.setMyCoolNumber(99);
    bar.setMyCoolerNumber(999);

    if (bar.getMyCoolNumber() == 99)
      Log.d("HI", "I'm 99");
  }
}
