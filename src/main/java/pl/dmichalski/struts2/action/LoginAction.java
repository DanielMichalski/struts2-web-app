package pl.dmichalski.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang.StringUtils;

/**
 * Author: Daniel
 */
public class LoginAction extends ActionSupport {

    private String userId;

    private String password;

    @Override
    public void validate() {
        if (StringUtils.isEmpty(userId)) {
            addFieldError("userId", "User ID cannot be blank");
        }
        if (StringUtils.isEmpty(password)) {
            addFieldError("password", "Password cannot be blank");
        }
    }

    @Override
    public String execute() {
        if ("userId".equals(userId) &&
                "password".equals(password)) {
            return SUCCESS;
        }
        return LOGIN;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
