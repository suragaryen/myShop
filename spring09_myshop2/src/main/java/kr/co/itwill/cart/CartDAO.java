package kr.co.itwill.cart;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAO {
		
	public CartDAO() {
		System.out.println("-----CartDAO()객체생성됨🎅");
	}//end

	@Autowired
	SqlSession sqlSession;
	
	public int cartInsert(CartDTO dto) {
		return sqlSession.insert("cart.insert", dto);
	
	}//insert() end
}//class end
