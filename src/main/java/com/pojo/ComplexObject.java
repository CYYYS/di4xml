package com.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class ComplexObject {
	private List<Object> list;
	private Map<String,Object> map;
	private Set<Object> set;
	private Properties prop;
	

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public Set<Object> getSet() {
		return set;
	}

	public void setSet(Set<Object> set) {
		this.set = set;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "ComplexObject [list=" + list + ", map=" + map + ", set=" + set + ", prop=" + prop + "]";
	}

	

	

	
	
}
