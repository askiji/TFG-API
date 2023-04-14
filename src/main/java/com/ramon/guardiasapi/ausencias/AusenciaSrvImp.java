package com.ramon.guardiasapi.ausencias;

import java.security.Principal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AusenciaSrvImp implements AusenciaSvr{
	@Autowired
	private AusenciaRepositorio ausenciaRepositorio;
	@Override
	public Ausencia reAusencia(Ausencia ausencia) {
		// TODO Auto-generated method stub
		return ausenciaRepositorio.save(ausencia);
	}
;

	public List<Ausencia> findAusenciasHoy() {
		long startOfDay = LocalDate.now().atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
	    long endOfDay = LocalDateTime.now().with(LocalTime.MAX).toInstant(ZoneOffset.UTC).toEpochMilli();
	    return ausenciaRepositorio.findByFechaBetween(startOfDay, endOfDay);
	}
	public List<Ausencia> findAusenciasDia(Integer dia) {
		int contador =0;
        LocalDate fechaActual = LocalDate.now();
        DayOfWeek diaSemanaActual = fechaActual.getDayOfWeek();
        for (DayOfWeek diaOfW : DayOfWeek.values()) {
        	if (diaSemanaActual.ordinal() == diaOfW.ordinal()){
        		
        		contador = dia - diaOfW.ordinal() - 1;
        	}
			
		}
        System.out.println("Hoy es " + diaSemanaActual);
		long startOfDay = LocalDate.now().atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
	    long endOfDay = LocalDateTime.now().with(LocalTime.MAX).toInstant(ZoneOffset.UTC).toEpochMilli();
	    
	    return ausenciaRepositorio.findByFechaBetween(startOfDay +  86400000 * contador, endOfDay +  86400000 *contador);
	}
	
	@Override
	public Ausencia updateAusencia(Ausencia ausencia) {
		// TODO Auto-generated method stub
		Optional<Ausencia> a = ausenciaRepositorio.findById(ausencia.getId());
		if(a != null) {
			if (a.get().getNombreSuplente() == null) {
				a.get().setNombreSuplente(SecurityContextHolder.getContext().getAuthentication().getName());
			} else {
				a.get().setNombreSuplente(null);
			}
			
		}
		return ausenciaRepositorio.save(a.get());
	}
}
