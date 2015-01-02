package pl.dmichalski.struts2.action;

import pl.dmichalski.struts2.service.ITutorialFinderService;
import pl.dmichalski.struts2.service.TutorialFinderService;

/**
 * Author: Daniel
 */
public class TutorialAction {

    private ITutorialFinderService tutorialFinderService;

    public String execute() {
        tutorialFinderService = new TutorialFinderService();
        String bestTutorialSite = tutorialFinderService.getBestTutorialSite();



        return "success";
    }

}
