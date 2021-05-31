package controller.auc;

import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("Auc/auc/*")
public class AucController {
	private AucDao aucDao;
	
	// 경매 생성하기
	@RequestMapping(value='/auc/register',method=RequestMethod.POST)
	public String RegisterAuc(AucDao ad) throws Exception{
		AucDAO.register(ad);
		return "auc/list";
	}
	
	// 경매 목록
	@RequestMapping(value='/auc/list', methode=RequestMethod.GET)
	public void getAucList(Model model) throw Exception{
		Logger.info("");
		List<Auc> list = auc.auclist();
		
		model.addAttribute("list",list);
	}
}
