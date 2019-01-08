package lawanco.com.alfobe;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.io.File;

import ir.tapsell.sdk.*;
import ir.tapsell.sdk.nativeads.TapsellNativeBannerManager;
import ir.tapsell.sdk.nativeads.TapsellNativeBannerViewManager;

public class Chalaki1 extends AppCompatActivity {
    private static String DB_NAME = "dbalfobe.db3";
    public int nomra = 100;
    private FrameLayout adContainer;
    private TapsellNativeBannerViewManager nativeBannerViewManager;




    private String qsql(String str){
        TestAdapter mDbHelper = new TestAdapter(this);
        mDbHelper.createDatabase();
        File db = new File(this.getDatabasePath(DB_NAME).getPath());
        if(db.exists())
        {
            mDbHelper.open();
            Cursor C;
            C = mDbHelper.getTestData("select * from tbl1 WHERE id="+str);
            C.moveToFirst();
            mDbHelper.close();
            return C.getString(3);

        }else{
            File dir = new File(db.getParent());
            if (!dir.exists()) {
                dir.mkdirs();
            }
            mDbHelper.close();
            Toast.makeText(this,"مشکل اتصال دیتابیس",Toast.LENGTH_SHORT).show();
            return "مشکل اتصال دیتابیس";
        }
    }
    @NonNull
    private String UpdateSql(String nomra , String dars){
        TestAdapter mDbHelper = new TestAdapter(this);
        mDbHelper.createDatabase();
        File db = new File(this.getDatabasePath(DB_NAME).getPath());
        if(db.exists())
        {
            mDbHelper.open();
            Cursor C;
            mDbHelper.UpdateTest("UPDATE tbl1 SET nomra_CH1='"+String.valueOf(nomra) +"' where id=" + dars);
            mDbHelper.close();
            return "0";//C.getString(13);
        }else{
            File dir = new File(db.getParent());
            if (!dir.exists()) {
                dir.mkdirs();
            }
            mDbHelper.close();
            Toast.makeText(this,"مشکل اتصال دیتابیس",Toast.LENGTH_SHORT).show();
            return "مشکل اتصال دیتابیس";
        }
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chalaki1);

        adContainer = findViewById(R.id.adContainer);

        //int cacheTypeCached = TapsellAdRequestOptions.CACHE_TYPE_CACHED;
        Tapsell.requestAd(this,"5c17edfee97d88000141548e",null, new TapsellAdRequestListener() {

                    @Override
                    public void onError(String s) {
                        Toast.makeText(Chalaki1.this,"Error",Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void onAdAvailable(TapsellAd tapsellAd) {
                        Toast.makeText(Chalaki1.this,"onAdAvailable",Toast.LENGTH_SHORT).show();
                        //getTapsellAd();
                        //Tapsell ad = new Tapsell();
                        tapsellAd.show( Chalaki1.this, null, new TapsellAdShowListener() {
                            @Override
                            public void onOpened (TapsellAd ad)
                            {
                                tapsellAd.getAd();
                            }
                            @Override
                            public void onClosed (TapsellAd ad)
                            {

                            }
                        });
                    }

                    @Override
                    public void onNoAdAvailable() {
                        Toast.makeText(Chalaki1.this,"onNoAdAvailable",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNoNetwork() {
                        Toast.makeText(Chalaki1.this,"onNoNetwork",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onExpiring(TapsellAd tapsellAd) {
                        Toast.makeText(Chalaki1.this,"onExpiring",Toast.LENGTH_SHORT).show();
                    }
                });
        File db = new File(this.getDatabasePath(DB_NAME).getPath());
        if(db.exists()){
            TestAdapter mDbhealper =new TestAdapter(this);
            mDbhealper.createDatabase();
            mDbhealper.open();
            Cursor C =mDbhealper.getTestData("select * from tbl1 where id="+getIntent().getStringExtra("chalakiDars"));
            C.moveToFirst();
            String chalaki1 =C.getString(4);
            Button btn1 = (Button) findViewById(R.id.button) ;
            Button btn2 = (Button) findViewById(R.id.button2) ;
            Button btn3 = (Button) findViewById(R.id.button3) ;
            Button btn4 = (Button) findViewById(R.id.button4) ;
            Button btn5 = (Button) findViewById(R.id.button5) ;
            Button btn6 = (Button) findViewById(R.id.button6) ;
            int i=0;
            String str1="-";
            if (chalaki1.substring(i+1,i+2).equals(str1)){
                btn1.setText(chalaki1.substring(i,i+1));
                i=i+2;
            }else{
                btn1.setText(chalaki1.substring(i,i+2));
                i=i+3;
            }
            if (chalaki1.substring(i+1,i+2).equals(str1)){
                btn2.setText(chalaki1.substring(i,i+1));
                i=i+2;
            }else{
                btn2.setText(chalaki1.substring(i,i+2));
                i=i+3;
            }
            if (chalaki1.substring(i+1,i+2).equals(str1)){
                btn3.setText(chalaki1.substring(i,i+1));
                i=i+2;
            }else{
                btn3.setText(chalaki1.substring(i,i+2));
                i=i+3;
            }
            if (chalaki1.substring(i+1,i+2).equals(str1)){
                btn4.setText(chalaki1.substring(i,i+1));
                i=i+2;
            }else{
                btn4.setText(chalaki1.substring(i,i+2));
                i=i+3;
            }
            if (chalaki1.substring(i+1,i+2).equals(str1)){
                btn5.setText(chalaki1.substring(i,i+1));
                i=i+2;
            }else{
                btn5.setText(chalaki1.substring(i,i+2));
                i=i+3;
            }
            btn6.setText(chalaki1.substring(i,chalaki1.length()));
            }else{
                File dir = new File(db.getParent());
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                Toast.makeText(this,"مشکل اتصال دیتابیس",Toast.LENGTH_SHORT).show();
            }
    }
//    private void initTapsellNative() {
//        nativeBannerViewManager = new TapsellNativeBannerManager.Builder()
//                .setParentView(adContainer)
//                .setContentViewTemplate(R.layout.tapsell_content_banner_ad_template)
//                .setAppInstallationViewTemplate(R.layout.tapsell_app_installation_banner_ad_template)
//                .inflateTemplate(this);
//    }
//    private void getTapsellAd() {
//        TapsellNativeBannerManager.getAd(this, "5953bc774684652dd8fc937e",
//                new AdRequestCallback() {
//                    @Override
//                    public void onResponse(String[] adId) {
//                        onAdResponse(adId);
//                    }
//
//                    @Override
//                    public void onFailed(String message) {
//                        Log.e("getTapsellAd onFailed", message);
//                    }
//                });
//    }
//    private void onAdResponse(final String[] adId) {
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                TapsellNativeBannerManager.bindAd(
//                         Chalaki1.this,
//                        nativeBannerViewManager,
//                        "5953bc774684652dd8fc937e",
//                        adId[0]);
//            }
//        });
//    }

    public void onClickbtn1(View view){
        String HrofDars = qsql(getIntent().getStringExtra("chalakiDars"));
        Button btn1 = (Button) findViewById(R.id.button);
        if(btn1.getText().toString().equals(HrofDars)){
            Toast.makeText(this,"ئافەرین",Toast.LENGTH_SHORT).show();
            UpdateSql(String.valueOf(nomra),getIntent().getStringExtra("chalakiDars"));
            Intent intent = new Intent(this,Chalaki2.class);
            intent.putExtra("chalaki1", getIntent().getStringExtra("chalakiDars"));
            startActivity(intent);
        }else{
            Toast.makeText(this,"بەداخەوە",Toast.LENGTH_SHORT).show();
            nomra-=16;
            btn1.setBackgroundColor(Color.parseColor("#ffff0000"));
            btn1.setEnabled(false);
        }
    }
    public void onClickbtn2(View view){
        String HrofDars = qsql(getIntent().getStringExtra("chalakiDars"));
        Button btn2 = (Button) findViewById(R.id.button2);
        if(btn2.getText().toString().equals(HrofDars)){
            Toast.makeText(this,"ئافەرین",Toast.LENGTH_SHORT).show();
            UpdateSql(String.valueOf(nomra),getIntent().getStringExtra("chalakiDars"));
            //String sqlstr = "UPDATE tbl1 SET nomra_CH1='"+String.valueOf(nomra) +"' where id=" + getIntent().getStringExtra("chalakiDars");
            //mDb.rawQuery(sqlstr, null);
            Intent intent = new Intent(this,Chalaki2.class);
            intent.putExtra("chalaki1", getIntent().getStringExtra("chalakiDars"));
            startActivity(intent);
        }else{
            Toast.makeText(this,"بەداخەوە",Toast.LENGTH_SHORT).show();
            nomra-=16;
            btn2.setBackgroundColor(Color.parseColor("#ffff0000"));
            btn2.setEnabled(false);
        }
    }
    public void onClickbtn3(View view){
        String HrofDars = qsql(getIntent().getStringExtra("chalakiDars"));
        Button btn3 = (Button) findViewById(R.id.button3);
        if(btn3.getText().toString().equals(HrofDars)){
            Toast.makeText(this,"ئافەرین",Toast.LENGTH_SHORT).show();
            UpdateSql(String.valueOf(nomra),getIntent().getStringExtra("chalakiDars"));
            Intent intent = new Intent(this,Chalaki2.class);
            intent.putExtra("chalaki1", getIntent().getStringExtra("chalakiDars"));
            startActivity(intent);
        }else{
            Toast.makeText(this,"بەداخەوە",Toast.LENGTH_SHORT).show();
            nomra-=16;
            btn3.setBackgroundColor(Color.parseColor("#ffff0000"));
            btn3.setEnabled(false);
        }
    }
    public void onClickbtn4(View view){
        String HrofDars = qsql(getIntent().getStringExtra("chalakiDars"));
        Button btn4 = (Button) findViewById(R.id.button4);
        if(btn4.getText().toString().equals(HrofDars)){
            Toast.makeText(this,"ئافەرین",Toast.LENGTH_SHORT).show();
            UpdateSql(String.valueOf(nomra),getIntent().getStringExtra("chalakiDars"));
            Intent intent = new Intent(this,Chalaki2.class);
            intent.putExtra("chalaki1", getIntent().getStringExtra("chalakiDars"));
            startActivity(intent);
        }else{
            Toast.makeText(this,"بەداخەوە",Toast.LENGTH_SHORT).show();
            nomra-=16;
            btn4.setBackgroundColor(Color.parseColor("#ffff0000"));
            btn4.setEnabled(false);
        }
    }
    public void onClickbtn5(View view){
        String HrofDars = qsql(getIntent().getStringExtra("chalakiDars"));
        Button btn5 = (Button) findViewById(R.id.button5);
        if(btn5.getText().toString().equals(HrofDars)){
            Toast.makeText(this,"ئافەرین",Toast.LENGTH_SHORT).show();
            UpdateSql(String.valueOf(nomra),getIntent().getStringExtra("chalakiDars"));
            Intent intent = new Intent(this,Chalaki2.class);
            intent.putExtra("chalaki1", getIntent().getStringExtra("chalakiDars"));
            startActivity(intent);
        }else{
            Toast.makeText(this,"بەداخەوە",Toast.LENGTH_SHORT).show();
            nomra-=16;
            btn5.setBackgroundColor(Color.parseColor("#ffff0000"));
            btn5.setEnabled(false);
        }
    }
    public void onClickbtn6(View view){
        String HrofDars = qsql(getIntent().getStringExtra("chalakiDars"));
        Button btn6 = (Button) findViewById(R.id.button6);
        if(btn6.getText().toString().equals(HrofDars)){
            Toast.makeText(this,"ئافەرین",Toast.LENGTH_SHORT).show();
            UpdateSql(String.valueOf(nomra),getIntent().getStringExtra("chalakiDars"));
            Intent intent = new Intent(this,Chalaki2.class);
            intent.putExtra("chalaki1", getIntent().getStringExtra("chalakiDars"));
            startActivity(intent);
        }else{
            Toast.makeText(this,"بەداخەوە",Toast.LENGTH_SHORT).show();
            nomra-=16;
            btn6.setBackgroundColor(Color.parseColor("#ffff0000"));
            btn6.setEnabled(false);
        }
    }
}