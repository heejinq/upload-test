package mit.c301.nf4.dao;

import java.util.List;

import mit.c301.nf4.vo.ProductVO;


public interface ShoppingDAO {
	List<ProductVO> recommendView(int gender);
	
	List<ProductVO> product(); // 신상품,인기상품 등록

//	ProductVO productselect(int i);
}
