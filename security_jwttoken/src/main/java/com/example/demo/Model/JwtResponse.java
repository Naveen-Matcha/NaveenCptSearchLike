package com.example.demo.Model;

import java.io.Serializable;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Builder
@ToString
public class JwtResponse implements Serializable {
	
	private static final long serialVersionUID = -8091879091924046844L;
	private  String jwttoken;


	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}

	
	

	

}
