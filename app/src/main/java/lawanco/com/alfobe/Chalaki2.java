package lawanco.com.alfobe;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import java.io.File;

import ir.tapsell.sdk.Tapsell;
import ir.tapsell.sdk.TapsellAd;
import ir.tapsell.sdk.TapsellAdRequestListener;
import ir.tapsell.sdk.TapsellAdShowListener;

public class Chalaki2 extends AppCompatActivity {
    private static String DB_NAME = "dbalfobe.db3";
    private int nomra=100;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chalaki2);
        TestAdapter mDbHelper = new TestAdapter(this);
        mDbHelper.createDatabase();
        Tapsell.requestAd(this,"5c17edfee97d88000141548e",null, new TapsellAdRequestListener() {

            @Override
            public void onError(String s) {
                Toast.makeText(Chalaki2.this,"Error",Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onAdAvailable(TapsellAd tapsellAd) {
                Toast.makeText(Chalaki2.this,"onAdAvailable",Toast.LENGTH_SHORT).show();
                //getTapsellAd();
                //Tapsell ad = new Tapsell();
                tapsellAd.show( Chalaki2.this, null, new TapsellAdShowListener() {
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
                Toast.makeText(Chalaki2.this,"onNoAdAvailable",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNoNetwork() {
                Toast.makeText(Chalaki2.this,"onNoNetwork",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onExpiring(TapsellAd tapsellAd) {
                Toast.makeText(Chalaki2.this,"onExpiring",Toast.LENGTH_SHORT).show();
            }
        });
        File db = new File(this.getDatabasePath(DB_NAME).getPath());
        if(db.exists())
        {
            mDbHelper.open();
            Cursor C;
            C = mDbHelper.getTestData("select * from tbl1 WHERE id="+ getIntent().getStringExtra("chalaki1"));
            C.moveToFirst();
            String Chalaki2=C.getString(5);
            setbutonsChalaki2(Chalaki2);
            String NumDars =C.getString(0);
            Byte Bcase = Byte.parseByte(NumDars);
            setImgChalaki2(Bcase);
            mDbHelper.close();
        }else{
            File dir = new File(db.getParent());
            if (!dir.exists()) {
                dir.mkdirs();
            }
            Toast.makeText(this,"مشکل اتصال دیتابیس",Toast.LENGTH_SHORT).show();
        }
    }
    private boolean chalakiChek(String chalakiID , String jChalakiBTN, String chalakiDars){
        TestAdapter mDbHelper1 = new TestAdapter(this);
        mDbHelper1.createDatabase();
        File db = new File(this.getDatabasePath(DB_NAME).getPath());
        if(db.exists())
        {
            mDbHelper1.open();
            Cursor C;
            C = mDbHelper1.getTestData("select * from tbl1 WHERE id="+chalakiID);
            C.moveToFirst();
            mDbHelper1.close();
            String JChalaki2=C.getString(6);
            if(jChalakiBTN.equals(JChalaki2)){
                TestAdapter mDbHelper2 = new TestAdapter(this);
                mDbHelper2.createDatabase();
                mDbHelper2.open();
                Toast.makeText(this, "بژی" , Toast.LENGTH_SHORT).show();
                mDbHelper2.UpdateTest("UPDATE tbl1 SET nomra_CH2='" +String.valueOf(nomra)+"' WHERE id=" +chalakiID);//getIntent().getStringExtra("chalaki1"));
                mDbHelper2.close();
                Intent intent = new Intent(this, Chalaki3.class);
                intent.putExtra("chalaki2",chalakiID);
                startActivity(intent);
                return true;
            }else{
                return false;
            }
        }else{
            File dir = new File(db.getParent());
            if (!dir.exists()) {
                dir.mkdirs();
            }
            Toast.makeText(this,"مشکل اتصال دیتابیس",Toast.LENGTH_SHORT).show();
            return false;
        }
    }
    private void setbutonsChalaki2(String chalaki2){
        Button btn7 = (Button) findViewById(R.id.button7);
        Button btn8 = (Button) findViewById(R.id.button8);
        Button btn9 = (Button) findViewById(R.id.button9);
        Button btn10 = (Button) findViewById(R.id.button10);
        int StartStrchalaki2 = 0;
        int EndStrchalaki2 = 0;
        String str1 = "-";
        int j=0;
        for (int i = StartStrchalaki2; i < chalaki2.length(); i++) {
            if (chalaki2.substring(i, i + 1).equals(str1)) {
                EndStrchalaki2 = i;
                if (j == 0) {
                    btn7.setText(chalaki2.substring(StartStrchalaki2, EndStrchalaki2));
                    j++;
                } else if (j == 1) {
                    btn8.setText(chalaki2.substring(StartStrchalaki2, EndStrchalaki2));
                    j++;
                } else if (j == 2) {
                    btn9.setText(chalaki2.substring(StartStrchalaki2, EndStrchalaki2));
                    j++;
                }
                if (j == 3) {
                    StartStrchalaki2 = i + 1;
                    btn10.setText(chalaki2.substring(StartStrchalaki2, chalaki2.length()));
                    return;
                }
                StartStrchalaki2 = i + 1;
            }
        }
    }
    private  void setImgChalaki2(Byte Bcase){
        ImageView asli= (ImageView) findViewById(R.id.imgchalaki2);
        switch (Bcase)
        {
            case 1:
            {
                //todo  aksakani tarahi bekre wa ezafa bet --d1-- bakar awa naya
                asli.setImageResource(R.mipmap.f1d1);
//                pit.setImageResource(R.mipmap.p1);
                break;
            }
            case 2:
            {
                //ImageView pit= (ImageView) findViewById(R.id.aksPitDars);
                asli.setImageResource(R.mipmap.f1d2);
//                pit.setImageResource(R.mipmap.p2);
                break;
            }
            case 3:
            {
                //ImageView asli= (ImageView) findViewById(R.id.aksDarsAsli);
                //ImageView pit= (ImageView) findViewById(R.id.aksPitDars);
                asli.setImageResource(R.mipmap.f1d3);
//                pit.setImageResource(R.mipmap.p3);
                break;
            }

            case 4:
            {
                //ImageView asli= (ImageView) findViewById(R.id.aksDarsAsli);
                //ImageView pit= (ImageView) findViewById(R.id.aksPitDars);
                asli.setImageResource(R.mipmap.f1d4);
//                pit.setImageResource(R.mipmap.p4);
                break;
            }
            case 5:
            {
                //ImageView asli= (ImageView) findViewById(R.id.aksDarsAsli);
                //ImageView pit= (ImageView) findViewById(R.id.aksPitDars);
                asli.setImageResource(R.mipmap.f1d5);
//                pit.setImageResource(R.mipmap.p5);
                break;
            }
            case 6:
            {
                //ImageView asli= (ImageView) findViewById(R.id.aksDarsAsli);
                //ImageView pit= (ImageView) findViewById(R.id.aksPitDars);
                asli.setImageResource(R.mipmap.f1d6);
//                pit.setImageResource(R.mipmap.p6);
                break;}
            case 7:
            {
                asli.setImageResource(R.mipmap.f1d7);
                //pit.setImageResource(R.mipmap.p7);
                break;
            }
            case 8:
            {
                asli.setImageResource(R.mipmap.f1d8);
//                pit.setImageResource(R.mipmap.p8);
                break;
            }
            case 9:
            {
                asli.setImageResource(R.mipmap.f1d9);
//                pit.setImageResource(R.mipmap.p9);
                break;
            }
            case 10:
            {
                asli.setImageResource(R.mipmap.f1d10);
//                pit.setImageResource(R.mipmap.p10);
                break;
            }
            case 11:
            {
                asli.setImageResource(R.mipmap.f2d1);
//                pit.setImageResource(R.mipmap.p11);
                break;
            }
            case 12:
            {
                asli.setImageResource(R.mipmap.f2d2);
//                pit.setImageResource(R.mipmap.p12);
                break;
            }
            case 13:
            {
                asli.setImageResource(R.mipmap.f2d3);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 14:
            {
                asli.setImageResource(R.mipmap.f2d4);
//                pit.setImageResource(R.mipmap.p14);
                break;
            }
            case 15:
            {
                asli.setImageResource(R.mipmap.f2d5);
//                pit.setImageResource(R.mipmap.p15);
                break;
            }
            case 16:
            {
                asli.setImageResource(R.mipmap.f2d6);
//                pit.setImageResource(R.mipmap.p16);
                break;
            }
            case 17:
            {
                asli.setImageResource(R.mipmap.f2d7);
//                pit.setImageResource(R.mipmap.p17);
                break;
            }
            case 18:
            {
                asli.setImageResource(R.mipmap.f2d8);
//                pit.setImageResource(R.mipmap.p18);
                break;
            }
            case 19:
            {
                asli.setImageResource(R.mipmap.f2d9);
//                pit.setImageResource(R.mipmap.p19);
                break;
            }
            case 20:
            {
                asli.setImageResource(R.mipmap.f2d10);
//                pit.setImageResource(R.mipmap.p20);
                break;
            }
            case 21:
            {
                asli.setImageResource(R.mipmap.f3d1);
//                pit.setImageResource(R.mipmap.p21);
                break;
            }
            case 22:
            {
                asli.setImageResource(R.mipmap.f3d2);
//                pit.setImageResource(R.mipmap.p22);
                break;
            }
            case 23:
            {
                asli.setImageResource(R.mipmap.f3d3);
//                pit.setImageResource(R.mipmap.p23);
                break;
            }
            case 24:
            {
                asli.setImageResource(R.mipmap.f3d4);
//                pit.setImageResource(R.mipmap.p24);
                break;
            }
            case 25:
            {
                asli.setImageResource(R.mipmap.f3d5);
//                pit.setImageResource(R.mipmap.p25);
                break;
            }
            case 26:
            {
                asli.setImageResource(R.mipmap.f3d6);
//                pit.setImageResource(R.mipmap.p26);
                break;
            }
            case 27:
            {
                asli.setImageResource(R.mipmap.f3d7);
//                pit.setImageResource(R.mipmap.p27);
                break;
            }
            case 28:
            {
                asli.setImageResource(R.mipmap.f3d8);
//                pit.setImageResource(R.mipmap.p28);
                break;
            }
            case 29:
            {
                asli.setImageResource(R.mipmap.f3d9);
//                pit.setImageResource(R.mipmap.p29);
                break;
            }
            case 30:
            {
                asli.setImageResource(R.mipmap.f3d10);
//                pit.setImageResource(R.mipmap.p30);
                break;
            }
            case 31:
            {
                asli.setImageResource(R.mipmap.f4d1);
//                pit.setImageResource(R.mipmap.p31);
                break;
            }
            case 32:
            {
                asli.setImageResource(R.mipmap.f4d2);
//                pit.setImageResource(R.mipmap.p32);
                break;
            }
            case 33:
            {
                asli.setImageResource(R.mipmap.f4d3);
//                pit.setImageResource(R.mipmap.p33);
                break;
            }
            case 34:
            {
                asli.setImageResource(R.mipmap.f4d4);
//                pit.setImageResource(R.mipmap.p34);
                break;
            }
            case 35:
            {
                asli.setImageResource(R.mipmap.f4d5);
//                pit.setImageResource(R.mipmap.p35);
                break;
            }
            case 36:
            {
                asli.setImageResource(R.mipmap.f4d6);
//                pit.setImageResource(R.mipmap.p36);
                break;
            }
            case 37:
            {
                asli.setImageResource(R.mipmap.f4d7);
//                pit.setImageResource(R.mipmap.p37);
                break;
            }
            case 38:
            {
                asli.setImageResource(R.mipmap.f4d8);
//                pit.setImageResource(R.mipmap.p38);
                break;
            }
            case 39:
            {
                asli.setImageResource(R.mipmap.f4d9);
//                pit.setImageResource(R.mipmap.p39);
                break;
            }
            case 40:
            {
                asli.setImageResource(R.mipmap.f4d10);
//                pit.setImageResource(R.mipmap.p40);
                break;
            }
            case 41:
            {
                asli.setImageResource(R.mipmap.f5d1);
//                pit.setImageResource(R.mipmap.p41);
                break;
            }
            case 42:
            {
                asli.setImageResource(R.mipmap.f5d2);
//                pit.setImageResource(R.mipmap.p42);
                break;
            }
            case 43:
            {
                asli.setImageResource(R.mipmap.f5d3);
//                pit.setImageResource(R.mipmap.p43);
                break;
            }
            case 44:
            {
                asli.setImageResource(R.mipmap.f5d4);
//                pit.setImageResource(R.mipmap.p44);
                break;
            }
            case 45:
            {
                asli.setImageResource(R.mipmap.f5d5);
//                pit.setImageResource(R.mipmap.p45);
                break;
            }
            case 46:
            {
                asli.setImageResource(R.mipmap.f5d6);
//                pit.setImageResource(R.mipmap.p46);
                break;
            }
            case 47:
            {
                asli.setImageResource(R.mipmap.f5d7);
//                pit.setImageResource(R.mipmap.p47);
                break;
            }
            case 48:
            {
                asli.setImageResource(R.mipmap.f5d8);
//                pit.setImageResource(R.mipmap.p48);
                break;
            }
            case 49:
            {
                asli.setImageResource(R.mipmap.f5d9);
//                pit.setImageResource(R.mipmap.p49);
                break;
            }
            case 50:
            {
                asli.setImageResource(R.mipmap.f5d10);
//                pit.setImageResource(R.mipmap.p50);
                break;
            }
            case 51:
            {
                asli.setImageResource(R.mipmap.f6d1);
//                pit.setImageResource(R.mipmap.p51);
                break;
            }
            case 52:
            {
                asli.setImageResource(R.mipmap.f6d2);
//                pit.setImageResource(R.mipmap.p52);
                break;
            }
            case 53:
            {
                asli.setImageResource(R.mipmap.f6d3);
//                pit.setImageResource(R.mipmap.p53);
                break;
            }
            case 54:
            {
                asli.setImageResource(R.mipmap.f6d4);
//                pit.setImageResource(R.mipmap.p54);
                break;
            }
            case 55:
            {
                asli.setImageResource(R.mipmap.f6d5);
//                pit.setImageResource(R.mipmap.p55);
                break;
            }
            case 56:
            {
                asli.setImageResource(R.mipmap.f6d6);
//                pit.setImageResource(R.mipmap.p56);
                break;
            }
        }
    }
    public void onClickbtn7(View view){
        Button btn7 = (Button) findViewById(R.id.button7);
        if(!(chalakiChek(getIntent().getStringExtra("chalaki1"),btn7.getText().toString(),getIntent().getStringExtra("chalakiDars")))) {
            Toast.makeText(this,"بەداخەوە" ,Toast.LENGTH_SHORT).show();
            nomra-=16;
            btn7.setBackgroundColor(Color.parseColor("#FFFF0000"));
            btn7.setEnabled(false);
        }
    }
    public void onClickbtn8(View view){
        Button btn8 = (Button) findViewById(R.id.button8);
        if(!(chalakiChek(getIntent().getStringExtra("chalaki1"),btn8.getText().toString(),getIntent().getStringExtra("chalaki1")))) {
            Toast.makeText(this,"بەداخەوە" ,Toast.LENGTH_SHORT).show();
            nomra-=16;
            btn8.setBackgroundColor(Color.parseColor("#FFFF0000"));
            btn8.setEnabled(false);
        }
    }
    public void onClickbtn9(View view){
        Button btn9 = (Button) findViewById(R.id.button9);
        if(!(chalakiChek(getIntent().getStringExtra("chalaki1"),btn9.getText().toString(),getIntent().getStringExtra("chalakiDars")))) {
            Toast.makeText(this,"بەداخەوە" ,Toast.LENGTH_SHORT).show();
            nomra-=16;
            btn9.setBackgroundColor(Color.parseColor("#FFFF0000"));
            btn9.setEnabled(false);
        }
    }
    public void onClickbtn10(View view){
        Button btn10 = (Button) findViewById(R.id.button10);
        if(!(chalakiChek(getIntent().getStringExtra("chalaki1"),btn10.getText().toString(),getIntent().getStringExtra("chalakiDars")))) {
            Toast.makeText(this,"بەداخەوە" ,Toast.LENGTH_SHORT).show();
            nomra-=16;
            btn10.setBackgroundColor(Color.parseColor("#FFFF0000"));
            btn10.setEnabled(false);
        }
    }
}
