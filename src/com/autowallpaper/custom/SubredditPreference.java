package com.autowallpaper.custom;

import java.util.Set;

import com.autowallpaper.helper.StringHelper;

import android.content.Context;
import android.preference.MultiSelectListPreference;
import android.util.AttributeSet;

public class SubredditPreference extends MultiSelectListPreference {
	
	public SubredditPreference(Context context) {
		this(context, null);
	}
	
	public SubredditPreference(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SubredditPreference(Context context, int entries, String title, String name) {
		super(context);
		
		this.setEntries(entries);
		this.setEntryValues(entries);
		this.setTitle(title);
		this.setKey(name);
	}

    @Override
    public CharSequence getSummary() {
		Set<String> values = getValues();
		
    	if (values.size() == 0)
    		return "None selected";
    	
    	return StringHelper.formatSubredditList(values) + " selected";
    }

    @Override
    protected void onDialogClosed(boolean positiveResult) {
		notifyChanged();
		super.onDialogClosed(positiveResult);
	}
	


}
