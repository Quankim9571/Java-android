package com.example.tesla;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tesla.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonShowInfo = findViewById(R.id.button_show_info);
        TextView textViewInfo = findViewById(R.id.text_view_info);

        buttonShowInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hiển thị thông tin của bạn
                textViewInfo.setText("Tên: Nguyễn Kim Quân\nTuổi: 20\nSở thích: Tiểu Tiên Nữ");
                textViewInfo.setVisibility(View.VISIBLE); // Hiện TextView
            }
        });
    }
}
