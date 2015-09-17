package com.example.danny.sencepager;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RemoteViews;
import android.widget.Toast;

public class ShareReference extends Activity {
    private static final int NOTIFICATION_FLAG = 1;
    private Button mBtSendMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sharereference);
        mBtSendMessage = (Button) findViewById(R.id.btn1);
        mBtSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new AlertDialog.Builder(ShareReference.this).setTitle("真心话大冒险").setMessage("你确认选择真心话")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override

                            public void onClick(DialogInterface dialog, int which) {
                                String msg ="你好，美女,自动发送勿当真";
                                //String number = "13534207662";
                                SmsManager sms = SmsManager.getDefault();

                                PendingIntent pi = PendingIntent.getBroadcast(ShareReference.this,0,new Intent(),0);
                                sms.sendTextMessage("", null, msg, pi, null);
                                Toast.makeText(ShareReference.this, "发送成功", Toast.LENGTH_LONG).show();
                            }
                        })
                        .setNegativeButton("返回", new DialogInterface.OnClickListener() {
                            @Override

                            public void onClick(DialogInterface dialog, int which) {//响应事件
                                finish();
                                // TODO Auto-generated method stub

                                Log.i("alertdialog", " 请保存数据！");

                            }

                        }).show();

            }
        });
    }



    public void notificationMethod(View view) {
        // 在Android进行通知处理，首先需要重系统哪里获得通知管理器NotificationManager，它是一个系统Service。
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        switch (view.getId()) {
            // 默认通知

            // 默认通知 API11及之后可用
            case R.id.btn2:
                PendingIntent pendingIntent2 = PendingIntent.getActivity(this, 0,
                        new Intent(this, MainActivity.class), 0);
                // 通过Notification.Builder来创建通知，注意API Level
                // API11之后才支持
                Notification notify2 = new Notification.Builder(this)
                        .setSmallIcon(R.drawable.thumb_dn) // 设置状态栏中的小图片，尺寸一般建议在24×24，这个图片同样也是在下拉状态栏中所显示，如果在那里需要更换更大的图片，可以使用setLargeIcon(Bitmap
                                // icon)
                        .setTicker("TickerText:" + "您有新短消息，请注意查收！")// 设置在status
                                // bar上显示的提示文字
                        .setContentTitle("Notification Title")// 设置在下拉status
                                // bar后Activity，本例子中的NotififyMessage的TextView中显示的标题
                        .setContentText("Pulldown Preview2")// TextView中显示的详细内容
                        .setContentIntent(pendingIntent2) // 关联PendingIntent
                        .setVibrate(new long[]{100,500,100,500})//设置消息震动的频率和时间

                        .setNumber(1) // 在TextView的右方显示的数字，可放大图片看，在最右侧。这个number同时也起到一个序列号的左右，如果多个触发多个通知（同一ID），可以指定显示哪一个。
                        .getNotification(); // 需要注意build()是在API level
                // 16及之后增加的，在API11中可以使用getNotificatin()来代替
                notify2.defaults=Notification.DEFAULT_SOUND;
                notify2.flags |= Notification.FLAG_AUTO_CANCEL;
                manager.notify(NOTIFICATION_FLAG, notify2);
                break;
            // 默认通知 API16及之后可用
            case R.id.btn3:
                PendingIntent pendingIntent3 = PendingIntent.getActivity(this, 0,
                        new Intent(this, MainActivity.class), 0);
                // 通过Notification.Builder来创建通知，注意API Level
                // API16之后才支持
                Notification notify3 = new Notification.Builder(this)
                        .setSmallIcon(R.drawable.thumb_dn)
                        .setTicker("TickerText:" + "您有新短消息，请注意查收！")
                        .setContentTitle("Notification Title")
                        .setContentText("Pulldown Preview3")
                        .setContentIntent(pendingIntent3).setNumber(1).build(); // 需要注意build()是在API
                // level16及之后增加的，API11可以使用getNotificatin()来替代
                notify3.flags |= Notification.FLAG_AUTO_CANCEL; // FLAG_AUTO_CANCEL表明当通知被用户点击时，通知将被清除。
                manager.notify(NOTIFICATION_FLAG, notify3);// 步骤4：通过通知管理器来发起通知。如果id不同，则每click，在status哪里增加一个提示
                break;
            // 自定义通知
            case R.id.btn4:
                // Notification myNotify = new Notification(R.drawable.message,
                // "自定义通知：您有新短信息了，请注意查收！", System.currentTimeMillis());
                Notification myNotify = new Notification();
                myNotify.icon = R.drawable.thumb_dn;
                myNotify.tickerText = "TickerText:您有新短消息，请注意查收！";
                myNotify.when = System.currentTimeMillis();
                myNotify.flags = Notification.FLAG_NO_CLEAR;// 不能够自动清除
                RemoteViews rv = new RemoteViews(getPackageName(),
                        R.layout.my_notification);
                rv.setTextViewText(R.id.text_content, "hello wrold!");
                myNotify.contentView = rv;
                Intent intent = new Intent(Intent.ACTION_MAIN);
                PendingIntent contentIntent = PendingIntent.getActivity(this,1,intent,0);
                myNotify.contentIntent = contentIntent;
                manager.notify(NOTIFICATION_FLAG, myNotify);
                break;
            case R.id.btn5:
                // 清除id为NOTIFICATION_FLAG的通知
                manager.cancel(NOTIFICATION_FLAG);
                // 清除所有的通知
                // manager.cancelAll();
                break;
            default:
                break;
        }
    }
}