package com.isoft.qzm.feign;

import com.isoft.qzm.client.AuthorizedFeignClient;
import com.isoft.qzm.service.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@AuthorizedFeignClient(name="gateway")
public interface GatewayProxy {

    @GetMapping("services/uaa/api/account/{userId}")
    UserDTO getUserDetails(@PathVariable("userId")  String userId);
}
