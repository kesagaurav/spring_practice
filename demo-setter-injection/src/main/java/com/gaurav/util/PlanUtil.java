package com.gaurav.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gaurav.service.PlanService;
import com.gaurav.service.PostPaid;
@Configuration
public class PlanUtil {
	@Bean(name = "planService")
	public PlanService getPlanService() {
		return new PostPaid();
	}
}
