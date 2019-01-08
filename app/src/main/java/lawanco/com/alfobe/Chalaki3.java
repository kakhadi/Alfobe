package lawanco.com.alfobe;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import java.io.File;

import ir.tapsell.sdk.Tapsell;
import ir.tapsell.sdk.TapsellAd;
import ir.tapsell.sdk.TapsellAdRequestListener;
import ir.tapsell.sdk.TapsellAdShowListener;

public class Chalaki3  extends AppCompatActivity {
    private static String DB_NAME = "dbalfobe.db3";
    public Context adContainer;
    private String UpdateSql(String nomra , String dars){
        TestAdapter mDbHelper = new TestAdapter(this);
        mDbHelper.createDatabase();

        File db = new File(this.getDatabasePath(DB_NAME).getPath());
        if(db.exists())
        {
            mDbHelper.open();
            Cursor C;
            mDbHelper.UpdateTest("UPDATE tbl1 SET nomra_CH3='"+String.valueOf(nomra) +"' where id=" + dars);
            mDbHelper.close();
            return "0";//C.getString(13);
        }else{
            File dir = new File(db.getParent());
            if (!dir.exists()) {
                dir.mkdirs();
            }
            mDbHelper.close();
            Toast.makeText(this,"مشکل اتصال دیتابیس",Toast.LENGTH_SHORT).show();
            return "مشکل اتصال دیتابیس";
        }
    }
    public  void setImgChalaki3(Integer Bcase){
        ImageView asli= (ImageView) findViewById(R.id.imgchalaki3);
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
            }
            case 8:
            {
                asli.setImageResource(R.mipmap.f1d8);
//                pit.setImageResource(R.mipmap.p8);
            }
            case 9:
            {
                asli.setImageResource(R.mipmap.f1d9);
//                pit.setImageResource(R.mipmap.p9);
            }
            case 10:
            {
                asli.setImageResource(R.mipmap.f1d10);
//                pit.setImageResource(R.mipmap.p10);
            }
            case 11:
            {
                asli.setImageResource(R.mipmap.f2d1);
//                pit.setImageResource(R.mipmap.p11);
            }
            case 12:
            {
                asli.setImageResource(R.mipmap.f2d2);
//                pit.setImageResource(R.mipmap.p12);
            }
            case 13:
            {
                asli.setImageResource(R.mipmap.f2d3);
//                pit.setImageResource(R.mipmap.p13);
            }
            case 14:
            {
                asli.setImageResource(R.mipmap.f2d4);
//                pit.setImageResource(R.mipmap.p14);
            }
            case 15:
            {
                asli.setImageResource(R.mipmap.f2d5);
//                pit.setImageResource(R.mipmap.p15);
            }
            case 16:
            {
                asli.setImageResource(R.mipmap.f2d6);
//                pit.setImageResource(R.mipmap.p16);
            }
            case 17:
            {
                asli.setImageResource(R.mipmap.f2d7);
//                pit.setImageResource(R.mipmap.p17);
            }
            case 18:
            {
                asli.setImageResource(R.mipmap.f2d8);
//                pit.setImageResource(R.mipmap.p18);
            }
            case 19:
            {
                asli.setImageResource(R.mipmap.f2d9);
//                pit.setImageResource(R.mipmap.p19);
            }
            case 20:
            {
                asli.setImageResource(R.mipmap.f2d10);
//                pit.setImageResource(R.mipmap.p20);
            }
            case 21:
            {
                asli.setImageResource(R.mipmap.f3d1);
//                pit.setImageResource(R.mipmap.p21);
            }
            case 22:
            {
                asli.setImageResource(R.mipmap.f3d2);
//                pit.setImageResource(R.mipmap.p22);
            }
            case 23:
            {
                asli.setImageResource(R.mipmap.f3d3);
//                pit.setImageResource(R.mipmap.p23);
            }
            case 24:
            {
                asli.setImageResource(R.mipmap.f3d4);
//                pit.setImageResource(R.mipmap.p24);
            }
            case 25:
            {
                asli.setImageResource(R.mipmap.f3d5);
//                pit.setImageResource(R.mipmap.p25);
            }
            case 26:
            {
                asli.setImageResource(R.mipmap.f3d6);
//                pit.setImageResource(R.mipmap.p26);
            }
            case 27:
            {
                asli.setImageResource(R.mipmap.f3d7);
//                pit.setImageResource(R.mipmap.p27);
            }
            case 28:
            {
                asli.setImageResource(R.mipmap.f3d8);
//                pit.setImageResource(R.mipmap.p28);
            }
            case 29:
            {
                asli.setImageResource(R.mipmap.f3d9);
//                pit.setImageResource(R.mipmap.p29);
            }
            case 30:
            {
                asli.setImageResource(R.mipmap.f3d10);
//                pit.setImageResource(R.mipmap.p30);
            }
            case 31:
            {
                asli.setImageResource(R.mipmap.f4d1);
//                pit.setImageResource(R.mipmap.p31);
            }
            case 32:
            {
                asli.setImageResource(R.mipmap.f4d2);
//                pit.setImageResource(R.mipmap.p32);
            }
            case 33:
            {
                asli.setImageResource(R.mipmap.f4d3);
//                pit.setImageResource(R.mipmap.p33);
            }
            case 34:
            {
                asli.setImageResource(R.mipmap.f4d4);
//                pit.setImageResource(R.mipmap.p34);
            }
            case 35:
            {
                asli.setImageResource(R.mipmap.f4d5);
//                pit.setImageResource(R.mipmap.p35);
            }
            case 36:
            {
                asli.setImageResource(R.mipmap.f4d6);
//                pit.setImageResource(R.mipmap.p36);
            }
            case 37:
            {
                asli.setImageResource(R.mipmap.f4d7);
//                pit.setImageResource(R.mipmap.p37);
            }
            case 38:
            {
                asli.setImageResource(R.mipmap.f4d8);
//                pit.setImageResource(R.mipmap.p38);
            }
            case 39:
            {
                asli.setImageResource(R.mipmap.f4d9);
//                pit.setImageResource(R.mipmap.p39);
            }
            case 40:
            {
                asli.setImageResource(R.mipmap.f4d10);
//                pit.setImageResource(R.mipmap.p40);
            }
            case 41:
            {
                asli.setImageResource(R.mipmap.f5d1);
//                pit.setImageResource(R.mipmap.p41);
            }
            case 42:
            {
                asli.setImageResource(R.mipmap.f5d2);
//                pit.setImageResource(R.mipmap.p42);
            }
            case 43:
            {
                asli.setImageResource(R.mipmap.f5d3);
//                pit.setImageResource(R.mipmap.p43);
            }
            case 44:
            {
                asli.setImageResource(R.mipmap.f5d4);
//                pit.setImageResource(R.mipmap.p44);
            }
            case 45:
            {
                asli.setImageResource(R.mipmap.f5d5);
//                pit.setImageResource(R.mipmap.p45);
            }
            case 46:
            {
                asli.setImageResource(R.mipmap.f5d6);
//                pit.setImageResource(R.mipmap.p46);
            }
            case 47:
            {
                asli.setImageResource(R.mipmap.f5d7);
//                pit.setImageResource(R.mipmap.p47);
            }
            case 48:
            {
                asli.setImageResource(R.mipmap.f5d8);
//                pit.setImageResource(R.mipmap.p48);
            }
            case 49:
            {
                asli.setImageResource(R.mipmap.f5d9);
//                pit.setImageResource(R.mipmap.p49);
            }
            case 50:
            {
                asli.setImageResource(R.mipmap.f5d10);
//                pit.setImageResource(R.mipmap.p50);
            }
            case 51:
            {
                asli.setImageResource(R.mipmap.f6d1);
//                pit.setImageResource(R.mipmap.p51);
            }
            case 52:
            {
                asli.setImageResource(R.mipmap.f6d2);
//                pit.setImageResource(R.mipmap.p52);
            }
            case 53:
            {
                asli.setImageResource(R.mipmap.f6d3);
//                pit.setImageResource(R.mipmap.p53);
            }
            case 54:
            {
                asli.setImageResource(R.mipmap.f6d4);
//                pit.setImageResource(R.mipmap.p54);
            }
            case 55:
            {
                asli.setImageResource(R.mipmap.f6d5);
//                pit.setImageResource(R.mipmap.p55);
            }
            case 56:
            {
                asli.setImageResource(R.mipmap.f6d6);
//                pit.setImageResource(R.mipmap.p56);
            }
        }
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chalaki3);
        TestAdapter mDbHelper = new TestAdapter(this);
        mDbHelper.createDatabase();
        File db = new File(this.getDatabasePath(DB_NAME).getPath());
        if(db.exists()){
            mDbHelper.open();
            String str = "select * from tbl1 where id="+getIntent().getStringExtra("chalaki2");
            Cursor C =mDbHelper.getTestData(str);
            C.moveToFirst();
            int aByte = 0;
            String chalaki13 =C.getString(7);
            String NumDars=C.getString(0);
            aByte  = Integer.parseInt(NumDars);
            //String strByte = getIntent().getStringExtra("chalaki2");
            //aByte = Byte.parseByte(strByte);
            setImgChalaki3(aByte);
            Button btn1 = (Button) findViewById(R.id.btnChalaki3_1) ;
            Button btn2 = (Button) findViewById(R.id.btnChalaki3_2) ;
            Button btn3 = (Button) findViewById(R.id.btnChalaki3_3) ;
            Button btn4 = (Button) findViewById(R.id.btnChalaki3_4) ;
            Button btn5 = (Button) findViewById(R.id.btnChalaki3_5) ;
            Button btn6 = (Button) findViewById(R.id.btnChalaki3_6) ;
            Button btn7 = (Button) findViewById(R.id.btnChalaki3_7) ;
            Button btn8 = (Button) findViewById(R.id.btnChalaki3_8) ;
            Button btn9 = (Button) findViewById(R.id.btnChalaki3_9) ;
            Button btn10 = (Button) findViewById(R.id.btnChalaki3_10) ;
            Button btnNextDars = (Button) findViewById(R.id.btnNextdars) ;
            if(aByte<=55) {
                String strNextDars;
                strNextDars = btnNextDars.getText() + String.valueOf(aByte + 1);
                btnNextDars.setText(strNextDars);
            }else {
                btnNextDars.setText("بژی تەواو بوو");
            }
            int i=0;
            String str1="-";
            if (chalaki13.substring(i+1,i+2).equals(str1)){
                btn1.setText(chalaki13.substring(i,i+1));
                i=i+2;
            }else{
                btn1.setText(chalaki13.substring(i,i+2));
                i=i+3;
            }
            if (chalaki13.substring(i+1,i+2).equals(str1)){
                btn2.setText(chalaki13.substring(i,i+1));
                i=i+2;
            }else{
                btn2.setText(chalaki13.substring(i,i+2));
                i=i+3;
            }
            if (chalaki13.substring(i+1,i+2).equals(str1)){
                btn3.setText(chalaki13.substring(i,i+1));
                i=i+2;
            }else{
                btn3.setText(chalaki13.substring(i,i+2));
                i=i+3;
            }
            if (chalaki13.substring(i+1,i+2).equals(str1)){
                btn4.setText(chalaki13.substring(i,i+1));
                i=i+2;
            }else{
                btn4.setText(chalaki13.substring(i,i+2));
                i=i+3;
            }
            if (chalaki13.substring(i+1,i+2).equals(str1)){
                btn5.setText(chalaki13.substring(i,i+1));
                i=i+2;
            }else{
                btn5.setText(chalaki13.substring(i,i+2));
                i=i+3;
            }
            if (chalaki13.substring(i+1,i+2).equals(str1)){
                btn6.setText(chalaki13.substring(i,i+1));
                i=i+2;
            }else{
                btn6.setText(chalaki13.substring(i,i+2));
                i=i+3;
            }
            if (chalaki13.substring(i+1,i+2).equals(str1)){
                btn7.setText(chalaki13.substring(i,i+1));
                i=i+2;
            }else{
                btn7.setText(chalaki13.substring(i,i+2));
                i=i+3;
            }
            if (chalaki13.substring(i+1,i+2).equals(str1)){
                btn8.setText(chalaki13.substring(i,i+1));
                i=i+2;
            }else{
                btn8.setText(chalaki13.substring(i,i+2));
                i=i+3;
            }
            if (chalaki13.substring(i+1,i+2).equals(str1)){
                btn9.setText(chalaki13.substring(i,i+1));
                i=i+2;
            }else{
                btn9.setText(chalaki13.substring(i,i+2));
                i=i+3;
            }
            btn10.setText(chalaki13.substring(i,chalaki13.length()));
        }else{
            File dir = new File(db.getParent());
            if (!dir.exists()) {
                dir.mkdirs();
            }
            Toast.makeText(this,"مشکل اتصال دیتابیس",Toast.LENGTH_SHORT).show();
        }

    }
    public void onClickNextDars(View view){

    }
    public void onClickbtn11( View view){
        EditText textChalaki3 = (EditText) findViewById(R.id.textChalaki3);
        Button btn1 = (Button) findViewById(R.id.btnChalaki3_1) ;
        String strText = textChalaki3.getText().toString()+btn1.getText().toString();
        textChalaki3.setText(strText);
        btn1.setEnabled(false);
        btn1.setBackground(getResources().getDrawable(R.drawable.select_shape));
        ChekingChalaki3(textChalaki3.getText().toString());
    }
    public void onClickbtn12( View view){
        EditText textChalaki3 = (EditText) findViewById(R.id.textChalaki3);
        Button btn2 = (Button) findViewById(R.id.btnChalaki3_2) ;
        textChalaki3.setText(textChalaki3.getText().toString()+btn2.getText().toString());
        btn2.setEnabled(false);
        btn2.setBackground(getResources().getDrawable(R.drawable.select_shape));
        ChekingChalaki3(textChalaki3.getText().toString());
    }
    public void onClickbtn13( View view){
        EditText textChalaki3 = (EditText) findViewById(R.id.textChalaki3);
        Button btn3 = (Button) findViewById(R.id.btnChalaki3_3) ;
        textChalaki3.setText(textChalaki3.getText().toString()+btn3.getText().toString());
        btn3.setEnabled(false);
        btn3.setBackground(getResources().getDrawable(R.drawable.select_shape));
        ChekingChalaki3(textChalaki3.getText().toString());
    }
    public void onClickbtn14( View view){
        EditText textChalaki3 = (EditText) findViewById(R.id.textChalaki3);
        Button btn4 = (Button) findViewById(R.id.btnChalaki3_4) ;
        textChalaki3.setText(textChalaki3.getText().toString()+btn4.getText().toString());
        btn4.setEnabled(false);
        btn4.setBackground(getResources().getDrawable(R.drawable.select_shape));
        ChekingChalaki3(textChalaki3.getText().toString());
    }
    public void onClickbtn15( View view){
        EditText textChalaki3 = (EditText) findViewById(R.id.textChalaki3);
        Button btn5 = (Button) findViewById(R.id.btnChalaki3_5) ;
        textChalaki3.setText(textChalaki3.getText().toString()+btn5.getText().toString());
        btn5.setEnabled(false);
        btn5.setBackground(getResources().getDrawable(R.drawable.select_shape));
        ChekingChalaki3(textChalaki3.getText().toString());
    }
    public void onClickbtn16( View view){
        EditText textChalaki3 = (EditText) findViewById(R.id.textChalaki3);
        Button btn6 = (Button) findViewById(R.id.btnChalaki3_6) ;
        textChalaki3.setText(textChalaki3.getText().toString()+btn6.getText().toString());
        btn6.setEnabled(false);
        btn6.setBackground(getResources().getDrawable(R.drawable.select_shape));
        ChekingChalaki3(textChalaki3.getText().toString());
    }
    public void onClickbtn17( View view){
        EditText textChalaki3 = (EditText) findViewById(R.id.textChalaki3);
        Button btn7 = (Button) findViewById(R.id.btnChalaki3_7) ;
        textChalaki3.setText(textChalaki3.getText().toString()+btn7.getText().toString());
        btn7.setEnabled(false);
        btn7.setBackground(getResources().getDrawable(R.drawable.select_shape));
        ChekingChalaki3(textChalaki3.getText().toString());
    }
    public void onClickbtn18( View view){
        EditText textChalaki3 = (EditText) findViewById(R.id.textChalaki3);
        Button btn8 = (Button) findViewById(R.id.btnChalaki3_8) ;
        textChalaki3.setText(textChalaki3.getText().toString()+btn8.getText().toString());
        btn8.setEnabled(false);
        btn8.setBackground(getResources().getDrawable(R.drawable.select_shape));
        ChekingChalaki3(textChalaki3.getText().toString());
    }
    public void onClickbtn19( View view){
        EditText textChalaki3 = (EditText) findViewById(R.id.textChalaki3);
        Button btn9 = (Button) findViewById(R.id.btnChalaki3_9) ;
        textChalaki3.setText(textChalaki3.getText().toString()+btn9.getText().toString());
        btn9.setEnabled(false);
        btn9.setBackground(getResources().getDrawable(R.drawable.select_shape));
        ChekingChalaki3(textChalaki3.getText().toString());
    }
    public void onClickbtn20( View view){
        EditText textChalaki3 = (EditText) findViewById(R.id.textChalaki3);
        Button btn10 = (Button) findViewById(R.id.btnChalaki3_10) ;
        textChalaki3.setText(textChalaki3.getText().toString()+btn10.getText().toString());
        btn10.setEnabled(false);
        btn10.setBackground(getResources().getDrawable(R.drawable.select_shape));
        ChekingChalaki3(textChalaki3.getText().toString());
    }
    public void onClickbtndel( View view) {
        EditText textChalaki3 = (EditText) findViewById(R.id.textChalaki3);
        Button btn1 = (Button) findViewById(R.id.btnChalaki3_1);
        Button btn2 = (Button) findViewById(R.id.btnChalaki3_2);
        Button btn3 = (Button) findViewById(R.id.btnChalaki3_3);
        Button btn4 = (Button) findViewById(R.id.btnChalaki3_4);
        Button btn5 = (Button) findViewById(R.id.btnChalaki3_5);
        Button btn6 = (Button) findViewById(R.id.btnChalaki3_6);
        Button btn7 = (Button) findViewById(R.id.btnChalaki3_7);
        Button btn8 = (Button) findViewById(R.id.btnChalaki3_8);
        Button btn9 = (Button) findViewById(R.id.btnChalaki3_9);
        Button btn10 = (Button) findViewById(R.id.btnChalaki3_10);
        String getTextChalaki3 =textChalaki3.getText().toString();
        if(getTextChalaki3.length()!=0){
            String newText=getTextChalaki3.substring(0,getTextChalaki3.length()-1);
            textChalaki3.setText(newText);
            String strDel = getTextChalaki3.substring(getTextChalaki3.length()-1,getTextChalaki3.length());
            if(strDel.equals(btn1.getText().toString())){
                btn1.setEnabled(true);
                btn1.setBackground(getResources().getDrawable(R.drawable.dars_shape));
            }else if(strDel.equals(btn2.getText().toString())){
                btn2.setEnabled(true);
                btn2.setBackground(getResources().getDrawable(R.drawable.dars_shape));
            }else if(strDel.equals(btn3.getText().toString())){
                btn3.setEnabled(true);
                btn3.setBackground(getResources().getDrawable(R.drawable.dars_shape));
            }else if(strDel.equals(btn4.getText().toString())){
                btn4.setEnabled(true);
                btn4.setBackground(getResources().getDrawable(R.drawable.dars_shape));
            }else if(strDel.equals(btn5.getText().toString())){
                btn5.setEnabled(true);
                btn5.setBackground(getResources().getDrawable(R.drawable.dars_shape));
            }else if(strDel.equals(btn6.getText().toString())){
                btn6.setEnabled(true);
                btn6.setBackground(getResources().getDrawable(R.drawable.dars_shape));
            }else if(strDel.equals(btn7.getText().toString())){
                btn7.setEnabled(true);
                btn7.setBackground(getResources().getDrawable(R.drawable.dars_shape));
            }else if(strDel.equals(btn8.getText().toString())){
                btn8.setEnabled(true);
                btn8.setBackground(getResources().getDrawable(R.drawable.dars_shape));
            }else if(strDel.equals(btn9.getText().toString())){
                btn9.setEnabled(true);
                btn9.setBackground(getResources().getDrawable(R.drawable.dars_shape));
            }else{
                btn10.setEnabled(true);
                btn10.setBackground(getResources().getDrawable(R.drawable.dars_shape));
            }
        }
    }
    public void ChekingChalaki3 (String textForChek){
        TestAdapter mDbHelper = new TestAdapter(this);
        mDbHelper.createDatabase();
        File db = new File(this.getDatabasePath(DB_NAME).getPath());
        if(db.exists()){
            mDbHelper.open();
            String str = "select * from tbl1 where id="+getIntent().getStringExtra("chalaki2");
            Cursor C1 = mDbHelper.getTestData(str);
            C1.moveToFirst();
            String Jchalaki13 =C1.getString(8);
            String nomraCH1=C1.getString(9);
            String nomraCH2=C1.getString(10);
            if(Jchalaki13.equals(textForChek)){
                UpdateSql(String.valueOf(100),getIntent().getStringExtra("chalaki2"));
                int qaboliNo =(Integer.valueOf(nomraCH1)+Integer.valueOf( nomraCH2))+100;
                qaboliNo = qaboliNo /3;
                if( qaboliNo> 49 ){
                    //todo chaki ka lerada moshkeli haya
                    Integer quflDars = Integer.parseInt(getIntent().getStringExtra("chalaki2"))+1;

                    str = "UPDATE tbl1 SET qaboli='"+ String.valueOf(qaboliNo) +"', qufl='1' where id="+String.valueOf(quflDars)+";";
                    mDbHelper.UpdateTest(str);
                }
                Intent intent = new Intent(this, ListDars.class);
                Toast.makeText(this,"بژی   برو دەرسی دوایی",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        }else{
            File dir = new File(db.getParent());
            if (!dir.exists()) {
                dir.mkdirs();
            }
            Toast.makeText(this,"مشکل اتصال دیتابیس",Toast.LENGTH_SHORT).show();
        }
    }
}