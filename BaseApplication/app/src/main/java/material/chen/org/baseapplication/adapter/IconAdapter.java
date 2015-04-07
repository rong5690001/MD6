package material.chen.org.baseapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.IconicsImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import material.chen.org.baseapplication.R;
import material.chen.org.baseapplication.view.MainActivity;

/**
 * Created by Administrator on 2015/4/7.
 */
public class IconAdapter extends RecyclerView.Adapter<IconAdapter.ViewHolder> {
    private List<String> icons;
    private int rowLayout;
    private MainActivity mAct;

    public IconAdapter(List<String> icons, int rowLayout, MainActivity act) {
        this.icons = icons;
        this.rowLayout = rowLayout;
        this.mAct = act;
    }

    public void setIcons(List<String> icons) {
        this.icons.addAll(icons);
        this.notifyItemRangeInserted(0, icons.size() - 1);
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {
        final String icon = icons.get(i);
        viewHolder.image.setIcon(icon);
        viewHolder.name.setText(icon);
    }

    @Override
    public int getItemCount() {
        return icons == null ? 0 : icons.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public IconicsImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            image = (IconicsImageView) itemView.findViewById(R.id.icon);
        }

    }
}
