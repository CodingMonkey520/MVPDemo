package winter.chenyuwei.com.mvpdemo.login.model;

/**
 * Created by ViVi on 2016/1/10.
 */
public interface IUser {
    String getName();
    String getPasswd();
    int checkUserValidity(String name, String passwd);
}