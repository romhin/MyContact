package com.mycompany.myapp;

import android.app.*;
import android.content.*;
import android.database.*;
import android.net.*;
import android.os.*;
import android.provider.*;
import android.widget.*;
import java.util.*;


public class MainActivity extends ListActivity implements
LoaderManager.LoaderCallbacks<Cursor>
{
	SimpleCursorAdapter mAdapter;
	@Override
	public void onLoadFinished(Loader<Cursor> p1, Cursor p2)
	{
		// TODO: Implement this method
	}


	@Override
	public Loader onCreateLoader(int p1, Bundle p2)
	{
		// TODO: Implement this method
		//Uri uri = ContactsContract.Contacts.CONTENT_URI;
        String[] projection = new String[] { ContactsContract.Contacts._ID,
            ContactsContract.Contacts.DISPLAY_NAME };
        //String selection = ContactsContract.Contacts.IN_VISIBLE_GROUP + " = '"
        //    + ("1") + "'";
        //String[] selectionArgs = null;
        //String sortOrder = ContactsContract.Contacts.DISPLAY_NAME
        //    + " COLLATE LOCALIZED ASC";
		CursorLoader cl=new CursorLoader(this,Contacts.CONTENT_URI,new String[]{ContactsContract.Contacts._ID,
																				ContactsContract.Contacts.DISPLAY_NAME_ALTERNATIVE,
																				ContactsContract.Contacts.DISPLAY_NAME,
																				ContactsContract.Contacts.LOOKUP_KEY,
																				ContactsContract.Contacts.DISPLAY_NAME_SOURCE},null,null,null);
		return cl;
		
		//return null;
	}

	@Override
	public void onLoadFinished(Loader  p1, Object p2)
	{
		//mAdapter.changeCursor(p2);
		// TODO: Implement this method
	}

    @Override
	public void onLoaderReset(Loader p1)
	{
		// TODO: Implement this method
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
												
		List<String> values = new ArrayList<String>();

		values.add("dff");
		values.add("dff");
		values.add("dff");
		
		getLoaderManager().initLoader(1,null,this);
		//Cursor cursor = getContacts();
		//mAdapter = new SimpleCursorAdapter(
		//									this,
		//									R.layout.list_item,
		//									cursor,
		//									new String[]{ContactsContract.Contacts.DISPLAY_NAME},
		//									new int[]{R.id.text1});
		
		//while (cursor.moveToNext()) {
		//	try{
		//		String displayName = 
		//					cursor.getString(cursor.getColumnIndex(ContactsContract.Data.DISPLAY_NAME));        
		//	    values.add(displayName);
		//		}catch(NullPointerException e){
		//	}

		//	ArrayAdapter<String> adapter = new ArrayAdapter<String>(
		//									this,
		//									android.R.layout.simple_list_item_1, 
		//									values);
		//setListAdapter(adapter);
		//getLoaderManager().initLoader(1,null,null);
	//}
	
	}
	@Override
	public void onListItemClick(ListView l, android.view.View v, int position, long id) {
		
		Intent intent = new Intent(this, Detail.class);
		intent.putExtra("111",l.getItemAtPosition(position).toString());
		
		startActivity(intent);
		
	}
	
	//private Cursor getContacts() {
        // Run query
        //Uri uri = ContactsContract.Contacts.CONTENT_URI;
        //String[] projection = new String[] { ContactsContract.Contacts._ID,
        //    ContactsContract.Contacts.DISPLAY_NAME };
        //String selection = ContactsContract.Contacts.IN_VISIBLE_GROUP + " = '"
        //    + ("1") + "'";
        //String[] selectionArgs = null;
        //String sortOrder = ContactsContract.Contacts.DISPLAY_NAME
        //    + " COLLATE LOCALIZED ASC";

	//	getLoaderManager().initLoader(1,null,null);
        //return managedQuery(uri, projection, selection, selectionArgs,
        //                   sortOrder);
	
		
	//}
	
}
