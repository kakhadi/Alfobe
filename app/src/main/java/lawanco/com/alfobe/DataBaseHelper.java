package lawanco.com.alfobe;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;


import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;


//***********************************************
public class DataBaseHelper extends SQLiteOpenHelper
{
    private static String TAG = "DataBaseHelper"; // Tag just for the LogCat window
    //destination path (location) of our database on device
    private static String DB_PATH = "";
    private static String DB_NAME ="dbalfobe.db3";// Database name
    private SQLiteDatabase mDataBase;
    private final Context mContext;

    public DataBaseHelper(Context context)
    {
        super(context, DB_NAME, null, 1);// 1? Its database Version
        if(android.os.Build.VERSION.SDK_INT >= 17){
            DB_PATH = context.getApplicationInfo().dataDir + "/databases/";
        }
        else
        {
            DB_PATH = "/data/data/" + context.getPackageName() + "/databases/";
        }
        this.mContext = context;
    }

    public void createDataBase() throws IOException
    {
        //If the database does not exist, copy it from the assets.

        boolean mDataBaseExist = checkDataBase();
        if(!mDataBaseExist)
        {
            this.getReadableDatabase();
            this.close();
            try
            {
                //Copy the database from assests
                copyDataBase();
                Log.e(TAG, "createDatabase database created");
            }
            catch (IOException mIOException)
            {
                throw new Error("ErrorCopyingDataBase");
            }
        }
    }

    //Check that the database exists here: /data/data/your package/databases/Da Name
    private boolean checkDataBase()
    {
        File dbFile = new File(DB_PATH + DB_NAME);
        //Log.v("dbFile", dbFile + "   "+ dbFile.exists());
        return dbFile.exists();
    }

    //Copy the database from assets
    private void copyDataBase() throws IOException
    {
        InputStream mInput = mContext.getAssets().open(DB_NAME);
        String outFileName = DB_PATH + DB_NAME;
        OutputStream mOutput = new FileOutputStream(outFileName);
        byte[] mBuffer = new byte[1024];
        int mLength;
        while ((mLength = mInput.read(mBuffer))>0)
        {
            mOutput.write(mBuffer, 0, mLength);
        }
        mOutput.flush();
        mOutput.close();
        mInput.close();
    }

    //Open the database, so we can query it
    public boolean openDataBase() throws SQLException
    {
        String mPath = DB_PATH + DB_NAME;
        //Log.v("mPath", mPath);
        mDataBase = SQLiteDatabase.openDatabase(mPath, null, SQLiteDatabase.CREATE_IF_NECESSARY);
        //mDataBase = SQLiteDatabase.openDatabase(mPath, null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
        return mDataBase != null;
    }

    @Override
    public synchronized void close()
    {
        if(mDataBase != null)
            mDataBase.close();
        super.close();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
//***********************************************




//
//public class DataBaseHelper extends SQLiteOpenHelper {
//    private static String DB_PATH = "";
//    private static String DB_NAME = "dbalfobe.db3";
//    private SQLiteDatabase myDataBase;
//    private final Context myContext;
//    public DataBaseHelper(Context context) {
//        super(context, DB_NAME, null, 1);
//        if(android.os.Build.VERSION.SDK_INT >= 17){
//            DB_PATH = context.getApplicationInfo().dataDir + "/databases/";
//        }
//        else
//        {
//            DB_PATH = "/data/data/" + context.getPackageName() + "/databases/";
//        }
//
//        this.myContext = context;
//    }
//    public void createDataBase() {
//        boolean dbExist = checkDataBase();
//        if(dbExist){
////do nothing - database already exist
//        }else{
//            this.getReadableDatabase();
//            try {
//                copyDataBase();
//            } catch (IOException e) {
//                throw new Error("Error copying database");
//            }
//        }
//    }
//    private boolean checkDataBase(){
//        SQLiteDatabase checkDB = null;
//        try{
//            String myPath = DB_PATH + DB_NAME;
//            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
//        }catch(SQLiteException e){
////database does't exist yet.
//        }
//        if(checkDB != null){
//            checkDB.close();
//        }
//        return checkDB != null;
//    }
//    private void copyDataBase() throws IOException{
////Open your local db as the input stream
//        InputStream myInput = myContext.getAssets().open(DB_NAME);
//// Path to the just created empty db
//        String outFileName = DB_PATH + DB_NAME;
////Open the empty db as the output stream
//        OutputStream myOutput = new FileOutputStream(outFileName);
////transfer bytes from the inputfile to the outputfile
//        byte[] buffer = new byte[1024];
//        int length;
//        while ((length = myInput.read(buffer))>0){
//            myOutput.write(buffer, 0, length);
//        }
//        myOutput.flush();
//        myOutput.close();
//        myInput.close();
//    }
//    @Override
//    public synchronized void close() {
//        if(myDataBase != null)
//            myDataBase.close();
//        super.close();
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//
//    }
//
//
//
//
////---**********///////++++++++++++++
//
//
//}
