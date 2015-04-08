package material.chen.org.baseapplication.util;

import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Administrator on 2015/4/8.
 */
public class AnimationUtil {

    public static void animateItem(RecyclerView.ViewHolder holder, boolean goDown){

        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(holder.itemView, "translationY", goDown ?-100 : 100, 0);

        objectAnimator.setDuration(1000);
        objectAnimator.start();


    }

    public static void animation(View view){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, "translationY", -100, 0);

        objectAnimator.setDuration(1000);
        objectAnimator.start();
    }



}
