package com.abhisheksabbarwal.absimagegallery;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;

public class ViewPagerAdapter extends PagerAdapter {

	private Context mContext;
	private ImageProvider mImageProvider;
	
	public ViewPagerAdapter( Context context )
    {
        this.mContext = context;
        mImageProvider = new ImageProvider();
    }

	public int getCount() {
		return 22;
	}

	@Override
	public Object instantiateItem(View collection, int position) {

		LayoutInflater inflater = (LayoutInflater) collection.getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		
		ImageView imageView = new ImageView(mContext);
		imageView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT));
		imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		imageView.setImageResource(mImageProvider.mThumbIds[position]);

		((ViewPager) collection).addView(imageView, 0);

		return imageView;
	}

	@Override
	public void destroyItem(View arg0, int arg1, Object arg2) {
		((ViewPager) arg0).removeView((View) arg2);

	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == ((View) arg1);

	}

	@Override
	public Parcelable saveState() {
		return null;
	}

}
