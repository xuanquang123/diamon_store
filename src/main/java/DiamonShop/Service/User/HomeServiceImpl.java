package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.CategorysDao;
import DiamonShop.Dao.MenusDao;
import DiamonShop.Dao.ProductsDao;
import DiamonShop.Dao.SlidesDao;
import DiamonShop.Dto.ProductsDto;
import DiamonShop.Entity.Categorys;
import DiamonShop.Entity.Menus;
import DiamonShop.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService {

	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private MenusDao menuDao;
	@Autowired
	private CategorysDao categorysDao;
	@Autowired
	private ProductsDao productsDao;

	public List<Slides> GetDataSlide() {
		// TODO Auto-generated method stub
		return slidesDao.GetDataSlide();
	}

	public List<Categorys> GetDataCategorys() {
		// TODO Auto-generated method stub
		return categorysDao.GetDataCategorys();
	}

	public List<Menus> GetDataMenus() {
		// TODO Auto-generated method stub
		return menuDao.GetDataMenus();
	}


	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao. GetDataProducts();
		return listProducts;
	}

}
