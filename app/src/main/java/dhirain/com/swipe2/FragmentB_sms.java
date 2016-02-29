package dhirain.com.swipe2;

/**
 * Created by dhirain on 29/2/16.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class FragmentB_sms extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragmentb ,container,false );
        //return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        IncomingSms incomingSms=new IncomingSms();

        ArrayAdapter adapter=new ArrayAdapter(getContext(),R.layout.activity_list_sms,IncomingSms.smsLog);

        ListView listView=(ListView) getView().findViewById(R.id.sms_list);
        listView.setAdapter(adapter);

    }
}
