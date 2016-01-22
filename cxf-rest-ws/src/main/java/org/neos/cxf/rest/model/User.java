package org.neos.cxf.rest.model;

import java.io.Serializable;

import lombok.*;

/**
 * Esta clase demuestra el uso del proyecto Lombok con la finalidad de <br>
 * no estar escribiendo setter/getter, constructor
 * @author hector.hidalgo
 *
 */
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
