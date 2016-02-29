package dhirain.com.swipe2;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.format.DateFormat;
import android.util.Log;
import android.util.Size;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by dhirain on 27/2/16.
 */
class MyPhoneStateListener extends PhoneStateListener {

    static List<String> callLog=new ArrayList<String>();
    String callingNumber;

    // LinearLayout linearLayout;

    public void onCallStateChanged(int state, String incomingNumber) {

        try {
            if (state == TelephonyManager.CALL_STATE_RINGING ) {



                Log.d("MyPhoneListener1",state+"   incoming no:"+incomingNumber);
                callingNumber=incomingNumber;
                //callLog.add(incomingNumber);
                Log.d("Size", Integer.toString(callLog.size()));
                Log.d("CallLog-ArrayList", callLog.toString());

                Date d = new Date();
                CharSequence s  = DateFormat.format("yy-MM-dd hh:mm:ss", d.getTime());

                String callInfo= "Number: "+incomingNumber+"\nTime: "+s;
                callLog.add(callInfo);


                Log.d("time",s.toString());

            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        super.onCallStateChanged(state, incomingNumber);

    }
}

