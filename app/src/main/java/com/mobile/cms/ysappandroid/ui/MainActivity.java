package com.mobile.cms.ysappandroid.ui;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import com.mobile.cms.ysappandroid.R;
import com.mobile.cms.ysappandroid.base.BaseActivity;
import com.mobile.cms.ysappandroid.ui.homepage.MainHomeFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;

import static com.zhusx.core.utils._Activitys._addFragment;


public class MainActivity extends BaseActivity {
    Fragment[] fragments = new Fragment[4];
    @BindView(R.id.radioGroup)
    RadioGroup mRadioGroup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mRadioGroup.check(R.id.radio_home);
    }

    @OnCheckedChanged({R.id.radio_home, R.id.radio_channel, R.id.radio_rank, R.id.radio_me})
    public  void onCheckedChanged(CompoundButton v ,boolean isChecked){
        if(!isChecked) {
            return;
        }
        int i=0;
        switch (v.getId()){
            case  R.id.radio_home:
                i=0;
                if(fragments[i]==null){
                    fragments[i] = new MainHomeFragment();
                }
                break;
        }

        if (fragments[i] == null) {
            fragments[i] = new MainHomeFragment();
        }
        showFragment(fragments[i]);
    }
    private Fragment currentFragment;
    public void showFragment(Fragment fragment){
        if (currentFragment!=null){
            if (currentFragment == fragment){
                return;
            }
        }

        _addFragment(this, R.id.content, currentFragment, fragment);
        currentFragment = fragment;


    }

    AlertDialog exitDialog;
    @Override
    public void onBackPressed() {
        if(exitDialog==null){
            exitDialog = new AlertDialog.Builder(this).setTitle(getTitle()).setIcon(R.mipmap.ic_launcher).setMessage("确认退出"+getTitle()+"吗？").setNegativeButton("再看看",null).setPositiveButton("退出", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            }).create();

        }
        exitDialog.show();
    }
}
