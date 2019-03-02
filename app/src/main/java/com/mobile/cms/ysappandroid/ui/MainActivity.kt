package com.mobile.cms.ysappandroid.ui

import android.app.AlertDialog
import android.content.DialogInterface
import android.support.v4.app.Fragment
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.RadioGroup
import butterknife.OnCheckedChanged
import com.mobile.cms.ysappandroid.R

import com.mobile.cms.ysappandroid.base.BaseActivity
import com.mobile.cms.ysappandroid.ui.homepage.MainHomeFragment


import com.zhusx.core.utils._Activitys._addFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    internal var fragments = arrayOfNulls<Fragment>(4)
    private var currentFragment: Fragment? = null

    internal var exitDialog: AlertDialog? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioGroup!!.check(R.id.radio_home)
    }

    @OnCheckedChanged(R.id.radio_home, R.id.radio_channel, R.id.radio_rank, R.id.radio_me)
    fun onCheckedChanged(v: CompoundButton, isChecked: Boolean) {
        if (!isChecked) {
            return
        }
        var i = 0
        when (v.id) {
            R.id.radio_home -> {
                i = 0
                if (fragments[i] == null) {
                    fragments[i] = MainHomeFragment()
                }
            }
        }

        if (fragments[i] == null) {
            fragments[i] = MainHomeFragment()
        }
        showFragment(fragments[i]!!)
    }

    fun showFragment(fragment: Fragment) {
        if (currentFragment != null) {
            if (currentFragment === fragment) {
                return
            }
        }

        _addFragment(this, R.id.content, currentFragment, fragment)
        currentFragment = fragment


    }

    override fun onBackPressed() {
        if (exitDialog == null) {
            exitDialog = AlertDialog.Builder(this).setTitle(title).setIcon(R.mipmap.ic_launcher).setMessage("确认退出" + title + "吗？").setNegativeButton("再看看", null).setPositiveButton("退出", DialogInterface.OnClickListener { dialogInterface, i -> finish() }).create()

        }
        exitDialog!!.show()
    }
}
