/*
 * Copyright (C) 2009-2013 Felix Bechstein
 * 
 * This file is part of CallMeter 3G.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; If not, see <http://www.gnu.org/licenses/>.
 */
package de.ub0r.android.callmeter.ui;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;

import de.ub0r.android.callmeter.R;
import de.ub0r.android.lib.Utils;

/**
 * Display About {@link SherlockActivity}.
 * 
 * @author flx
 */
public final class AboutActivity extends SherlockActivity {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void onCreate(final Bundle savedInstanceState) {
		Utils.setLocale(this);
		super.onCreate(savedInstanceState);

		this.setContentView(R.layout.about);
		this.setTitle(this.getString(R.string.about_) + " " + this.getString(R.string.app_name)
				+ " v" + this.getString(R.string.app_version));
		this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean onOptionsItemSelected(final MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			this.finish();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
}
