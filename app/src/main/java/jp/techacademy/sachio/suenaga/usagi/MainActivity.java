package jp.techacademy.sachio.suenaga.usagi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int usagiCount = 30;

    public void onUsagi (View v){

        //　画像のリモコン
        ImageView iv = (ImageView) findViewById(R.id.imageView);

        //　カウントダウン
        usagiCount--;

        //　画像を変える+条件分岐
        if( usagiCount<20)iv.setImageResource(R.drawable.usagi2);
        if( usagiCount<15)iv.setImageResource(R.drawable.usagi3);
        if( usagiCount<10)iv.setImageResource(R.drawable.usagi4);
        if( usagiCount<5)iv.setImageResource(R.drawable.usagi5);

        //　アニメーション処理
        iv.startAnimation(AnimationUtils.loadAnimation(this, R.anim.tap));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView) findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.usagi1);
    }
}