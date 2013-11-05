package org.pshow.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.pshow.dao.UserDao;
import org.pshow.dao.entity.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)  
@Transactional
public class InitTest extends PshowBaseTest {
	
	@Autowired
	private UserDao userDao;

	@Test
	public void init(){
		AccountInfo accountInfo = new AccountInfo();
		accountInfo.setBalance(0);
		userDao.save(accountInfo);
		List<AccountInfo> list = userDao.findByBalance(0);
		assertNotNull(list);
		assertEquals(1, list.size());
	}
}
