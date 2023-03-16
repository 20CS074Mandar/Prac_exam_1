package com.example.prac_ex_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private Button sendButton;

    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        // Populate the list with some items
        for (int i = 1; i <= 10; i++) {
            ListItem listItem = new ListItem("Title " + i, "Subtitle " + i, false);
            listItems.add(listItem);
        }

        adapter = new MyAdapter(listItems, this);
        recyclerView.setAdapter(adapter);

        sendButton=findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder selectedItems = new StringBuilder();
                for (ListItem item : listItems) {
                    if (item.isSelected()) {
                        selectedItems.append(item.getTitle()).append("\n");
                    }
                }
                if (selectedItems.length() > 0) {
                    sendNotification(selectedItems.toString());
                }
            }
        });
    }

    private void sendNotification(String message) {

    }
}
