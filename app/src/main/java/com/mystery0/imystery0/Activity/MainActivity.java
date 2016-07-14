package com.mystery0.imystery0.Activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.mystery0.imystery0.BaseClass.CircleImageView;
import com.mystery0.imystery0.DatebaseHelper.LocationHelper;
import com.mystery0.imystery0.ILocationCallback;
import com.mystery0.imystery0.PublicMethod.GetHeadFile;
import com.mystery0.imystery0.PublicMethod.GetWeatherImage;
import com.mystery0.imystery0.PublicMethod.GetMenuList;
import com.mystery0.imystery0.PublicMethod.FindCityCode;
import com.mystery0.imystery0.PublicMethod.GetTemp;
import com.mystery0.imystery0.PublicMethod.GetWeatherInfo;
import com.mystery0.imystery0.R;


import java.io.File;

import cn.bmob.push.BmobPush;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobInstallation;
import cn.bmob.v3.update.BmobUpdateAgent;

/**
 * Created by myste on 2016-6-2-0002.
 * 主视图
 */
public class MainActivity extends Activity implements View.OnClickListener, ILocationCallback, AdapterView.OnItemClickListener
{
    private String District;
    private LocationHelper location;
    private FindCityCode findCityCode;
    private String txt;

    private ListView listView;
    private TextView title;
    private TextView date;
    private ImageView img_code;
    private ImageView img_refresh;
    private CircleImageView head;

    /**
     * 未来六天天气预报
     */
    private TextView tmp_0;
    private TextView tmp_1;
    private TextView tmp_2;
    private TextView tmp_3;
    private TextView tmp_4;
    private TextView tmp_5;
    private TextView tmp_6;

    private TextView time_1;
    private TextView time_2;
    private TextView time_3;
    private TextView time_4;
    private TextView time_5;
    private TextView time_6;

    private ImageView code_1;
    private ImageView code_2;
    private ImageView code_3;
    private ImageView code_4;
    private ImageView code_5;
    private ImageView code_6;

    /**
     * 静态常量
     */
    public static final int TXT = 0;
    public static final int DONE = 1;
    public static final int LOCATION = 2;
    private static final int REQUEST = 3;
    private static final int REFRESH = 25;

    public static final int TMP_0 = 4;
    public static final int TMP_1 = 5;
    public static final int TMP_2 = 6;
    public static final int TMP_3 = 7;
    public static final int TMP_4 = 8;
    public static final int TMP_5 = 9;
    public static final int TMP_6 = 10;

    public static final int DATE_0 = 11;
    public static final int DATE_1 = 12;
    public static final int DATE_2 = 13;
    public static final int DATE_3 = 14;
    public static final int DATE_4 = 15;
    public static final int DATE_5 = 16;
    public static final int DATE_6 = 17;

    public static final int CODE_0 = 18;
    public static final int CODE_1 = 19;
    public static final int CODE_2 = 20;
    public static final int CODE_3 = 21;
    public static final int CODE_4 = 22;
    public static final int CODE_5 = 23;
    public static final int CODE_6 = 24;

    /**
     * Handler消息接收判断
     */
    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {
            SharedPreferences sharedPreferences = getSharedPreferences("weather_temp", MODE_PRIVATE);
            GetTemp getTemp = new GetTemp(sharedPreferences);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            switch (msg.what)
            {
                case LOCATION:
                    title.setText(getTemp.getDistrict());
                    editor.putString("district", District);
                    editor.apply();
                    break;
                case DONE:
                    editor.putString("district", (String) msg.obj);
                    editor.apply();
                    Toast.makeText(MainActivity.this, "自动定位完成!", Toast.LENGTH_SHORT).show();
                    location.stopLocation();
                    break;
                case TXT:
                    txt = (String) msg.obj;
                    break;
                case REFRESH:
                    Toast.makeText(MainActivity.this, "刷新成功!", Toast.LENGTH_SHORT).show();
                    break;

                case CODE_0:
                    img_code.setImageResource(GetWeatherImage.get(getTemp.getCode_0()));
                    editor.putString("img_code", (String) msg.obj);
                    editor.apply();
                    break;
                case CODE_1:
                    code_1.setImageResource(GetWeatherImage.get(getTemp.getCode_1()));
                    editor.putString("code_1", (String) msg.obj);
                    editor.apply();
                    break;
                case CODE_2:
                    code_2.setImageResource(GetWeatherImage.get(getTemp.getCode_2()));
                    editor.putString("code_2", (String) msg.obj);
                    editor.apply();
                    break;
                case CODE_3:
                    code_3.setImageResource(GetWeatherImage.get(getTemp.getCode_3()));
                    editor.putString("code_3", (String) msg.obj);
                    editor.apply();
                    break;
                case CODE_4:
                    code_4.setImageResource(GetWeatherImage.get(getTemp.getCode_4()));
                    editor.putString("code_4", (String) msg.obj);
                    editor.apply();
                    break;
                case CODE_5:
                    code_5.setImageResource(GetWeatherImage.get(getTemp.getCode_5()));
                    editor.putString("code_5", (String) msg.obj);
                    editor.apply();
                    break;
                case CODE_6:
                    code_6.setImageResource(GetWeatherImage.get(getTemp.getCode_6()));
                    editor.putString("code_6", (String) msg.obj);
                    editor.apply();
                    break;

                case TMP_0:
                    tmp_0.setText(getTemp.getTmp_0());
                    editor.putString("tmp_0", msg.obj + "  " + txt);
                    editor.apply();
                    break;
                case TMP_1:
                    tmp_1.setText(getTemp.getTmp_1());
                    editor.putString("tmp_1", (String) msg.obj);
                    editor.apply();
                    break;
                case TMP_2:
                    tmp_2.setText(getTemp.getTmp_2());
                    editor.putString("tmp_2", (String) msg.obj);
                    editor.apply();
                    break;
                case TMP_3:
                    tmp_3.setText(getTemp.getTmp_3());
                    editor.putString("tmp_3", (String) msg.obj);
                    editor.apply();
                    break;
                case TMP_4:
                    tmp_4.setText(getTemp.getTmp_4());
                    editor.putString("tmp_4", (String) msg.obj);
                    editor.apply();
                    break;
                case TMP_5:
                    tmp_5.setText(getTemp.getTmp_5());
                    editor.putString("tmp_5", (String) msg.obj);
                    editor.apply();
                    break;
                case TMP_6:
                    tmp_6.setText(getTemp.getTmp_6());
                    editor.putString("tmp_6", (String) msg.obj);
                    editor.apply();
                    break;

                case DATE_0:
                    date.setText(getTemp.getDate_0());
                    editor.putString("date", (String) msg.obj);
                    editor.apply();
                    break;
                case DATE_1:
                    time_1.setText(getTemp.getDate_1());
                    editor.putString("date_1", (String) msg.obj);
                    editor.apply();
                    break;
                case DATE_2:
                    time_2.setText(getTemp.getDate_2());
                    editor.putString("date_2", (String) msg.obj);
                    editor.apply();
                    break;
                case DATE_3:
                    time_3.setText(getTemp.getDate_3());
                    editor.putString("date_3", (String) msg.obj);
                    editor.apply();
                    break;
                case DATE_4:
                    time_4.setText(getTemp.getDate_4());
                    editor.putString("date_4", (String) msg.obj);
                    editor.apply();
                    break;
                case DATE_5:
                    time_5.setText(getTemp.getDate_5());
                    editor.putString("date_5", (String) msg.obj);
                    editor.apply();
                    break;
                case DATE_6:
                    time_6.setText(getTemp.getDate_6());
                    editor.putString("date_6", (String) msg.obj);
                    editor.apply();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialization();
        /**
         * 手动定位
         */
        title.setOnClickListener(this);
        listView.setOnItemClickListener(this);
        img_refresh.setOnClickListener(this);
    }

    /**
     * 初始化
     */
    private void initialization()
    {
        Bmob.initialize(this, "7316434f9448bb798f410da5d00b1b1c");
        BmobUpdateAgent.setUpdateOnlyWifi(false);
        BmobUpdateAgent.update(this);
        /**
         * 调用更新检测
         */
        BmobInstallation.getCurrentInstallation(this).save();
        BmobPush.startWork(this);

        /**
         * 绑定视图
         */
        listView = (ListView) findViewById(R.id.list_left_drawer);
        title = (TextView) findViewById(R.id.location);
        date = (TextView) findViewById(R.id.date);
        img_refresh = (ImageView) findViewById(R.id.refresh);
        head = (CircleImageView) findViewById(R.id.img_head_main);

        time_1 = (TextView) findViewById(R.id.time_1);
        time_2 = (TextView) findViewById(R.id.time_2);
        time_3 = (TextView) findViewById(R.id.time_3);
        time_4 = (TextView) findViewById(R.id.time_4);
        time_5 = (TextView) findViewById(R.id.time_5);
        time_6 = (TextView) findViewById(R.id.time_6);
        tmp_0 = (TextView) findViewById(R.id.temperature);
        tmp_1 = (TextView) findViewById(R.id.tmp_1);
        tmp_2 = (TextView) findViewById(R.id.tmp_2);
        tmp_3 = (TextView) findViewById(R.id.tmp_3);
        tmp_4 = (TextView) findViewById(R.id.tmp_4);
        tmp_5 = (TextView) findViewById(R.id.tmp_5);
        tmp_6 = (TextView) findViewById(R.id.tmp_6);
        img_code = (ImageView) findViewById(R.id.img_weather);
        code_1 = (ImageView) findViewById(R.id.img_1);
        code_2 = (ImageView) findViewById(R.id.img_2);
        code_3 = (ImageView) findViewById(R.id.img_3);
        code_4 = (ImageView) findViewById(R.id.img_4);
        code_5 = (ImageView) findViewById(R.id.img_5);
        code_6 = (ImageView) findViewById(R.id.img_6);

        SharedPreferences sharedPreferences = getSharedPreferences("weather_temp", MODE_PRIVATE);
        GetTemp getTemp = new GetTemp(sharedPreferences);

        /**
         * 读取缓存
         */
        title.setText(getTemp.getDistrict());
        date.setText(getTemp.getDate_0());
        time_1.setText(getTemp.getDate_1());
        time_2.setText(getTemp.getDate_2());
        time_3.setText(getTemp.getDate_3());
        time_4.setText(getTemp.getDate_4());
        time_5.setText(getTemp.getDate_5());
        time_6.setText(getTemp.getDate_6());
        tmp_0.setText(getTemp.getTmp_0());
        tmp_1.setText(getTemp.getTmp_1());
        tmp_2.setText(getTemp.getTmp_2());
        tmp_3.setText(getTemp.getTmp_3());
        tmp_4.setText(getTemp.getTmp_4());
        tmp_5.setText(getTemp.getTmp_5());
        tmp_6.setText(getTemp.getTmp_6());
        img_code.setImageResource(GetWeatherImage.get(getTemp.getCode_0()));
        code_1.setImageResource(GetWeatherImage.get(getTemp.getCode_1()));
        code_2.setImageResource(GetWeatherImage.get(getTemp.getCode_2()));
        code_3.setImageResource(GetWeatherImage.get(getTemp.getCode_3()));
        code_4.setImageResource(GetWeatherImage.get(getTemp.getCode_4()));
        code_5.setImageResource(GetWeatherImage.get(getTemp.getCode_5()));
        code_6.setImageResource(GetWeatherImage.get(getTemp.getCode_6()));

        final SimpleAdapter adapter = new SimpleAdapter(
                this, GetMenuList.getList(), R.layout.item_nenu, new String[]{"pic", "text"}, new int[]{R.id.menu_image, R.id.menu_text}
        );
        listView.setAdapter(adapter);

        SharedPreferences preferences = getSharedPreferences("setting", MODE_PRIVATE);
        if (preferences.getString("image_weather", "null") != "null")
        {
            ImageView background = (ImageView) findViewById(R.id.weather_background);
            File file = new File(preferences.getString("image_weather", ""));
            if (file.exists())
            {
                Bitmap bm = BitmapFactory.decodeFile(preferences.getString("image_weather", ""));
                background.setImageBitmap(bm);
            }
        }
        if (preferences.getString("image_menu", "null") != "null")
        {
            ImageView background = (ImageView) findViewById(R.id.menu_background);
            File file = new File(preferences.getString("image_menu", ""));
            if (file.exists())
            {
                Bitmap bm = BitmapFactory.decodeFile(preferences.getString("image_menu", ""));
                background.setImageBitmap(bm);
            }
        }

        /**
         * 设置头像文件
         */
        GetHeadFile.getHeadFile(this.getApplicationContext());
        if (BitmapFactory.decodeFile(getCacheDir() + "/head/") != null)
        {
            head.setImageBitmap(BitmapFactory.decodeFile(getCacheDir() + "/head/"));
        } else
        {
            head.setImageResource(R.drawable.guest);
        }

        /**
         * 启动自动定位
         */
        location = new LocationHelper(this, this.getApplicationContext());
        location.startLocation();//获取位置信息
        findCityCode = new FindCityCode();
    }

    /**
     * 定位完成与否监听
     *
     * @param info 县名称
     */
    @Override
    public void onLocationChanged(String info)
    {
        if (District == info)
            location.stopLocation();
        else
        {
            District = info;
            title.setText(info);
            String city_code = findCityCode.Find_Code(this.getApplicationContext(), District);
            GetWeatherInfo.getWeatherCode(city_code);
            Message message = new Message();
            message.what = DONE;
            message.obj = District;
            handler.sendMessage(message);
        }
    }

    @Override
    public void onLocationError(String info)
    {
        Toast.makeText(this, info, Toast.LENGTH_SHORT).show();
    }

    /**
     * 标题点击事件,用于手动定位
     */
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.location:
                Intent intent = new Intent(MainActivity.this, List_ProvinceActivity.class);
                startActivityForResult(intent, REQUEST);
                break;
            case R.id.refresh:
                SharedPreferences sharedPreferences = getSharedPreferences("weather_temp", MODE_PRIVATE);
                GetTemp getTemp = new GetTemp(sharedPreferences);
                String city_code = findCityCode.Find_Code(this.getApplicationContext(), getTemp.getDistrict());
                GetWeatherInfo.getWeatherCode(city_code);
                Message message = new Message();
                message.what = REFRESH;
                handler.sendMessage(message);
        }
    }

    /**
     * listView点击事件
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        switch (position + 1)
        {
            case 1:
                startActivity(new Intent(MainActivity.this, MusicActivity.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, ChatActivity.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, SettingActivity.class));
                finish();
                break;
        }
    }

    /**
     * 手动定位位置activity销毁之后回调
     */

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == REQUEST)
            if (resultCode == RESULT_OK)
            {
                District = data.getStringExtra("code");
                Message message = new Message();
                message.what = LOCATION;
                message.obj = District;
                handler.sendMessage(message);
                String city_code = findCityCode.Find_Code(this.getApplicationContext(), District);
                GetWeatherInfo.getWeatherCode(city_code);
            }
    }
}
