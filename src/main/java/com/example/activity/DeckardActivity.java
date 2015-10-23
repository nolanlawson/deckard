package com.example.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.R;

public class DeckardActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.deckard);

    Toast.makeText(this, R.string.helloworld, Toast.LENGTH_LONG).show();

  }
}
