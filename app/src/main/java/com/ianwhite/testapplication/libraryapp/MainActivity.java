package com.ianwhite.testapplication.libraryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.ianwhite.testapplication.testlibrary.Bar;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

              Bar bar = new Bar();
    bar.setMyCoolNumber(99);
        bar.setMyCoolerNumber(999);
  }
}
