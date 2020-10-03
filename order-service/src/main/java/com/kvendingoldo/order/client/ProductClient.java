package com.kvendingoldo.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import com.kvendingoldo.order.model.Product;

import java.util.List;

@FeignClient(name = "product-service")
public interface ProductClient {

	@PostMapping("/ids")
	List<Product> findByIds(List<Long> ids);

}
