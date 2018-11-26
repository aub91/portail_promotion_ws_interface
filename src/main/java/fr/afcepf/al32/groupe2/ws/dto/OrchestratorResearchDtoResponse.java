package fr.afcepf.al32.groupe2.ws.dto;

import java.util.List;

public class OrchestratorResearchDtoResponse {
    private Long categoryId;

    private List<String> keyWords;

    private String source;

    private Integer perimetre;

    private List<PromotionDto> promotions;

    public OrchestratorResearchDtoResponse(Long categoryId, List<String> keyWords, String source, Integer perimetre, List<PromotionDto> promotions) {
        this.categoryId = categoryId;
        this.keyWords = keyWords;
        this.source = source;
        this.perimetre = perimetre;
        this.promotions = promotions;
    }

    public OrchestratorResearchDtoResponse(){}

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public List<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(List<String> keyWords) {
        this.keyWords = keyWords;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getPerimetre() {
        return perimetre;
    }

    public void setPerimetre(Integer perimetre) {
        this.perimetre = perimetre;
    }

    public List<PromotionDto> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<PromotionDto> promotions) {
        this.promotions = promotions;
    }
}
