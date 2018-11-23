package fr.afcepf.al32.groupe2.ws.itf;

import java.util.List;

import fr.afcepf.al32.groupe2.ws.dto.CategoryProductDto;
import fr.afcepf.al32.groupe2.ws.dto.PromotionDto;

public interface IWsRecherche {

	public List<PromotionDto> searchListPromotion
	(String source,Integer perimetre,List<String> keywords, CategoryProductDto categoryProductDto);
	
}
