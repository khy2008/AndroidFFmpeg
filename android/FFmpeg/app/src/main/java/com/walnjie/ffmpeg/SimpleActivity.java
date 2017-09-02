package com.walnjie.ffmpeg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by wlanjie on 2017/8/22.
 */
public class SimpleActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_simple);
    findViewById(R.id.get_video_frame)
        .setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            startActivity(new Intent(SimpleActivity.this, VideoFrameActivity.class));
          }
        });
//    FFmpeg.getInstance().openInput("/sdcard/tencent/MicroMsg/WeiXin/wx_camera_1502880546390.mp4");
//    FFmpeg.getInstance().openInput("/sdcard/DCIM/Camera/20170726_173615_5692.mp4");
    Toast.makeText(this, "缩放完成", Toast.LENGTH_SHORT).show();
  }
}
