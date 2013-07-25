package org.pshow.service.dao;

import org.pshow.service.dao.entity.AccountInfo;
import org.springframework.data.repository.Repository;

public interface UserDao extends Repository<AccountInfo, Long> { 
    public AccountInfo save(AccountInfo accountInfo); 
 } 