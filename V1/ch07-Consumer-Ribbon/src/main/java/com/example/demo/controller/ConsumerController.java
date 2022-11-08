package com.example.demo.controller;

import com.example.demo.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
public class ConsumerController {

    @Autowired
    public HelloRemote HelloRemote;

    @Autowired
    RestTemplate restTemplate;

    /**
     * http://localhost:20000/hello/fuck
     *
     * @param name
     * @return
     */
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return HelloRemote.sayHello(name);
    }


        /**
         * http://localhost:20000/serverIfno
         *
         * @return
         */
        @RequestMapping("/serverIfno")
        public String serverInfo() {

            UriComponents uriComponents = UriComponentsBuilder.fromUriString("http://eureka-client-1/sayHello?userName={userName}").build().expand("longzhonghua").encode();

            URI uri = uriComponents.toUri();
            String strUrl = uri.toString();
            //return restTemplate.getForObject("strUrl, String.class);

            return restTemplate.getForObject("http://eureka-client-1/" + "serverInfo", String.class);
        }

}