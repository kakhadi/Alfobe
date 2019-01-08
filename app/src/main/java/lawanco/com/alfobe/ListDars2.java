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
public class ListDars2 extends AppCompatActivity {
    @Override
    public void onCreate (Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_fasle_dovom);
    }
    private static String DB_NAME = "dbalfobe.db3";
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

    public void onClickdars11(View view)
    {
        matnDars("11");
    }
    public void onClickdars12(View view)
    {
        matnDars("12");
    }
    public void onClickdars13(View view)
    {
        matnDars("13");
    }
    public void onClickdars14(View view)
    {
        matnDars("14");
    }
    public void onClickdars15(View view)
    {
        matnDars("15");
    }
    public void onClickdars16(View view)
    {
        matnDars("16");
    }
    public void onClickdars17(View view)
    {
        matnDars("17");
    }
    public void onClickdars18(View view)
    {
        matnDars("18");
    }
    public void onClickdars19(View view)
    {
        matnDars("19");
    }
    public void onClickdars20(View view)
    {
        matnDars("20");
    }
    }
