package qianfeng.a5_1broadcastreceiver3_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send2(View view) {
//        要你的配置清单文件里面，同样要自定义一个permision，然后再使用一个uses-permision
    // 留意AndroidManifest.xml
        Intent intent = new Intent("qianfeng.android");
        sendBroadcast(intent,"custom.qianfeng"); // 如果在第三方应用中，指定了你Receiver2里面的权限，
                                             // 你Receiver2还是不能收到广播的，还差个步骤，就是在你的配置清单文件里面，同样要自定义一个permision，然后再使用一个uses-permision
    }
}
