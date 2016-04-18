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
        EditText num1 = (EditText)mainActivity.findViewById(R.id.editText2);
        num1.setText(Double.toString(3));
        EditText num2 = (EditText)mainActivity.findViewById(R.id.editText);
        num2.setText(Double.toString(2));
        Button btn = (Button)mainActivity.findViewById(R.id.button);
        btn.performClick();
        TextView textView = (TextView) mainActivity.findViewById(R.id.textView);
        assertEquals("5",textView.getText().toString());


    }

}
