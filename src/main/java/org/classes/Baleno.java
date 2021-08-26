package org.classes;

import org.classes.engnie.V3;
import org.interfaces.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Baleno implements Cars {

	@Autowired
	V3 engine;
	
	@Override
	public String specs() {
	
		return "A Car from Suzuki uses Engine " + engine.getType();
	}

}
