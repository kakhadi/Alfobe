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

public class ListDars6 extends AppCompatActivity {
    // private static String DB_PATH = "/data/data/lawanco.com.alfobe/databases/";
    private static String DB_NAME = "dbalfobe.db3";
    @Override
    public void onCreate (Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_fasle_sheshom);
        TextView textView=(TextView)findViewById(R.id.textView);
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

    public void onClickdars51(View view)
    {
        matnDars("51");
    }
    public void onClickdars52(View view)
    {
        matnDars("52");
    }
    public void onClickdars53(View view)
    {
        matnDars("53");
    }
    public void onClickdars54(View view)
    {
        matnDars("54");
    }
    public void onClickdars55(View view)
    {
        matnDars("55");
    }
    public void onClickdars56(View view)
    {
        matnDars("56");
    }
}
