package DiamonShop.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Dto.ProductsDto;
import DiamonShop.Dto.ProductsDtoMapper;
@Repository
public class ProductsDao extends BaseDao{
	
	private String SqlString()
	{
		StringBuffer  sql = new StringBuffer();
		sql.append("select ");
		sql.append("p.id as id_product ");
		sql.append(",p.id_category ");
		sql.append(",p.sizes ");
		sql.append(",p.name ");
		sql.append(",p.price ");
		sql.append(",p.sale ");
		sql.append(",p.title ");
		sql.append(",p.highlight ");
		sql.append(",p.new_product ");
		sql.append(",p.details ");
		sql.append(",c.id as id_color ");
		sql.append(",c.name as name_color ");
		sql.append(",c.image ");
		sql.append(",p.created_at ");
		sql.append(",p.updated_at ");
		sql.append("from ");
		sql.append("products as p ");
		sql.append("inner join ");
		sql.append("colors as c ");
		sql.append("on p.id=c.id_product ");
		sql.append("group by p.id,c.id_product ");
		sql.append("ORDER BY RAND() ");
		return sql.toString();
	}
	
	public List<ProductsDto> GetDataProducts()
	{
		String sql=SqlString();
		List<ProductsDto> listpProducts =_jdbcTemplate.query(sql, new ProductsDtoMapper());
				return listpProducts;
	}
}
