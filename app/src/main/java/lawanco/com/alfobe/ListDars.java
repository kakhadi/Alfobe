package lawanco.com.alfobe;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class ListDars extends AppCompatActivity {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_fasle_aval);
    }

    private static String DB_PATH = "";// "/data/data/lawanco.com.alfobe/databases/";
    private static String DB_NAME = "dbalfobe.db3";

    private void matnDars(String Dars) {
        TestAdapter mDbHelper = new TestAdapter(this);
        mDbHelper.createDatabase();
        File db = new File(this.getDatabasePath(DB_NAME).getPath());
        if (db.exists()) {

            mDbHelper.open();
            Cursor C;
            C = mDbHelper.getTestData("select * from tbl1 WHERE id=" + Dars);
            C.moveToFirst();
            String S = C.getString(13);
            if (S.equals("1")) {
                Intent intent = new Intent(ListDars.this, MatnDars.class);
                intent.putExtra("dars", Dars);
                startActivity(intent);
            } else {
                Toast.makeText(this, "قفلە", Toast.LENGTH_LONG).show();
            }
            mDbHelper.close();
        } else {
            File dir = new File(db.getParent());
            if (!dir.exists()) {
                dir.mkdirs();
            }
            Toast.makeText(this, "مشکل اتصال دیتابیس", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickdars1(View view) {
        matnDars("1");
    }

    public void onClickdars2(View view) {
        matnDars("2");
    }

    public void onClickdars3(View view) {
        matnDars("3");
    }

    public void onClickdars4(View view) {
        matnDars("4");
    }

    public void onClickdars5(View view) {
        matnDars("5");
    }

    public void onClickdars6(View view) {
        matnDars("6");
    }

    public void onClickdars7(View view) {
        matnDars("7");
    }

    public void onClickdars8(View view) {
        matnDars("8");
    }

    public void onClickdars9(View view) {
        matnDars("9");
    }

    public void onClickdars10(View view) {
        matnDars("10");
    }
}