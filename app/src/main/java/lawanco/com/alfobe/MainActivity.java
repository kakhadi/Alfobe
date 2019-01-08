package lawanco.com.alfobe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.Cursor;
import android.view.View;
import android.widget.Toast;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class MainActivity extends AppCompatActivity {
//    private static String DB_PATH = "/data/data/lawanco.com.alfobe/databases/";
//    private static String DB_NAME = "dbalfobe.db3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void CopyDB(InputStream inputStream,OutputStream outputStream) throws IOException {
        //---copy 1K bytes at a time---
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }
        inputStream.close();
        outputStream.close();
    }
    public void DisplayContact(Cursor c)
    {
        Toast.makeText(this,
                "id: " + c.getString(0) + "\n" +
                        "Name: " + c.getString(1) + "\n" +
                        "Mob:  " + c.getString(2),
                Toast.LENGTH_LONG).show();
    }
    public void onClickDars(View view)
    {
        startActivity(new Intent(this, ListFaslActivity.class));
    }
    //todo bo aw clickanay xoware codi xoyan benosa
    public void onClickJayize(View view)
    {
        startActivity(new Intent(this, ListDars.class));
    }
    public void onClickPayvandi(View view)
    {
        startActivity(new Intent(this, ListDars.class));
    }
    public void onClickDare(View view)
    {
        startActivity(new Intent(this, ListDars.class));
    }
}