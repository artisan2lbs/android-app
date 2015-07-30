package cn.eoe.app;

import java.io.File;

import android.app.Application;

/**
 * 这里。。。。
 * (⊙﹏⊙)b
 * 一片狼藉
 * 这是怎么了，除了给带了一个貌似没什么卵用的缓存目录之外！！！！！根本就没做什么
 * :-(  桑心ing
 * 
 * @author DistantSaviour
 *
 */
public class MyApplication extends Application {
	//根据命名判断，应该是缓存目录吧，貌似，应该，也许，大概，Ｏ(≧口≦)Ｏ
//	在这里分明就没有什么卵用啊！！！！
	public static File cacheDir;
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
		
		//注释中的部分应该就是创建缓存的，为毛干掉了╭(╯^╰)╮
//		if (!CommonUtil.sdCardIsAvailable()) { // sdcard not available
//			cacheDir = new File(Environment.getDataDirectory().getAbsolutePath() + "/data/" + getPackageName()
//					+ "/eoecn/cache/imgs");
//		} else {
//			cacheDir = new File(Constants.CachePath.IMAGE_CACHE_PATH);
//		}
//		
		//WOW ！！！居然这么依赖图片，然并卵！！！
//		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
//        .memoryCacheExtraOptions(480, 800) // default = device screen dimensions
//        .discCacheExtraOptions(480, 800, CompressFormat.JPEG, 75)
//        .threadPoolSize(3) // default
//        .threadPriority(Thread.NORM_PRIORITY - 1) // default
//        .denyCacheImageMultipleSizesInMemory()
//        .offOutOfMemoryHandling()
//        .memoryCache(new UsingFreqLimitedMemoryCache(2 * 1024 * 1024)) // default
//        .discCache(new UnlimitedDiscCache(cacheDir)) // default
//        .discCacheSize(50 * 1024 * 1024)
//        .discCacheFileCount(100)
//        .discCacheFileNameGenerator(new HashCodeFileNameGenerator()) // default
//        .imageDownloader(new URLConnectionImageDownloader()) // default
//        .tasksProcessingOrder(QueueProcessingType.FIFO) // default
//        .defaultDisplayImageOptions(DisplayImageOptions.createSimple()) // default
//        .enableLogging()
//        .build();
//		ImageLoader.getInstance().init(config);


		
	}
	
	
	}
