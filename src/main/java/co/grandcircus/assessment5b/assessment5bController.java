package co.grandcircus.assessment5b;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// Orestis Sinis

@Controller
public class assessment5bController {

	@RequestMapping("/")
	public ModelAndView home() {

		return new ModelAndView("age-selection");
	}

@RequestMapping("/submit-age")
	public ModelAndView oldEnough(@RequestParam("age") int ageOfPilot) {
	ModelAndView mv = new ModelAndView("spaceship-selection");
	if (ageOfPilot < 400 ) {
		return new ModelAndView("sorry", "message", "Sorry, you're too young.");
	} else if (ageOfPilot > 900) {
		return new ModelAndView("sorry", "message", "Sorry, you're too old.");
	}
	return mv;
	

	}

@RequestMapping("/spaceship")
public ModelAndView shipSelection(@RequestParam("spaceship-selection") String spaceship) {
	return new ModelAndView("spaceship-display", "ship", spaceship);
}

}
