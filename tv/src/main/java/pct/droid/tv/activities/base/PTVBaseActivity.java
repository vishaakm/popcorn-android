package pct.droid.tv.activities.base;

import pct.droid.base.torrent.Torrent;
import pct.droid.tv.activities.PTVSearchActivity;

public abstract class PTVBaseActivity extends PTVTorrentBaseActivity {

	@Override
	public boolean onSearchRequested() {
		PTVSearchActivity.startActivity(this);
		return true;
	}

	@Override
	public void onStreamMetaData(Torrent torrent) {
		//todo:
	}
}