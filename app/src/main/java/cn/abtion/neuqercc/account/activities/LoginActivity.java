package cn.abtion.neuqercc.account.activities;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;

import butterknife.BindView;
import butterknife.OnClick;
import cn.abtion.neuqercc.R;
import cn.abtion.neuqercc.base.activities.NoBarActivity;
import cn.abtion.neuqercc.main.MainActivity;
import cn.abtion.neuqercc.weight.MainViewPager;

/**
 * @author abtion.
 * @since 17/9/22 17:59.
 * email caiheng@hrsoft.net
 */

public class LoginActivity extends NoBarActivity {

    @BindView(R.id.edit_identifier)
    TextInputEditText editIdentifier;
    @BindView(R.id.edit_password)
    TextInputEditText editPassword;



    /**
     * 获取LayoutId.
     *
     * @return LayoutId 布局文件Id
     */
    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    /**
     * 初始化变量.
     */
    @Override
    protected void initVariable() {
        //loginRequest = new LoginRequest();
    }

    /**
     * 初始化View的状态，挂载各种监听事件.
     */
    @Override
    protected void initView() {

    }

    /**
     * 初始化加载页面数据.
     */
    @Override
    protected void loadData() {

    }

    /**
     * 登录按钮点击事件
     */
    @OnClick(R.id.btn_login)
    public void onBtnLoginClicked() {

        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    @OnClick(R.id.txt_register)
    public void onTxtRegisterClicked(){



        Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
        startActivity(intent);
        finish();



    }


}