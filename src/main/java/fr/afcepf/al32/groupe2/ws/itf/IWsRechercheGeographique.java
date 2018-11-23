package fr.afcepf.al32.groupe2.ws.itf;

import fr.afcepf.al32.groupe2.ws.dto.ResponseGeoApiDto;
import fr.afcepf.al32.groupe2.ws.dto.ResponseWsDto;

public interface IWsRechercheGeographique {
	ResponseGeoApiDto getValidationAndresse(String source);

	ResponseWsDto getCommerce(String source, Integer perimetre);
}
