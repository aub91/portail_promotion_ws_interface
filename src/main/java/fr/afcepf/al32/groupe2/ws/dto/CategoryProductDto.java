package fr.afcepf.al32.groupe2.ws.dto;

import lombok.Data;

@Data
public class CategoryProductDto {
	private Long id;

	public CategoryProductDto(Long id) {
		this.id = id;
	}

}