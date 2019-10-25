package com.fantasticCode.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.fantasticCode.domain.Sale;

public class SaleDao {
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}   
	
	public int save(Sale p){    
	    String sql="insert into table_sale(id_sale, name_sale, image_sale, description_sale, normal_price_sale, disc_price_sale) values('"+p.getIdsale()+"','"+p.getNameSale()+"',"+p.getImageSale()+",'"+p.getDescriptionSale()+"',"+p.getNormalPriceSale()+",'"+p.getDiscPriceSale()+"')";    
	    return template.update(sql);    
	}
	
	public int update(Sale p){    
	    String sql="update table_sale set id_sale= '"+p.getIdsale()+"', name_sale= '"+p.getNameSale()+"', image_sale= "+p.getImageSale()+",description_sale='"+p.getDescriptionSale()+"', normal_price_sale="+p.getNormalPriceSale()+",disc_price_sale='"+p.getDiscPriceSale()+"' where id="+p.getIdsale()+"";    
	    return template.update(sql);    
	}   
	
	public int delete(int id){    
	    String sql="delete from table_sale where id="+id+"";    
	    return template.update(sql);    
	}
	
	public Sale getSaleById(int id){    
	    String sql="select * from table_sale where id=?";    
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Sale>(Sale.class));    
	}
	
	public List<Sale> getSales(){    
	    return template.query("select * from table_sale",new RowMapper<Sale>(){    
	        public Sale mapRow(ResultSet rs, int row) throws SQLException {    
	        	Sale e=new Sale();  
	        	e.setIdsale(rs.getInt(1));
	        	e.setNameSale(rs.getString(2));
	            e.setImageSale(rs.getString(3));    
	            e.setDescriptionSale(rs.getString(4));    
	            e.setNormalPriceSale(rs.getFloat(5));    
	            e.setDiscPriceSale(rs.getFloat(6));    
	            return e;    
	        }    
	    });    
	}    

}
