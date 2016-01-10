package winter.chenyuwei.com.mvpdemo.login.presenter;

import android.os.Handler;
import android.os.Looper;

import winter.chenyuwei.com.mvpdemo.login.model.IUser;
import winter.chenyuwei.com.mvpdemo.login.model.UserModel;
import winter.chenyuwei.com.mvpdemo.login.view.ILoginView;

/**
 * Created by ViVi on 2016/1/10.
 */

public interface ILoginPresenter {
    void clear();
    void doLogin(String name, String passwd);
    void setProgressBarVisiblity(int visiblity);
}
