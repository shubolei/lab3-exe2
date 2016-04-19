package unit_test;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.matt.myapplication.MainActivity;
import com.example.matt.myapplication.R;


/**
 * Created by Matt on 2016/4/18.
 */
public class test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public test(){
        super(MainActivity.class);
    }
    public void test_sum(){
        mainActivity =getActivity();
        final EditText num1 = (EditText)mainActivity.findViewById(R.id.editText);
        final EditText num2 = (EditText)mainActivity.findViewById(R.id.editText2);
        final Button btn = (Button)mainActivity.findViewById(R.id.button);
        final TextView textView = (TextView) mainActivity.findViewById(R.id.textView);
        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                num1.setText(Double.toString(3));
                num2.setText(Double.toString(2));
                btn.performClick();
                assertEquals("1", textView.getText().toString());
            }
        });




    }

}
