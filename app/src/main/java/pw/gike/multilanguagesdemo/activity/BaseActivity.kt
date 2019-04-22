package pw.gike.multilanguagesdemo.activity

import android.content.Context
import android.support.v7.app.AppCompatActivity
import pw.gike.multilanguagesdemo.utils.LocaleManageUtil

abstract class BaseActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(LocaleManageUtil.setLocal(newBase))
    }
}