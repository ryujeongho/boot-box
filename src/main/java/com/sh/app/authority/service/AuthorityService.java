package com.sh.app.authority.service;

import com.sh.app.authority.entity.Authority;
import com.sh.app.authority.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AuthorityService {
    @Autowired
    AuthorityRepository authorityRepository;
    public Authority createAuthority(Authority authority) {
        return authorityRepository.save(authority);
    }
}
