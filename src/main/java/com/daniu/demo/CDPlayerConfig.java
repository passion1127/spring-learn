package com.daniu.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.daniu.soundsystem.CDPlayer;
import com.daniu.soundsystem.CompactDisc;
import com.daniu.soundsystem.MediaPlayer;
import com.daniu.soundsystem.SgtPeppers;

@Configuration
/* 
1、自动化装配bean
  两种实现方式：
 a.在xml中使用<context:annotation-config/>（表示启用注解）和
   <context:component-scan base-package="com.daniu"/>（表示启用自动扫描根目录）
 b.在java配置类中使用@ComponentScan注解
2、通过java config类实现装配bean
 使用@bean注解实现
3、通过xml实现装配bean
 使用<bean id="" class=""/>
*/

//@ComponentScan(basePackages={"com.daniu.soundsystem"}) 
public class CDPlayerConfig {

	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
	
	@Bean
	public MediaPlayer player(CompactDisc cd) {
		return new CDPlayer(cd);
	}
	
}
