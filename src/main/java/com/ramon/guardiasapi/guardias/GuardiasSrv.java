package com.ramon.guardiasapi.guardias;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface GuardiasSrv {
	public Guardias guardarGuardias(Guardias guardia);
	public ArrayList<Guardias> findGuardias();
}
