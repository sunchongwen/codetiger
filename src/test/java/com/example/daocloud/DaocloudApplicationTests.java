package com.example.daocloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaocloudApplicationTests {
	@Autowired
	MySvc mySvc;
	@Test
	public void addText1() {
		int res = mySvc.add(12,123);
		assert res == 135;
	}
	@Test
	public void addText2() {
		int res = mySvc.add(12,1);
		assert res == 13;
	}

}
