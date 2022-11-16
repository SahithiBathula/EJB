package com.infinite.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ClientBean
 */
@Stateless
@Remote(ClientBeanRemote.class)
public class ClientBean implements ClientBeanRemote {

    /**
     * Default constructor. 
     */
    public ClientBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mult(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}
