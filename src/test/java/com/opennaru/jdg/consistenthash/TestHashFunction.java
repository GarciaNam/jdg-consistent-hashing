package com.opennaru.jdg.consistenthash;

import com.opennaru.jdg.consistenthash.HashFunction;

/**
 * 
 * Opennaru, Inc. http://www.opennaru.com/
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
