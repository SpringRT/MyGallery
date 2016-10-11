package com.a11.mygallery;


import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;

public class ImageDialog extends Dialog{
    public ImageDialog(Context context, Integer imageRes) {
        super(context);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        setContentView(R.layout.dialog_image_big);

        ImageView imageBig = (ImageView) findViewById(R.id.iv_image_big);
        imageBig.setImageResource(imageRes);
        imageBig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageDialog.this.cancel();
            }
        });
    }
}
