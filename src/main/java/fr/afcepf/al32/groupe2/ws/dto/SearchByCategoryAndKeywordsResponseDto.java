package fr.afcepf.al32.groupe2.ws.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchByCategoryAndKeywordsResponseDto {
	private List<PromotionDto> promotionsDto;

	private CategoryProductDto categoryProductDto;

	private List<String> keyWords;


}
