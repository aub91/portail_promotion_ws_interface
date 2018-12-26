package fr.afcepf.al32.groupe2.ws.itf;

import fr.afcepf.al32.groupe2.ws.wsPromoTemplate.dto.TopPromotionTemplateResultDto;

import java.util.List;

public interface IWsPromoTemplate {
    TopPromotionTemplateResultDto searchTopTemplatePromoForShopKeeper(Double sourceLong, Double sourceLat, List<String> categories);
}
