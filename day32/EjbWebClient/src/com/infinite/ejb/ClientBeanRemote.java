package com.infinite.ejb;

import javax.ejb.Remote;

@Remote
public interface ClientBeanRemote {
	
	int sum(int a, int b);
	int sub(int a, int b);
	int mult(int a, int b);
}
