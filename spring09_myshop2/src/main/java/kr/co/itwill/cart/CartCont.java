package kr.co.itwill.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/cart")
public class CartCont {
	
	public CartCont() {
		System.out.println("-----CartCont()객체생성됨🐸");
	}//end
	
	@Autowired
	CartDAO cartDao;
	
	@PostMapping("/insert")
	public String cartInsert(@ModelAttribute CartDTO cartDto, HttpSession session) {
			//로그인 기능을 구현했다면 session.getAttribute() 활용
			//cartDTo.setId(session.getAttribute("s_id"));
		cartDto.setId("itwill"); //여기서는 임시로 "itwill"
		cartDao.cartInsert(cartDto);
		return "redirect:/cart/list"; //장바구니 목록페이지 호출
	
	}//cartInsert() end
}//class end
