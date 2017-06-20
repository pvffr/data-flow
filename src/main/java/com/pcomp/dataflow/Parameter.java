package com.pcomp.dataflow;

import java.util.UUID;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("parameter")
public class Parameter {
	
	@PrimaryKey
	private UUID id;
	
	private String key;
	
	private String param_name;
	
	private String param_value;
	
	public Parameter() {
		
	}
	
	public Parameter(UUID id, String key, String param_name, String param_value) {
		this.id = id;
		this.key = key;
		this.param_name = param_name;
		this.param_value = param_value;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getParam_name() {
		return param_name;
	}

	public void setParam_name(String param_name) {
		this.param_name = param_name;
	}

	public String getParam_value() {
		return param_value;
	}

	public void setParam_value(String param_value) {
		this.param_value = param_value;
	}
}
