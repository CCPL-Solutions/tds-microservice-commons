package co.com.viveres.susy.microservicecommons.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "Stock")
public class StockDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	@ApiModelProperty(notes = "Type", example = "remove", required = true)
	private String type;
	
	@NotEmpty
	@ApiModelProperty(notes = "Number Items", example = "10", required = true)
	private Integer numberItems;

}
