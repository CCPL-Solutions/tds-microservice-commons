package co.com.viveres.susy.microservicecommons.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "MeasureType")
public class MeasureTypeDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(notes = "Measure Id", example = "1")
	private Long id;
	
	@ApiModelProperty(notes = "Measure Name", example = "gramos")
	private String name;

}
