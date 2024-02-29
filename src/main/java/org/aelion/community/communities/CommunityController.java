package org.aelion.community.communities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/v1/communities")
public class CommunityController {

    @Autowired
    private CommunityService service;
    @GetMapping
    public ResponseEntity<?> fetchAll(){
        return service.fetchCommunities();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> fetchCommunity(@PathVariable String id) {
        return service.fetchById(id);
    }

    @PostMapping
    public  ResponseEntity<?> createCommunity(@RequestBody Community community) {
        return service.createCommunity(community);
    }

}
