package org.aelion.community.communities;

import org.springframework.http.ResponseEntity;

public interface CommunityService {
    ResponseEntity<?> fetchCommunities();
    ResponseEntity<?> fetchById(String id);
    ResponseEntity<?> createCommunity(Community community);
}
