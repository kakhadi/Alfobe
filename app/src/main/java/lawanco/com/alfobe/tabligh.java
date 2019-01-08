package lawanco.com.alfobe;

import android.app.Application;
import ir.tapsell.sdk.*;


//import ir.tapsell.sdk.Tapsell;

public class tabligh extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        String appkeyStr = "cldmgqnnprlqgnfmmsfasnrrsaprtqcchiinelrhhhmjgodrsfffjqqddqkhsjcmqbatml";
        Tapsell.initialize(this,appkeyStr);


      
    }


}
