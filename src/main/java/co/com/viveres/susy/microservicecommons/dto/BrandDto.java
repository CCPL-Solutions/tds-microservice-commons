package co.com.viveres.susy.microservicecommons.dto;

import co.com.viveres.susy.microservicecommons.validation.ICreateProductValidation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel(value = "Brand")
public class BrandDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(groups = ICreateProductValidation.class)
    @ApiModelProperty(notes = "Brand Id", example = "1")
    private Long id;

    @ApiModelProperty(notes = "Brand name", example = "Diana")
    private String name;

}
