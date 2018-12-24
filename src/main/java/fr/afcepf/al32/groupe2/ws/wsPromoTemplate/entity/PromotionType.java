package fr.afcepf.al32.groupe2.ws.wsPromoTemplate.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public abstract class PromotionType {

    @Column(name = "promotion_type_id")
    private Long promotionTypeId;

    public PromotionType(Long promotionTypeId) {
        this.promotionTypeId = promotionTypeId;
    }

    public Long getPromotionTypeId() {
        return promotionTypeId;
    }

    public void setPromotionTypeId(Long promotionTypeId) {
        this.promotionTypeId = promotionTypeId;
    }
}