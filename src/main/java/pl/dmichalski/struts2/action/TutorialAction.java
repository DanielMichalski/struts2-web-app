package pl.dmichalski.struts2.action;

import pl.dmichalski.struts2.service.ITutorialFinderService;
import pl.dmichalski.struts2.service.TutorialFinderService;

/**
 * Author: Daniel
 */
public class TutorialAction {

    private String bestTutorialSite;

    private String language;

    public static final String SUCCESS = "success";

    public String getTutorial() {
        ITutorialFinderService tutorialFinderService = new TutorialFinderService();
        setBestTutorialSite(tutorialFinderService.getBestTutorialSite(language));
        return SUCCESS;
    }

    public String addTutorial() {
        setBestTutorialSite("Add tutorial called");
        return SUCCESS;
    }

    public String getBestTutorialSite() {
        return bestTutorialSite;
    }

    public void setBestTutorialSite(String bestTutorialSite) {
        this.bestTutorialSite = bestTutorialSite;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
