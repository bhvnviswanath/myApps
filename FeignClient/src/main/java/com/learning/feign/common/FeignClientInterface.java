package com.learning.feign.common;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="test",url="http://localhost:8080/add")
public interface FeignClientInterface {

	@RequestMapping(method = RequestMethod.GET)
	String getDetails();
}
