package org.pshow.dao;

import java.util.List;

import org.pshow.dao.entity.AccountInfo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDao extends PagingAndSortingRepository<AccountInfo, Long> { 
    public List<AccountInfo> findByBalance(Integer balance);
 } 