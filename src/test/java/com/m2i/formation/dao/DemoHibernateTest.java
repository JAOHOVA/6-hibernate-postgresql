package com.m2i.formation.dao;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.m2i.formation.dao.entity.Formation;
import com.m2i.formation.dao.entity.FormationDetail;
import com.m2i.formation.dao.entity.TpCorrection;
import com.m2i.formation.dao.entity.TravauxPratiques;

public class DemoHibernateTest {
	DemoHibernate demo = new DemoHibernate();


	@Test
	public void testCreateFormation() {
		
		TpCorrection tp1c1 = new TpCorrection("correction1");
		TpCorrection tp1c2 = new TpCorrection("correction2");
		TpCorrection tp1c3 = new TpCorrection("correction3");
		
		Set<TpCorrection> formationTpc1 = new HashSet<TpCorrection>(0);
		formationTpc1.add(tp1c1);
		formationTpc1.add(tp1c2);
		formationTpc1.add(tp1c3);
		TravauxPratiques tp1 = new TravauxPratiques("tp1", 40L, formationTpc1);
		
		
		Set<TpCorrection> formationTpc2 = new HashSet<TpCorrection>(0);
		formationTpc1.add(tp1c1);
		formationTpc1.add(tp1c2);
		formationTpc1.add(tp1c3);
		TravauxPratiques tp2 = new TravauxPratiques("tp2", 50L, formationTpc2);
		
		
		Set<TpCorrection> formationTpc3 = new HashSet<TpCorrection>(0);
		formationTpc1.add(tp1c1);
		formationTpc1.add(tp1c2);
		formationTpc1.add(tp1c3);
		TravauxPratiques tp3 = new TravauxPratiques("tp3", 60L, formationTpc3);
			
		Set<TravauxPratiques> formationTps = new HashSet<TravauxPratiques>(0);
		formationTps.add(tp1);
		formationTps.add(tp2);
		formationTps.add(tp3);

		FormationDetail tpdt = new FormationDetail("support", "table de matiere");
		
		Formation f = new Formation("JAVA", tpdt, formationTps);

		demo.createFormation(f);

	}

}
