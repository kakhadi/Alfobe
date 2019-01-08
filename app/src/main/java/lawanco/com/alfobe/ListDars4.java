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

public class ListDars4 extends AppCompatActivity {
    // private static String DB_PATH = "/data/data/lawanco.com.alfobe/databases/";
    private static String DB_NAME = "dbalfobe.db3";
    @Override
    public void onCreate (Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_fasle_choarom);
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

    public void onClickdars30(View view)
    {
        matnDars("30");
    }
    public void onClickdars31(View view)
    {
        matnDars("31");
    }
    public void onClickdars32(View view)
    {
        matnDars("32");
    }
    public void onClickdars33(View view)
    {
        matnDars("33");
    }
    public void onClickdars34(View view)
    {
        matnDars("34");
    }
    public void onClickdars35(View view)
    {
        matnDars("35");
    }
    public void onClickdars36(View view)
    {
        matnDars("36");
    }
    public void onClickdars37(View view)
    {
        matnDars("37");
    }
    public void onClickdars38(View view)
    {
        matnDars("38");
    }
    public void onClickdars39(View view)
    {
        matnDars("39");
    }
    public void onClickdars40(View view)
    {
        matnDars("40");
    }
}
