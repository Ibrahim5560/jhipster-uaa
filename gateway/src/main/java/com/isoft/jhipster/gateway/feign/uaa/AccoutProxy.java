package com.isoft.jhipster.gateway.feign.uaa;

import com.isoft.jhipster.gateway.service.dto.UserDTO;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("uaa")
@RibbonClient("gateway")
public interface AccoutProxy {
    @GetMapping("/api/account")
    UserDTO getAccount() ;
    @GetMapping("/api/account/{userId}")
    UserDTO getAccount(@PathVariable("userId") String userId) ;
}
