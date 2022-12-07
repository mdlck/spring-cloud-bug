package com.mnsnll.springcloudbug;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("config-props")
public class SpringCloudBugConfigurationProperties {

	private String var1Encrypted;
	private String var1Raw;
	
	private String var2Encrypted;
	private String var2Raw;
	
	private String var3Encrypted;
	private String var3Raw;
	
	private Map<String, String> map;
	
	public String getVar1Encrypted() {
		return var1Encrypted;
	}
	public void setVar1Encrypted(String var1Encrypted) {
		this.var1Encrypted = var1Encrypted;
	}
	public String getVar1Raw() {
		return var1Raw;
	}
	public void setVar1Raw(String var1Raw) {
		this.var1Raw = var1Raw;
	}
	public String getVar2Encrypted() {
		return var2Encrypted;
	}
	public void setVar2Encrypted(String var2Encrypted) {
		this.var2Encrypted = var2Encrypted;
	}
	public String getVar2Raw() {
		return var2Raw;
	}
	public void setVar2Raw(String var2Raw) {
		this.var2Raw = var2Raw;
	}
	public String getVar3Encrypted() {
		return var3Encrypted;
	}
	public void setVar3Encrypted(String var3Encrypted) {
		this.var3Encrypted = var3Encrypted;
	}
	public String getVar3Raw() {
		return var3Raw;
	}
	public void setVar3Raw(String var3Raw) {
		this.var3Raw = var3Raw;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
}
