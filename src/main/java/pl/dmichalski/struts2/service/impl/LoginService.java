package pl.dmichalski.struts2.service.impl;

import pl.dmichalski.struts2.model.User;
import pl.dmichalski.struts2.service.ILoginService;

/**
 * Author: Daniel
 */
public class LoginService implements ILoginService {

    @Override
    public boolean verifyLogin(User user) {
        String userId = user.getUserId();
        String password = user.getPassword();

        if ("test".equals(userId) && "test".equals(password)) {
            return true;
        }
        return false;
    }

}
