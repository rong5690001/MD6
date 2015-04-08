package material.chen.org.baseapplication.view;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.transition.TransitionInflater;
import material.chen.org.baseapplication.R;
import material.chen.org.baseapplication.model.IconModel;

/**
 * Created by Administrator on 2015/4/8.
 */
public class DetilActivity extends ActionBarActivity {

    private IconModel iconModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil);
        if(Build.VERSION.SDK_INT >= 21){
            getWindow().setSharedElementEnterTransition(TransitionInflater.from(this).inflateTransition(R.transition.enter_detil_activity));
        }


    }
}
