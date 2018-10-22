package org.churchsource.song;

import java.net.MalformedURLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("wpsongmanager")
@Slf4j
public class WPSongManagerController {

  private static final String SERMON_PLANNER_LINK 
    = "https://spreadsheets.google.com/feeds/list/19fmsMGR_yNdaGO3vXZHpEaPe6W3x279orFcbXwx7UtQ/2/public/values?alt=json";

  //@Autowired
  //private SermonPlannerRepository sermonPlannerRepository;

  //@Autowired
  //private SermonPlannerFactory sermonPlannerFactory;


  @GetMapping("/{name}")
  public String helloWorld(@PathVariable String name) {
    return "hello world: " + name;
  }

  /*@RequestMapping(value = "/sync", method = RequestMethod.POST)
  public String sync() throws Exception {
    RestTemplate restTemplate = new RestTemplate();
    syncSermonPlanner(restTemplate);
    return null;
  }

  private void syncSermonPlanner(RestTemplate restTemplate) throws Exception {
    GoogleSheetSermonPlanner sermonPlanner = restTemplate.getForObject(SERMON_PLANNER_LINK, GoogleSheetSermonPlanner.class);
    for(Entry plannerEntry: sermonPlanner.getFeed().getEntry()) {
      SermonPlannerItem item = sermonPlannerFactory.createSermonPlannerItem(plannerEntry);
      sermonPlannerRepository.saveOrUpdateSermonPlanningItem(item);
      log.info(item.toString());
    }
  }*/
}
