package com.kvendingoldo.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import com.kvendingoldo.order.model.Account;

@FeignClient(name = "account-service")
public interface AccountClient {

	@PutMapping("/withdraw/{accountId}/{amount}")
	Account withdraw(@PathVariable("accountId") Long id, @PathVariable("amount") int amount);

}
