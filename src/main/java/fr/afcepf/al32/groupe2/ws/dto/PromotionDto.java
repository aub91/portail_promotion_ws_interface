package fr.afcepf.al32.groupe2.ws.dto;

import lombok.Data;

@Data 
public class PromotionDto {
	private Long id;

	public PromotionDto(Long id) {
		this.id = id;
	}

	
}
