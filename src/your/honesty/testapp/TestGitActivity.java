package your.honesty.testapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class TestGitActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button)findViewById(R.id.bt_me);
        button.setText("Button");
        button.setBackgroundColor(Color.RED);        
    }
    public void init(){
    	//TODO 
    	System.out.println("init");
    	System.out.println("init,too");
    }
}
