package dhirain.com.swipe2;

/**
 * Created by dhirain on 29/2/16.
 */
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;



public class IncomingCall extends BroadcastReceiver {
    static MyPhoneStateListener phoneStateListener;

    @Override
    public void onReceive(Context arg0, Intent arg1) {
        TelephonyManager manager = (TelephonyManager) arg0
                .getSystemService(arg0.TELEPHONY_SERVICE);
        if (phoneStateListener == null) {
            phoneStateListener = new MyPhoneStateListener();
            manager.listen(phoneStateListener,
                    android.telephony.PhoneStateListener.LISTEN_CALL_STATE);
        }

    }

}
