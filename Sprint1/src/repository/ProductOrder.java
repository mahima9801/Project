package repository;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import data.Prod_Id;

public class ProductOrder {
	public ProductOrder(){
		
	}
	static Map<Integer, Prod_Id> prod = new HashMap<>();
	static{
		prod.put(1, new Prod_Id(101,"Bangalore",LocalDate.of(2019, 01, 15), "Packaging"));
		prod.put(2, new Prod_Id(102, "Gurugram",LocalDate.of(2018, 05, 24), "Dispatched"));
	}
	static public Map<Integer, Prod_Id> get(){
		return prod;
	}

}
