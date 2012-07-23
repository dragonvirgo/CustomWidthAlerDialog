package net.takaiwa.customwidthalertdialog;

import net.takaiwa.customwidthdialogalert.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;

public class CustomAlertDialog extends AlertDialog.Builder {

    /**
     * �R���X�g���N�^
     * �_�C�A���O���ŃT�C�Y���w��
     * @param context
     */
    public CustomAlertDialog(Context context) {
        super(context);
        this.showDialog(context, LayoutParams.FILL_PARENT);
    }

    /**
     * �R���X�g���N�^
     * �Ăяo�����Ɏw�肳�ꂽ�T�C�Y�Ń_�C�A���O��\��
     * @param context
     * @param width
     */
    public CustomAlertDialog(Context context, int width) {
        super(context);
        this.showDialog(context,width);
    }

    private void showDialog(Context context, int width) {

        // XML�t�@�C�����烌�C�A�E�g��ǂݍ���
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.dialog_layout, null);

        setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                /* OK�{�^�����N���b�N�������̏��� */
                dialog.cancel();
            }
        });
        setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                /* Cancel�{�^�����N���b�N�������̏��� */
                dialog.cancel();
            }
        });
//        setTitle("hogehoge");
        setView(view);

        Dialog d = create();
        d.show();
        LayoutParams lp = d.getWindow().getAttributes();
        lp.width = width;
        d.getWindow().setAttributes(lp);
    }


}
