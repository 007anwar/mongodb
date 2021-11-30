package com.example.mongoDb;

import com.example.mongoDb.entity.Product;
import com.example.mongoDb.entity.ProductRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@SpringBootTest
class MongoDbApplicationTests {

	private final ProductRepo productRepo;

	@Autowired
	public MongoDbApplicationTests(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}

	@Test
	void contextLoads() {
	}


	@Test
	void testSave()
	{
		Product product = new Product();
		product.setName("iPhone");
		product.setPrice(1234f);
		Product save = productRepo.save(product);
		Assertions.assertNotNull(save);
	}

	@Test
	void testGet()
	{

		List<Product> all = productRepo.findAll();
		all.forEach(product -> System.out.println(product));
	}

	@Test
	void testDelete()
	{
productRepo.deleteById("61a5e5857e8a2bdcb672f9f9");
	}





}
