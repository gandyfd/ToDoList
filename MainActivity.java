package my.todolist;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private TextView MainTextView;
     Button Plus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainTextView = (TextView)findViewById(R.id.textView);
        Plus = (Button)findViewById(R.id.button);


    }
    // создаем обработчик нажатия
    /*View.OnClickListener oncl = new View.OnClickListener(){
    @Override
    public void onClick(View view) {
        //найти статью с календариком по кнопочке
        //создать окно с календариком(видела),добавить окно для горизонтали
        // присвоим обработчик кнопке plus (btnOk)
        Plus.setOnClickListener(oncl);
    } */




