package com.example.mymemoapp;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class tugasSaya extends Activity {

    public static class Bahasa {

        private static boolean selected;
        String id = null;
        String name = null;

        public Bahasa(String id, String name, boolean selected) {
            super();
            this.id = id;
            this.name = name;
            this.selected = selected;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static boolean setSelected() {
            return selected = selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

    }

    MyCustomAdapter dataAdapter = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_saya);
        Button myButton = (Button) findViewById(R.id.button1);
        myButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer responseText = new StringBuffer();
                responseText.append("Bahasa Pemrograman Yang Dikuasai Adalah");

                ArrayList<Bahasa> bahasaList = dataAdapter.bahasaList;
                for (int i = 0; i < bahasaList.size(); i++){
                    Bahasa bahasa = bahasaList.get(i);
                    if (Bahasa.setSelected()){
                        responseText.append("\n" + bahasa.getName());
                    }
                }
            }
        });
        displayListView();
    }
    private void displayListView() {

        // Mendeklarasikan  arraylist bahasList dan menginisialiasai dengan 7 data
        ArrayList<Bahasa> bahasaList = new ArrayList<Bahasa>();
        Bahasa bahasa = new Bahasa("1", "Memasak", true);
        bahasaList.add(bahasa);
        bahasa = new Bahasa("2", "Olahraga", false);
        bahasaList.add(bahasa);
        bahasa = new Bahasa("3", "Tidur Siang", false);
        bahasaList.add(bahasa);
        bahasa = new Bahasa("4", "Belanja", false);
        bahasaList.add(bahasa);
        bahasa = new Bahasa("5", "Event", true);
        bahasaList.add(bahasa);
        bahasa = new Bahasa("6", "Diet", false);
        bahasaList.add(bahasa);

        // Buata array adapter dari data bahasaList
        dataAdapter = new MyCustomAdapter(this, R.layout.bahasa_row,
                bahasaList);
        ListView listView = (ListView) findViewById(R.id.listView1);
        // Assign adapter to ListView
        listView.setAdapter(dataAdapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                Bahasa bahasa = (Bahasa) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),
                        "Clicked on Row: " + bahasa.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    private class MyCustomAdapter extends ArrayAdapter<Bahasa> {

        private ArrayList<Bahasa> bahasaList;

        public MyCustomAdapter(Context context, int textViewResourceId,
                               ArrayList<Bahasa> bahasaList) {
            super(context, textViewResourceId, bahasaList);
            this.bahasaList = new ArrayList<Bahasa>();
            this.bahasaList.addAll(bahasaList);
        }

        private class ViewHolder {
            TextView id;
            CheckBox name;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder holder = null;
            Log.v("ConvertView", String.valueOf(position));

            if (convertView == null) {
                LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = vi.inflate(R.layout.bahasa_row, null);

                holder = new ViewHolder();
                holder.id = (TextView) convertView.findViewById(R.id.code);
                holder.name = (CheckBox) convertView
                        .findViewById(R.id.checkBox1);
                convertView.setTag(holder);

                holder.name.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        CheckBox cb = (CheckBox) v;
                        Bahasa bahasa = (Bahasa) cb.getTag();
                        Toast.makeText(
                                getApplicationContext(),
                                "Clicked on Checkbox: " + cb.getText() + " is "
                                        + cb.isChecked(), Toast.LENGTH_SHORT)
                                .show();
                        bahasa.setSelected(cb.isChecked());
                    }
                });
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            Bahasa bahasa = bahasaList.get(position);
            holder.id.setText(" (id:" + bahasa.getId() + ")");
            holder.name.setText(bahasa.getName());
            holder.name.setChecked(bahasa.setSelected());
            holder.name.setTag(bahasa);

            return convertView;
        }
    }
}

