package mit.c301.nf4.service;

import java.util.List;

import mit.c301.nf4.vo.ProductVO;

public interface ShoppingService {
	List<ProductVO> recommendView(int gender);
	
	List<ProductVO> product();

//	ProductVO productselect(int i); 
	
}
