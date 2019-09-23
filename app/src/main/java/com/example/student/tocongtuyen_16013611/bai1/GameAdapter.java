package com.example.student.tocongtuyen_16013611.bai1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.student.tocongtuyen_16013611.R;

import java.util.List;

public class GameAdapter extends BaseAdapter {

    private Context cxt;
    private int layout;
    private List<Game> listGame;

    public GameAdapter(Context cxt, int layout, List<Game> listGame) {
        this.cxt = cxt;
        this.layout = layout;
        this.listGame = listGame;
    }

    @Override
    public int getCount() {
        return listGame.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) cxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout,null);


        TextView txtName = (TextView) view.findViewById(R.id.txtName);
        TextView txtGia = (TextView) view.findViewById(R.id.txtGia);
        TextView txtNuoc = (TextView) view.findViewById(R.id.txtNuoc);

        Game game = listGame.get(i);
        txtName.setText(game.getName());
        txtGia.setText(game.getGia()+"");
        txtNuoc.setText(game.getNuoc());
        return view;
    }
}
