package com.mnsnll.springcloudbug;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCloudBugApplicationTests {
	
	@Autowired
	private SpringCloudBugConfigurationProperties props;

	@Test
	void assertEqualsPropsVar1() {
		Assertions.assertEquals(props.getVar1Raw(), props.getVar1Encrypted());
	}
	
	/**
	 * This one fails because getVar2Encrypted is not decrypted at runtime (from ENV: CONFIGPROPS_VAR2ENCRYPTED)
	 */
	@Test
	void assertEqualsPropsVar2() {
		Assertions.assertEquals(props.getVar2Raw(), props.getVar2Encrypted());
	}
	
	@Test
	void assertEqualsPropsVar3() {
		Assertions.assertEquals(props.getVar3Raw(), props.getVar3Encrypted());
	}
	
	// Map
	@Test
	void assertEqualsPropsVar1Map() {
		Assertions.assertEquals(props.getMap().get("var1Raw"), props.getMap().get("var1Encrypted"));
	}
	
	@Test
	void assertEqualsPropsVar2Map() {
		Assertions.assertEquals(props.getMap().get("var2Raw"), props.getMap().get("var2Encrypted"));
	}
	
	@Test
	void assertEqualsPropsVar3Map() {
		Assertions.assertEquals(props.getMap().get("var3Raw"), props.getMap().get("var3Encrypted"));
	}
}
