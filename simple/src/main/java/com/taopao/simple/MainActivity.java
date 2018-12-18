package com.taopao.simple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.taopao.folderfilepicker.FolderFilePicker;

public class MainActivity extends AppCompatActivity {
    private TextView mTvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTvShow = (TextView) findViewById(R.id.tv_show);
        mTvShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FolderFilePicker picker = new FolderFilePicker(MainActivity.this,
                        new FolderFilePicker.PickPathEvent() {
                            @Override
                            public void onPickEvent(String resultPath) {
                                Toast.makeText(MainActivity.this, resultPath,
                                        Toast.LENGTH_LONG).show();
                            }
                        });
                picker.show();
            }
        });
    }
}