package dfzy.CanvasCH;

import android.app.Activity;
import android.os.Bundle;

public class Activity01 extends Activity
{
	private CanvasCH mGameView =null;
	/** Called when the activity is first created. */
       //³õ´Îµ÷ÓÃ
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		mGameView = new CanvasCH(this);
		
		setContentView(mGameView);
	}
}
