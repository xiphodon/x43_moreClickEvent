package com.gc.x43_moreclickevent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * ����¼�
 * @author guochang
 *
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //���鳤�Ⱦ��ǵ������
   long[] mHits = new long[3];
   
   public void onClick(View view){
	   System.arraycopy(mHits, 1, mHits, 0, mHits.length-1);
	   //�����һ��λ�����õ�ǰ�ѿ���ʱ��
       mHits[mHits.length-1] = SystemClock.uptimeMillis();
       if (mHits[0] >= (SystemClock.uptimeMillis()-500)) {
    	   Toast.makeText(this, "����¼�", Toast.LENGTH_SHORT).show();
       }
       
   }
   
   
    
}
