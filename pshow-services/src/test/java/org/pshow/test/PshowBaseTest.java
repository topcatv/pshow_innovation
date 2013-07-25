package org.pshow.test;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ActiveProfiles("test")
@ContextConfiguration(locations = { "/applicationContext-pshow.xml" })
public class PshowBaseTest extends AbstractJUnit4SpringContextTests {
	
}
