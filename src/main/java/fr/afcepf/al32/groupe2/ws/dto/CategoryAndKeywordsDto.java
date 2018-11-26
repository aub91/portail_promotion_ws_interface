package fr.afcepf.al32.groupe2.ws.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryAndKeywordsDto {
	private CategoryProductDto categoryProductDto;

	private List<String> keyWords;

	public CategoryAndKeywordsDto(CategoryProductDto categoryProductDto, List<String> keyWords){
		this.categoryProductDto = categoryProductDto;
		this.keyWords = keyWords;
	}
}
