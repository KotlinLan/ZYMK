package top.wzmyyj.zymk.app.tools;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import jp.wasabeef.glide.transformations.BlurTransformation;
import top.wzmyyj.zymk.R;

/**
 * Created by yyj on 2018/07/09. email: 2209011667@qq.com
 */

public class G {

    public static void img(Context context, String url, ImageView img) {
        Glide.with(context)
                .load(url)
                .centerCrop()
//                .placeholder(R.mipmap.ic_progress)
                .error(R.mipmap.ic_error)
                .crossFade(100)
                .into(img);
    }

    public static void imgBlur(Context context, String url, ImageView img, int r) {
        if (url == null) return;
        Glide.with(context)
                .load(url)
//                .centerCrop()
//                .placeholder(R.mipmap.ic_progress)
                .error(R.mipmap.ic_error)
                .crossFade(200)
                .bitmapTransform(new BlurTransformation(context, r, 4))
                .into(img);
    }

    public static void img(Context context, int res_id, ImageView img) {
        Glide.with(context)
                .load(res_id)
                .centerCrop()
//                .placeholder(R.mipmap.ic_progress)
                .error(R.mipmap.ic_error)
                .crossFade()
                .into(img);
    }
}
