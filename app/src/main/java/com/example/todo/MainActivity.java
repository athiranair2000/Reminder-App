package example.reminder.app;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.app.AlertDialog;

import android.widget.EditText;
import android.widget.ListView;


import com.example.todo.R;

public class MainActivity extends AppCompatActivity {
    Button Reminder;
    AlertDialog.Builder builder;
    private static final String TAG = "MainActivity";
    private ListView mTaskListView;
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTaskListView = (ListView) findViewById(R.id.list_todo);

        updateUI();


        Reminder = (Button) findViewById(R.id.reminder_btn);
        builder = new AlertDialog.Builder(this);
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
                                String task = String.valueOf(taskEditText.getText());
                                Log.d(TAG, "Task to add: " + task);
                            }
                        })
                        .setNegativeButton("Cancel", null)
                        .create();
                ActionBar alert = null;
                alert.show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
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
}
}

