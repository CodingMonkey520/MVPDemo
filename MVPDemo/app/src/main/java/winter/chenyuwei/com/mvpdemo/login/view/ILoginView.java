package winter.chenyuwei.com.mvpdemo.login.view;

/**
 * Created by ViVi on 2016/1/10.
 */

public interface ILoginView {
    public void onClearText();
    public void onLoginResult(Boolean result, int code);
    public void onSetProgressBarVisibility(int visibility);
}