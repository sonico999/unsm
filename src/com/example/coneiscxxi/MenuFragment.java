package com.example.coneiscxxi;

import com.actionbarsherlock.view.MenuItem;
import com.example.menu.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.ListFragment;

@SuppressLint("NewApi")
public class MenuFragment extends ListFragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.menu_list, null);
	}

	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		SampleAdapter adapter = new SampleAdapter(getActivity());
		adapter.add(new SampleItem("Conocenos",
				android.R.drawable.ic_menu_search));
		adapter.add(new SampleItem("XXICONEISC",
				android.R.drawable.ic_menu_search));
		adapter.add(new SampleItem("Cronograma",
				android.R.drawable.ic_menu_search));
		adapter.add(new SampleItem("Costo de vida",
				android.R.drawable.ic_menu_search));
		adapter.add(new SampleItem("Como llegar",
				android.R.drawable.ic_menu_search));
		adapter.add(new SampleItem("Agencias",
				android.R.drawable.ic_menu_search));
		setListAdapter(adapter);
	}

	private class SampleItem {
		public String tag;
		public int iconRes;

		public SampleItem(String tag, int iconRes) {
			this.tag = tag;
			this.iconRes = iconRes;
		}
	}

	public class SampleAdapter extends ArrayAdapter<SampleItem> {

		public SampleAdapter(Context context) {
			super(context, 0);
		}

		
		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = LayoutInflater.from(getContext()).inflate(
						R.layout.menu_row, null);
			}
			ImageView icon = (ImageView) convertView
					.findViewById(R.id.row_icon);
			icon.setImageResource(getItem(position).iconRes);
			TextView title = (TextView) convertView
					.findViewById(R.id.row_title);
			title.setText(getItem(position).tag);
			//Toast.makeText(this.getContext(), "Posicion "+position, Toast.LENGTH_SHORT).show();
	        //toast.show();
			return convertView;
		}

	}
	
	
	public boolean onOptionsItemSelected(MenuItem item) {
		//Toast.makeText(this.getActivity(), "Posicion "+item.getItemId(), Toast.LENGTH_SHORT).show();
		switch (item.getItemId()) {

		// case R.id.menu_search:
		// onSearchRequested();

		// return true;
		
		default:
			return onOptionsItemSelected(item);
		}
	}

}