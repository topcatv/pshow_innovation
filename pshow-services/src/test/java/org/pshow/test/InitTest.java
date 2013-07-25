package org.pshow.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.pshow.service.dao.UserDao;
import org.pshow.service.dao.entity.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;

public class InitTest extends PshowBaseTest {
	
	@Autowired
	private UserDao userDao;

	@Test
	public void init(){
		AccountInfo accountInfo = new AccountInfo();
		accountInfo.setBalance(0);
		userDao.save(accountInfo);
		assertTrue(true);
	}
}
