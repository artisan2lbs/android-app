package cn.eoe.app.ui.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import cn.eoe.app.R;

/**
 * 拓展FragmentActivity的功能
 * 1、添加了全屏特性
 * 2、添加退出动画
 * 3、添加友盟的东西（:-(又是友盟，关系就这么好咩！╭(╯^╰)╮）
 * 
 * @author DistantSaviour
 *
 */
public class BaseFragmentActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
//		设置全屏
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
//		MobclickAgent.onError(this);
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
//		MobclickAgent.onPause(this);
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
//		MobclickAgent.onResume(this);
	}
	
	public void finish() {
		super.finish();
//		设置退出动画
		overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
	}

	public void defaultFinish() {
		super.finish();
	}
}
