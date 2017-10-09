package my.todolist.Calendar.Dialog.ToDo.Select;

/**
 * Это какая-то чушь
 * здесь я хотела сделать окно,которое появляется с календарем, при нажатии на кнопку "добавить"
 * разобраться, как взаимодействуют классы,как все правильно подписывать в папках,extends
 */



import android.app.Activity;
        import android.app.AlertDialog;
        import android.app.Dialog;
        import android.content.DialogInterface;
        import android.content.DialogInterface.OnClickListener;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Toast;

import my.todolist.R;

public class Date extends Activity {

    final int DIALOG_EXIT = 1;

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onclick(View v) {
        // вызываем диалог
        showDialog(DIALOG_EXIT);
    }

    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_EXIT) {
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            // заголовок
            adb.setTitle(R.string.Add);
            // сообщение
            adb.setMessage(R.string.select_data);
            // иконка
            adb.setIcon(android.R.drawable.ic_dialog_info);
            // кнопка положительного ответа
            adb.setPositiveButton(R.string.ok, myClickListener);
              // кнопка нейтрального ответа
            adb.setNeutralButton(R.string.cancel, myClickListener);
            // создаем диалог
            return adb.create();
        }
        return super.onCreateDialog(id);
    }

    OnClickListener myClickListener = new OnClickListener() {
        public void onClick(DialogInterface dialog, int which) {
            switch (which) {
                // положительная кнопка
                case Dialog.BUTTON_POSITIVE:
                    saveData();
                    finish();
                    break;
                // негативная кнопка
               // case Dialog.BUTTON_NEGATIVE:
                  //  finish();
                   // break;
                // нейтральная кнопка
                case Dialog.BUTTON_NEUTRAL:
                    break;
            }
        }
    };

    void saveData() {
        Toast.makeText(this, R.string.saved, Toast.LENGTH_SHORT).show();
    }
    public void onBackPressed() {
        // вызываем диалог
        showDialog(DIALOG_EXIT);
    }
}