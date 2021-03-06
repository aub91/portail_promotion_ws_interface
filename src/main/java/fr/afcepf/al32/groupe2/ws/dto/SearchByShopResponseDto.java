package fr.afcepf.al32.groupe2.ws.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchByShopResponseDto {

	private List<PromotionDto> promotionsDto;
	
	private List<ShopDto> shopDtos;

}
