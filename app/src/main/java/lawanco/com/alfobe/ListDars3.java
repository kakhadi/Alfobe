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

public class ListDars3 extends AppCompatActivity {
        // private static String DB_PATH = "/data/data/lawanco.com.alfobe/databases/";
        private static String DB_NAME = "dbalfobe.db3";
        @Override
        public void onCreate (Bundle bundle) {
            super.onCreate(bundle);
            setContentView(R.layout.activity_fasle_sevom);
        }

        private void matnDars(String Dars){
            TestAdapter mDbHelper = new TestAdapter(this);
            mDbHelper.createDatabase();
            File db = new File(this.getDatabasePath(DB_NAME).getPath());
            if(db.exists())
            {

                mDbHelper.open();
                Cursor C;
                C = mDbHelper.getTestData("select * from tbl1 WHERE id="+Dars);
                C.moveToFirst();
                String S=C.getString(13);
                if(S.equals("1")){
                    Intent intent = new Intent(this,MatnDars.class);
                    intent.putExtra("dars",Dars);
                    startActivity(intent);
                }else{
                    Toast.makeText(this,"قفلە",Toast.LENGTH_LONG).show();
                }
                mDbHelper.close();
            }else{
                File dir = new File(db.getParent());
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                Toast.makeText(this,"مشکل اتصال دیتابیس",Toast.LENGTH_LONG).show();
            }
        }
        public void onClickdars21(View view)
        {
            matnDars("21");
        }
        public void onClickdars22(View view)
        {
            matnDars("22");
        }
        public void onClickdars23(View view)
        {
            matnDars("23");
        }
        public void onClickdars24(View view)
        {
            matnDars("24");
        }
        public void onClickdars25(View view)
        {
            matnDars("25");
        }
        public void onClickdars26(View view)
        {
            matnDars("26");
        }
        public void onClickdars27(View view)
        {
            matnDars("27");
        }
        public void onClickdars28(View view)
        {
            matnDars("28");
        }
        public void onClickdars29(View view)
        {
            matnDars("29");
        }
        public void onClickdars30(View view)
        {
            matnDars("30");
        }
        }
