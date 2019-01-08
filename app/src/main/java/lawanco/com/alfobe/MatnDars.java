package lawanco.com.alfobe;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MatnDars extends AppCompatActivity {
    private static String DB_NAME = "dbalfobe.db3";
    @Override
    public void onCreate (Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_darse_aval);
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(getIntent().getStringExtra("dars"));
//        SQLiteDatabase DB;
//        try{
//            //open DB
//            String mypath = DB_PATH + DB_NAME;
//            DB = SQLiteDatabase.openDatabase(mypath,null,SQLiteDatabase.OPEN_READWRITE);
//        }catch (SQLException sqle){
//            throw sqle;
//        }
//        Cursor C1 = DB.rawQuery("select * from tbl1 WHERE id="+getIntent().getStringExtra("dars"),null);
//        C1.moveToFirst();
//        String NumDars=C1.getString(0);
//        Byte Basce = Byte.parseByte(NumDars);
        File db = new File(this.getDatabasePath(DB_NAME).getPath());
        Byte Basce = null;
        if(db.exists()){
            TestAdapter mDbhealper =new TestAdapter(this);
            mDbhealper.createDatabase();
            mDbhealper.open();
            Cursor C =mDbhealper.getTestData("select * from tbl1 where id="+getIntent().getStringExtra("dars"));
            C.moveToFirst();
            String NumDars=C.getString(0);
            Basce = Byte.parseByte(NumDars);
        }else{
            File dir = new File(db.getParent());
            if (!dir.exists()) {
                dir.mkdirs();
            }
            Toast.makeText(this,"مشکل اتصال دیتابیس",Toast.LENGTH_LONG).show();
        }

//        Cursor C = DB.rawQuery("select * from tbl1 WHERE id="+getIntent().getStringExtra("dars"),null);
//        C.moveToFirst();
//        String s = C.getString(1);
//        TextView enwan = (TextView) findViewById(R.id.textView2);
//        enwan.setText(s);

        ImageView asli = (ImageView) findViewById(R.id.aksDarsAsli);
//        ImageView pit = (ImageView) findViewById(R.id.aksPitDars);
        switch (Basce)
        {
            case 1: {
                asli.setImageResource(R.mipmap.f1d1);
//                pit.setImageResource(R.mipmap.p1);
                break;
            }
            case 2: {
                asli.setImageResource(R.mipmap.f1d2);
//              pit.setImageResource(R.mipmap.p2);
                break;
            }
            case 3: {
                asli.setImageResource(R.mipmap.f1d3);
//                pit.setImageResource(R.mipmap.p3);
                break;
            }
            case 4: {
                asli.setImageResource(R.mipmap.f1d4);
//              pit.setImageResource(R.mipmap.p4);
                break;
            }
            case 5: {
                asli.setImageResource(R.mipmap.f1d5);
//                pit.setImageResource(R.mipmap.p5);
                break;
            }
            case 6: {
                asli.setImageResource(R.mipmap.f1d6);
//                pit.setImageResource(R.mipmap.p6);
                break;
            }
            case 7: {
                asli.setImageResource(R.mipmap.f1d7);
//                pit.setImageResource(R.mipmap.p7);
                break;
            }
            case 8: {
                asli.setImageResource(R.mipmap.f1d8);
//                pit.setImageResource(R.mipmap.p8);
                break;
            }
            case 9: {
                asli.setImageResource(R.mipmap.f1d9);
//                pit.setImageResource(R.mipmap.p9);
                break;
            }
            case 10: {
                asli.setImageResource(R.mipmap.f1d10);
//                pit.setImageResource(R.mipmap.p10);
                break;
            }
            case 11: {
                asli.setImageResource(R.mipmap.f2d1);
//                pit.setImageResource(R.mipmap.p11);
                break;
            }
            case 12: {
                asli.setImageResource(R.mipmap.f2d2);
//                pit.setImageResource(R.mipmap.p12);
                break;
            }
            case 13: {
                asli.setImageResource(R.mipmap.f2d3);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 14: {
                asli.setImageResource(R.mipmap.f2d4);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 15: {
                asli.setImageResource(R.mipmap.f2d5);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 16: {
                asli.setImageResource(R.mipmap.f2d6);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 17: {
                asli.setImageResource(R.mipmap.f2d7);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 18: {
                asli.setImageResource(R.mipmap.f2d8);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 19: {
                asli.setImageResource(R.mipmap.f2d9);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 20: {
                asli.setImageResource(R.mipmap.f2d10);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 21: {
                asli.setImageResource(R.mipmap.f3d1);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 22: {
                asli.setImageResource(R.mipmap.f3d2);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 23: {
                asli.setImageResource(R.mipmap.f3d3);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 24: {
                asli.setImageResource(R.mipmap.f3d4);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 25: {
                asli.setImageResource(R.mipmap.f3d5);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 26: {
                asli.setImageResource(R.mipmap.f3d6);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 27: {
                asli.setImageResource(R.mipmap.f3d7);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 28: {
                asli.setImageResource(R.mipmap.f3d8);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 29: {
                asli.setImageResource(R.mipmap.f3d9);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 30: {
                asli.setImageResource(R.mipmap.f3d10);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 31: {
                asli.setImageResource(R.mipmap.f4d1);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 32: {
                asli.setImageResource(R.mipmap.f4d2);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 33: {
                asli.setImageResource(R.mipmap.f4d3);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 34: {
                asli.setImageResource(R.mipmap.f4d4);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 35: {
                asli.setImageResource(R.mipmap.f4d5);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 36: {
                asli.setImageResource(R.mipmap.f4d6);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 37: {
                asli.setImageResource(R.mipmap.f4d7);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 38: {
                asli.setImageResource(R.mipmap.f4d8);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 39: {
                asli.setImageResource(R.mipmap.f4d9);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 40: {
                asli.setImageResource(R.mipmap.f4d10);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 41: {
                asli.setImageResource(R.mipmap.f5d1);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 42: {
                asli.setImageResource(R.mipmap.f5d2);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 43: {
                asli.setImageResource(R.mipmap.f5d3);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 44: {
                asli.setImageResource(R.mipmap.f5d4);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 45: {
                asli.setImageResource(R.mipmap.f5d5);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 46: {
                asli.setImageResource(R.mipmap.f5d6);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 47: {
                asli.setImageResource(R.mipmap.f5d7);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 48: {
                asli.setImageResource(R.mipmap.f5d8);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 49: {
                asli.setImageResource(R.mipmap.f5d9);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 50: {
                asli.setImageResource(R.mipmap.f5d10);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 51: {
                asli.setImageResource(R.mipmap.f6d1);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 52: {
                asli.setImageResource(R.mipmap.f6d2);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 53: {
                asli.setImageResource(R.mipmap.f6d3);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 54: {
                asli.setImageResource(R.mipmap.f6d4);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 55: {
                asli.setImageResource(R.mipmap.f6d5);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            case 56: {
                asli.setImageResource(R.mipmap.f6d6);
//                pit.setImageResource(R.mipmap.p13);
                break;
            }
            //todo  case 13 ta 56 darsakan dabe benosre
        }
//        s= C.getString(2);
//        TextView matn = (TextView)findViewById(R.id.textView);
//        matn.setText(s);
        if(db.exists()){
            TestAdapter mDbhealper =new TestAdapter(this);
            mDbhealper.createDatabase();
            mDbhealper.open();
            Cursor C =mDbhealper.getTestData("select * from tbl1 where id="+getIntent().getStringExtra("dars"));
            C.moveToFirst();
            String s = C.getString(1);
            TextView enwan = (TextView) findViewById(R.id.textView2);
            enwan.setText(s);
            s= C.getString(2);
            TextView matn = (TextView)findViewById(R.id.textView);
            matn.setText(s);
        }else{
            File dir = new File(db.getParent());
            if (!dir.exists()) {
                dir.mkdirs();
            }
            Toast.makeText(this,"مشکلا تصال دیتابیس",Toast.LENGTH_LONG).show();
        }
    }
    public void onClickBargasht (View view){finish();}
    public void onClickChalaki(View view){
        Intent intent= new Intent(this , Chalaki1.class);
        intent.putExtra("chalakiDars",getIntent().getStringExtra("dars"));
        startActivity(intent);
    }
}
