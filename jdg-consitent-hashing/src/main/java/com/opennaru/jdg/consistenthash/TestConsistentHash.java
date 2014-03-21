package com.opennaru.jdg.consistenthash;

import java.util.ArrayList;

/**
 * 
 * @author Junshik Jeon(service@opennaru.com)
 *
 */
public class TestConsistentHash {

	public static void main(String[] args) {
		HashFunction hashFunction = new HashFunction();

		ArrayList<String> servers = new ArrayList<String>();
		servers.add("server1");
		servers.add("server2");
		servers.add("server3");

		ConsistentHash<String> hash = new ConsistentHash<String>(hashFunction,
				100, servers);
		System.out.println("*** Hash Initialized.");
		System.out.println("=====================================");
		
		String[] testList = {
				"akdlfajslkfd1",
				"dfjgkldfasdf2",
				"sakdjflkassa3",
				"zkldjlkzsdfs4",
				"dfjsgklsjfgk5",
				"sdklfjxlksdf6",
				"xdljsfspxfgs7",
				"erjtdxiddddf8",
				"wertwxsdkfdj9"
		};
		
		for(String test: testList) {
			System.out.println(">> get " + test + " = " + hash.get(test) );
		}
		System.out.println("=====================================");

		hash.remove("server2");
		System.out.println("*** server2 removed.");
		System.out.println("=====================================");
		
		for(String test: testList) {
			System.out.println(">> get " + test + " = " + hash.get(test) );
		}		
		System.out.println("=====================================");
	}
}
