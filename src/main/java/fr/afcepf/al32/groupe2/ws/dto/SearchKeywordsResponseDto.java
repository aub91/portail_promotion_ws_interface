package fr.afcepf.al32.groupe2.ws.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SearchKeywordsResponseDto {

	private List<PromotionDto> promotionsDto;

	private List<String> keyWords;

}
