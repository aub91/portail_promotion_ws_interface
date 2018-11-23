package fr.afcepf.al32.groupe2.ws.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor 
public class ShopDto {
	private Long id;

	public ShopDto(Long id) {
		this.id = id;
	}

}
