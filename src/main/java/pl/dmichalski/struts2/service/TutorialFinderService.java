package pl.dmichalski.struts2.service;

/**
 * Author: Daniel
 */
public class TutorialFinderService implements ITutorialFinderService {

    @Override
    public String getBestTutorialSite(String language) {
        if ("java".equals(language)) {
            return "Java Brains";
        } else {
            return "Language not supported yet!";
        }
    }

}
