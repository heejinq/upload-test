package mit.c301.nf4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mit.c301.nf4.dao.ShoppingDAO;
import mit.c301.nf4.vo.ProductVO;

@Service
public class ShoppingServiceImpl implements ShoppingService {

	private ShoppingDAO dao;
	
	public ShoppingServiceImpl(ShoppingDAO dao) {
		super();
		this.dao = dao;
	}
	
	@Override
	public List<ProductVO> recommendView(int gender) {		
		return dao.recommendView(gender);
	}
	
	@Override
	public List<ProductVO> product() {
		
		
		return dao.product();
	}

//	@Override
//	public ProductVO productselect(int i) {
//		
//		return dao.productselect(i);
//	}

}
