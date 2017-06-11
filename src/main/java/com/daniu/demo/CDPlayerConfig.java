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
1���Զ���װ��bean
  ����ʵ�ַ�ʽ��
 a.��xml��ʹ��<context:annotation-config/>����ʾ����ע�⣩��
   <context:component-scan base-package="com.daniu"/>����ʾ�����Զ�ɨ���Ŀ¼��
 b.��java��������ʹ��@ComponentScanע��
2��ͨ��java config��ʵ��װ��bean
 ʹ��@beanע��ʵ��
3��ͨ��xmlʵ��װ��bean
 ʹ��<bean id="" class=""/>
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
