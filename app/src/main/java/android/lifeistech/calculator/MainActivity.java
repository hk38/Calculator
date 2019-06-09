package android.lifeistech.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // 計算結果を保持する変数
    public int ans = 0;
    // 現在入力された値を保持する変数
    public int num = 0;
    // 加減乗除を指定する変数
    public int ope = 0;
    // 結果表示用TextView
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView.setText("0");
    }

    // 数値が入力された場合の処理0〜9
    // 以前までの入力を10倍して1の位に入力した値を入れる
    public void zero(View v){
        num = num * 10 + 0;
        textView.setText(Integer.toString(num));
    }

    public void one(View v){
        num = num * 10 + 1;
        textView.setText(Integer.toString(num));
    }

    public void two(View v){
        num = num * 10 + 2;
        textView.setText(Integer.toString(num));
    }

    public void three(View v){
        num = num * 10 + 3;
        textView.setText(Integer.toString(num));
    }

    public void four(View v){
        num = num * 10 + 4;
        textView.setText(Integer.toString(num));
    }

    public void five(View v){
        num = num * 10 + 5;
        textView.setText(Integer.toString(num));
    }

    public void six(View v){
        num = num * 10 + 6;
        textView.setText(Integer.toString(num));
    }

    public void seven(View v){
        num = num * 10 + 7;
        textView.setText(Integer.toString(num));
    }

    public void eight(View v){
        num = num * 10 + 8;
        textView.setText(Integer.toString(num));
    }

    public void nine(View v){
        num = num * 10 + 9;
        textView.setText(Integer.toString(num));
    }

    // 加減乗除の変数に従って処理を行う
    public void cal(){
        switch (ope) {
            // 初期状態ではこれまでの入力を結果保持用変数に格納
            case 0:
                ans = num;
                break;
            // それ以外の状態では押下前と押下後の値を押下したボタンに応じて処理
            case 1:
                ans = ans + num;
                break;
            case 2:
                ans = ans - num;
                break;
            case 3:
                ans = ans * num;
                break;
            case 4:
                ans = ans / num;
                break;
        }
        num = 0;
    }

    // 加減乗除のボタンを押下した時の動作
    // 以前に押されたボタンに応じた計算を行い，次のボタンが押された時のために算術方法を設定
    public void plus(View v){
        cal();
        ope = 1;
        textView.setText("+");
    }

    public void minus(View v){
        cal();
        ope = 2;
        textView.setText("-");
    }

    public void multi(View v){
        cal();
        ope = 3;
        textView.setText("×");
    }

    public void div(View v){
        cal();
        ope = 4;
        textView.setText("");
    }

    // イコール，クリア押下時の動作
    public void eq(View v){
        // 計算を行う
        cal();
        // 最終的な計算結果を表示
        textView.setText(String.valueOf(ans));
        // 初期化
        allClear();
    }

    public void clear(View v){
        allClear();
        // 表示も初期化
        textView.setText(String.valueOf(ans));
    }

    // 内部数値を全て初期化
    public void allClear(){
        ans = 0;
        ope = 0;
        num = 0;
    }

}
