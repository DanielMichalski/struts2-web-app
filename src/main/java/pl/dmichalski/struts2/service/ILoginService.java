package pl.dmichalski.struts2.service;

import pl.dmichalski.struts2.model.User;

/**
 * Author: Daniel
 */
public interface ILoginService {

    public boolean verifyLogin(User user);

}
