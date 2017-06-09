package com.daniu.soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.daniu.demo.CDPlayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {

	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private MediaPlayer player; 
	
	@Test
	public void cdShouldNotNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void play() {
		player.play();
	}
}
