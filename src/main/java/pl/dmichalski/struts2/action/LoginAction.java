package pl.dmichalski.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.commons.lang.StringUtils;
import pl.dmichalski.struts2.model.User;
import pl.dmichalski.struts2.service.ILoginService;
import pl.dmichalski.struts2.service.impl.LoginService;

/**
 * Author: Daniel
 */
public class LoginAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    @Override
    public void validate() {
        if (StringUtils.isEmpty(user.getUserId())) {
            addFieldError("userId", "User ID cannot be blank");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            addFieldError("password", "Password cannot be blank");
        }
    }

    @Override
    public String execute() {
        ILoginService loginService = new LoginService();
        if (loginService.verifyLogin(user)) {
            return SUCCESS;
        }
        return LOGIN;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public User getModel() {
        return user;
    }

}
