package co.com.viveres.susy.microservicecommons.dto;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "Content")
public class ContentDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(notes = "Content Id", example = "1")
	private Long id;
	
	@Valid
	@ApiModelProperty(notes = "Measure type")
	private MeasureTypeDto measure;
	
	@ApiModelProperty(notes = "Value", example = "500")
	private Double value;

}
