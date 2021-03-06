package fr.afcepf.al32.groupe2.ws.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchByCategoryResponseDto {

	private List<PromotionDto> promotionsDto;

	private CategoryProductDto categoryProductDto;

}
