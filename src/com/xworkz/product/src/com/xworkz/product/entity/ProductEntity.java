package com.xworkz.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name="product")
@NamedQueries({
	@NamedQuery(name="getAll",query="select p from ProductEntity as p"),
	@NamedQuery(name="getBypriceGreaterThan",query="select p.price from ProductEntity as p where p.price > : setprice "),
	@NamedQuery(name="getBypriceLesserThan",query="select p.price from ProductEntity as p where p.price<: setminprice"),
	@NamedQuery(name="getByNameAndId",query="select pdt.name,pdt.id from ProductEntity as pdt where pdt.name=:nm,pdt.id=:i"),
	@NamedQuery(name = "getMaxPrice", query = "select max(pdt.price) from ProductEntity as pdt"),
	@NamedQuery(name = "getTotalPrice", query = "select sum(product.price) from ProductEntity as product"),

	@NamedQuery(name = "getQuantityByName", query = "select product.quantity from ProductEntity as product where product.name=:setname"),
	@NamedQuery(name = "getQuantityAndPriceByName", query = "select p.quantity,p.price from ProductEntity as p  where p.name=:setname"),
	@NamedQuery(name = "getQuantityAndPriceByNameAndId", query = "select p.quantity,p.price from ProductEntity as p where p.name=:setname and p.id=:setid"),
	@NamedQuery(name = "getByBrand", query = "select p.brand from ProductEntity as p where p.brand=:set"),
	@NamedQuery(name = "getBrand", query = "select p.brand from ProductEntity as p where p.name=:setname"),
	@NamedQuery(name = "getNameAndPriceByBrand", query = "select p.name,p.price from ProductEntity p where p.brand=:setbrand"),
	@NamedQuery(name = "getNameAndPrice", query = "select p.name,p.price from ProductEntity p ")

})
public class ProductEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="p_id")
	private int id;
	@Column(name="p_name")
	private String name;
	@Column(name="p_quantity")
	private int quantity;
	@Column(name="p_brand")
	private String brand;
	@Column(name="p_price")
	private int price;
	@Column(name="p_rating")
	private String rating;
	public ProductEntity(String name, int quantity, String brand, int price, String rating) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.brand = brand;
		this.price = price;
		this.rating = rating;
	}

}
