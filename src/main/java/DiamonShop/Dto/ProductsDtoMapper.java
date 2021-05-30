package DiamonShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductsDtoMapper implements org.springframework.jdbc.core.RowMapper<ProductsDto> {

	public ProductsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductsDto products = new ProductsDto();
		products.setId_product(rs.getLong("id_product"));
		products.setId_category(rs.getInt("id_category"));
		products.setSizes(rs.getString("sizes"));
		products.setName(rs.getString("name"));
		products.setPrice(rs.getDouble("price"));
		products.setSale(rs.getInt("sale"));
		products.setTitle(rs.getString("title"));
		products.setHighlight(rs.getBoolean("highlight"));
		products.setNew_product(rs.getBoolean("new_product"));
		products.setDetails(rs.getString("details"));
		products.setId_color(rs.getLong("id_color"));
		products.setName_color(rs.getString("name_color"));
		products.setImage(rs.getString("image"));
		products.setCreated_at(rs.getString("created_at"));
		products.setUpdated_at(rs.getString("updated_at"));

		
		return products;
	}

}
