package com.example.todo;

import android.database.Cursor;
import android.widget.ListView;
import android.app.ActionBar;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.app.AlertDialog;

import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


public class Activities<AppCompatActivity, mAdapter> extends AppCompatActivity {
    Button Reminder;
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    private static final String TAG = "MainActivity";
    private ListView mTaskListView;
    private ArrayAdapter<String> mAdapter;


    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTaskListView = (ListView)findViewById(R.id.list_todo);

        Reminder = (Button) findViewById(R.id.reminder_btn);
        Reminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText taskEditText = new EditText;

                switch (item.getItemId()) {
                    case R.id.action_add_task:

                        AlertDialog dialog = new AlertDialog.Builder(this)
                                .setTitle("Add a new task")
                                .setMessage("What do you want to do next?")
                                .setPositiveButton("Add", new DialogInterface.OnClickListener() {

                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        final String TAG ="MainActivity";
                                        // Access a Cloud Firestore instance from your Activity
                                        DatabaseReference mDatabase;
// ...
                                        mDatabase = FirebaseDatabase.getInstance().getReference();


                                    }
                                })
                                .setNegativeButton("Cancel", null)
                                .create();
                        ActionBar alert = null;
                        alert.show();
                }
            }});
        private void updateUI() {
            ArrayList<String> taskList = new ArrayList<>();

            Cursor cursor =
                    new String[]{TaskContract.TaskEntry._ID, TaskContract.TaskEntry.COL_TASK_TITLE},
                    null, null, null, null, null);
            while (cursor.moveToNext()) {
                int idx = cursor.getColumnIndex(TaskContract.TaskEntry.COL_TASK_TITLE);
                taskList.add(cursor.getString(idx));
            }

            if (mAdapter == null) {
                mAdapter = new ArrayAdapter<>(this,
                        R.layout.item_todo,
                        R.id.task_title,
                        taskList);
                mTaskListView.setAdapter(mAdapter);
            } else {
                mAdapter.clear();
                mAdapter.addAll(taskList);
                mAdapter.notifyDataSetChanged();
            }

            cursor.close();
            db.close();
        }
        }
        

    }












