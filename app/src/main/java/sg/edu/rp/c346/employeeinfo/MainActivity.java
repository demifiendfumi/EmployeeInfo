package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvInfo;
    ArrayList<InfoItem> infoList;
    CustomAdapter caInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvInfo = (ListView)findViewById(R.id.listViewInfo);
        infoList = new ArrayList<InfoItem>();

        caInfo = new CustomAdapter(this, R.layout.info_item, infoList);
        lvInfo.setAdapter(caInfo);

        InfoItem item1 = new InfoItem("John","Software Technical Leader", 3400.0);
        infoList.add(item1);

        InfoItem item2 = new InfoItem("May","Programmer", 2200.0);
        infoList.add(item2);
    }
}
