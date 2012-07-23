package net.takaiwa.customwidthdialogalert;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Display;
import android.view.Menu;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // �T�C�Y�w��̓_�C�A���O���ɔC���ĕ\������ꍇ
        new CustomAlertDialog(this);

        // Activity�ŃT�C�Y���w�肵�ĕ\������ꍇ
//        WindowManager wm = (WindowManager)getSystemService(Context.WINDOW_SERVICE);
//        Display disp = wm.getDefaultDisplay();
//        int width = (int)(disp.getWidth() * 0.8);
//        // ��ʕ�80%�ŕ\��
//        new CustomAlerDialog(this, width);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }


}
