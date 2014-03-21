package com.opennaru.jdg.consistenthash;

import com.opennaru.jdg.consistenthash.HashFunction;

/**
 * 
 * @author Junshik Jeon(service@opennaru.com)
 * 
 */
public class TestHashFunction {

	public static void main(String[] args) {
		HashFunction hash = new HashFunction();
		System.out.println( hash.hash("opennaru") );
	}
}
