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

public class ListDars5 extends AppCompatActivity {
    // private static String DB_PATH = "/data/data/lawanco.com.alfobe/databases/";
    private static String DB_NAME = "dbalfobe.db3";
    @Override
    public void onCreate (Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_fasle_panjom);
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
    public void onClickdars41(View view)
    {
        matnDars("41");
    }
    public void onClickdars42(View view)
    {
        matnDars("42");
    }
    public void onClickdars43(View view)
    {
        matnDars("43");
    }
    public void onClickdars44(View view)
    {
        matnDars("44");
    }
    public void onClickdars45(View view)
    {
        matnDars("45");
    }
    public void onClickdars46(View view)
    {
        matnDars("46");
    }
    public void onClickdars47(View view)
    {
        matnDars("47");
    }
    public void onClickdars48(View view)
    {
        matnDars("48");
    }
    public void onClickdars49(View view)
    {
        matnDars("49");
    }
    public void onClickdars50(View view)
    {
        matnDars("50");
    }

}
