//hit service

package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {

    private Map<String, Integer> usernameHitCount = new HashMap<>();

    public int getHitCountForUsername(String username) {
        return usernameHitCount.getOrDefault(username, 0);
    }

    public int incrementAndGetHitCountForUsername(String username) {
        int currentCount = usernameHitCount.getOrDefault(username, 0);
        int newCount = currentCount + 1;
        usernameHitCount.put(username, newCount);
        return newCount;
    }
}
