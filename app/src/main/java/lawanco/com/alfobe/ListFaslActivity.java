package lawanco.com.alfobe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ListFaslActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_list_dars_acticity);
    }
    public void onClickFasl1(View view){
        startActivity(new Intent(this, ListDars.class));
    }
    public void onClickFasl2(View view){
        startActivity(new Intent(this, ListDars2.class));
    }
    public void onClickFasl3(View view){
        startActivity(new Intent(this, ListDars3.class));
    }
    public void onClickFasl4(View view){
        startActivity(new Intent(this, ListDars4.class));
    }
    public void onClickFasl5(View view){
        startActivity(new Intent(this, ListDars5.class));
    }
    public void onClickFasl6(View view){
        startActivity(new Intent(this, ListDars6.class));
    }
    public void onClickDars(View view)
    {
        startActivity(new Intent(this, ListFaslActivity.class));
    }

}
