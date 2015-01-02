package pl.dmichalski.struts2.service;

/**
 * Author: Daniel
 */
public class TutorialFinderService implements ITutorialFinderService {

    @Override
    public String getBestTutorialSite() {
        return "Java Brains";
    }

}
