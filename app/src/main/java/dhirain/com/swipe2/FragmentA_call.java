package dhirain.com.swipe2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

/**
 * Created by dhirain on 29/2/16.
 */
public class FragmentA_call extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragmentacall, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //return super.onCreateView(inflater, container, savedInstanceState);

        IncomingCall incomingCall=new IncomingCall();
        MyPhoneStateListener myPhoneStateListener=new MyPhoneStateListener();

        //String[] callLogarray= myPhoneStateListener.callLog.toString().;
        LinearLayout linearLayout = (LinearLayout) getView().findViewById(R.id.id_Main);
        //TextView textView=new TextView(this);

        Log.d("Calling:",myPhoneStateListener.callLog.toString());

        ArrayAdapter adapter=new ArrayAdapter(getContext(),R.layout.activity_textview,myPhoneStateListener.callLog);

        ListView listView=(ListView) getView().findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }
}
