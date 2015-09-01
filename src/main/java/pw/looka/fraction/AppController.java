package pw.looka.fraction;

import org.apache.commons.math3.fraction.Fraction;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pw.looka.fraction.math.FractionCalculator;

import javax.validation.Valid;

@Controller
public class AppController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView handleFormRequest() {
		ModelAndView modelAndView = new ModelAndView("request_form");
		modelAndView.addObject("title", App.SITE_NAME);
		return modelAndView;
	}

	@RequestMapping(value="/submit", method = RequestMethod.POST)
	public ModelAndView handleFormSubmit(@Valid FracQuestion question, BindingResult result) {

		if(result.hasErrors()) {
			ModelAndView errorView = new ModelAndView("error");
			errorView.addObject("error", "You did not enter data correctly!");
			return errorView;
		}
		FractionCalculator calculator = new FractionCalculator();
		Fraction answer = calculator.solve(question);
		ModelAndView answerView = new ModelAndView("answer");
		answerView.addObject("answer", answer);
		return answerView;
	}
}