
package com.example.demo.service.controller;

import com.example.demo.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    private UrlHitService urlHitService;

    @GetMapping("username/{username}/count")
    public Map<String, Object> getHitCountForUsername(@PathVariable String username) {
        int hitCount = urlHitService.incrementAndGetHitCountForUsername(username);

        Map<String, Object> response = new HashMap<>();
        response.put("username", username);
        response.put("hitcount", hitCount);

        return response;
    }
}
