package co.com.viveres.susy.microservicecommons.dto;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import co.com.viveres.susy.microservicecommons.validation.AssociateProductToSupplierValidation;
import co.com.viveres.susy.microservicecommons.validation.ICreateProductValidation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "Product")
public class ProductDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull(groups = AssociateProductToSupplierValidation.class)
	@ApiModelProperty(notes = "Product Id", example = "1",readOnly = true, required = false)
	private Long id;

	@NotBlank(groups = ICreateProductValidation.class)
	@ApiModelProperty(notes = "Product name", example = "Arróz", required = true)
	private String name;

	@Valid
	@NotNull(groups = ICreateProductValidation.class)
	@ApiModelProperty(notes = "Brand", example = "Diana", required = true)
	private BrandDto brand;
	
	@Valid
	@NotNull(groups = ICreateProductValidation.class)
	@ApiModelProperty(notes = "Content", required = true)
	private ContentDto content;

	@NotNull(groups = ICreateProductValidation.class)
	@ApiModelProperty(notes = "Price", example = "3500", required = true)
	private Double price;
	
	@Min(value = 0)
	@NotNull(groups = ICreateProductValidation.class)
	@ApiModelProperty(notes = "Current Numbre Items", example = "10", required = true)
	private Integer currentNumItems;

	@Min(value = 0)
	@NotNull(groups = ICreateProductValidation.class)
	@ApiModelProperty(notes = "Minimun stocks", example = "10", required = true)
	private Integer minimunStock;

	@NotBlank(groups = ICreateProductValidation.class)
	@ApiModelProperty(notes = "Description", example = "Arróz Diana x 500 gramos", required = true)
	private String description;

}
