package org.neos.cxf.rest.model;

import java.io.Serializable;

import lombok.*;

@Data
public class User  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NonNull private String name;
	@NonNull private String lastName;
	@NonNull private String email;
	

}
