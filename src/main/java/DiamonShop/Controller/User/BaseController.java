package DiamonShop.Controller.User;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Service.User.HomeServiceImpl;
@Controller
public class BaseController {

	@Autowired
	HomeServiceImpl _homeService;
	ModelAndView _mvShare = new ModelAndView("user/index");
	
	@PostConstruct
	public 	ModelAndView init()
	{
		_mvShare.addObject("menus",_homeService.GetDataMenus());
		return _mvShare;
	}
}
