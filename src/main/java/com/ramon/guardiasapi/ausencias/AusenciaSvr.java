package com.ramon.guardiasapi.ausencias;

import java.security.Principal;
import java.util.List;

public interface AusenciaSvr {
	public Ausencia reAusencia(Ausencia ausencia);
	public List<Ausencia> findAusenciasHoy(); 
	public List<Ausencia> findAusenciasDia(Integer dia);
	public Ausencia updateAusencia(Ausencia ausencia);
		
}
