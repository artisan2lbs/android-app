package cn.eoe.app.slidingmenu;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

/**
 * 额滴神！！！！！
 * 这个代码我猜绝对是在国外小伙伴哪里拿过来的，别问我为什么知道！！因为我就是知道，╭(╯^╰)╮。
 * 因为注释全是英文的，关键是居然有注释，有注释，有注释！！！！！
 * 
 * 滑动Activity的接口，具体怎么用的还要仔细读读。（~~~~(>_<)~~~~英文不怎么好！）
 * 
 * @author DistantSaviour
 *
 */
public interface SlidingActivityBase {
	
	/**
	 * Set the behind view content to an explicit view. This view is placed directly into the behind view 's view hierarchy.
	 * It can itself be a complex view hierarchy.
	 *
	 * @param view The desired content to display.
	 * @param layoutParams Layout parameters for the view.
	 */
	public void setBehindContentView(View view, LayoutParams layoutParams);

	/**
	 * Set the behind view content to an explicit view. This view is placed directly into the behind view 's view hierarchy.
	 * It can itself be a complex view hierarchy. When calling this method, the layout parameters of the specified
	 * view are ignored. Both the width and the height of the view are set by default to MATCH_PARENT. To use your
	 * own layout parameters, invoke setContentView(android.view.View, android.view.ViewGroup.LayoutParams) instead.
	 *
	 * @param view The desired content to display.
	 */
	public void setBehindContentView(View view);

	/**
	 * Set the behind view content from a layout resource. The resource will be inflated, adding all top-level views
	 * to the behind view.
	 *
	 * @param layoutResID Resource ID to be inflated.
	 */
	public void setBehindContentView(int layoutResID);

	/**
	 * Gets the SlidingMenu associated with this activity.
	 *
	 * @return the SlidingMenu associated with this activity.
	 */
	public SlidingMenu getSlidingMenu();
		
	/**
	 * Toggle the SlidingMenu. If it is open, it will be closed, and vice versa.
	 */
	public void toggle();
	
	/**
	 * Close the SlidingMenu and show the content view.
	 */
	public void showContent();
	
	/**
	 * Open the SlidingMenu and show the menu view.
	 */
	public void showMenu();

	/**
	 * Open the SlidingMenu and show the secondary (right) menu view. Will default to the regular menu
	 * if there is only one.
	 */
	public void showSecondaryMenu();
	
	/**
	 * Controls whether the ActionBar slides along with the above view when the menu is opened,
	 * or if it stays in place.
	 *
	 * @param slidingActionBarEnabled True if you want the ActionBar to slide along with the SlidingMenu,
	 * false if you want the ActionBar to stay in place
	 */
	public void setSlidingActionBarEnabled(boolean slidingActionBarEnabled);
	
}