package com.xworkz.State;

import com.xworkz.State.dao.StateDAO;
import com.xworkz.State.dao.StateDAOImpl;
import com.xworkz.State.entity.StateEntity;

public class StateRunner {

	public static void main(String[] args) {
		StateEntity stateEntity=new StateEntity(1,"Bihar",48,"Patna");
		StateDAO dao=new StateDAOImpl();
		dao.create(stateEntity);
	}

}
