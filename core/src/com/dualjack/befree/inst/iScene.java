package com.dualjack.befree.inst;

import com.badlogic.gdx.utils.JsonValue;
import com.nilunder.bdx.Instantiator;import com.nilunder.bdx.GameObject;
import com.dualjack.befree.*;
public class iScene extends Instantiator {

	public GameObject newObject(JsonValue gobj){
		String name = gobj.name;

		if (gobj.get("class").asString().equals("Sacky"))
			return new com.dualjack.befree.Sacky();

		return super.newObject(gobj);
	}
	
}
