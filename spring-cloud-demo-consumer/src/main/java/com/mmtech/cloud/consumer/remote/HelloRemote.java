package com.mmtech.cloud.consumer.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "cloud-producer")
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    String callRemoteSayHello(@RequestParam(value = "name") String name);


}
