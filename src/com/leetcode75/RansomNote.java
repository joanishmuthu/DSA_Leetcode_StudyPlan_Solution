package com.leetcode75;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	public static boolean canConstruct(String ransomNote, String magazine) {
		Map<String, Integer> ransommap=new HashMap<>();
		Map<String,Integer> magazinemap=new HashMap<>();
		String[] r=ransomNote.split("");
		String[] m=magazine.split("");
		for(int i=0;i<r.length;i++) {
			if(!ransommap.containsKey(r[i])) {
				ransommap.put(r[i],1);
			}
			else if(ransommap.containsKey(r[i])) {
				int a=ransommap.get(r[i]);
				ransommap.replace(r[i], ++a);
			}
		}
		for(int i=0;i<m.length;i++) {
			if(!magazinemap.containsKey(m[i])) {
				magazinemap.put(m[i],1);
			}
			else if(magazinemap.containsKey(m[i])) {
				int a=magazinemap.get(m[i]);
				magazinemap.replace(m[i], ++a);
			}
		}
		int count=0;
		for(int i=0;i<r.length;i++) {
			for(int j=0;j<m.length;j++) {
				if(r[i].equals(m[j])) {
					if(ransommap.get(r[i])<=magazinemap.get(r[i])) {
						count++;
					}
				}
			}
		}
		if(count>0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		String ransomNote="fihjjjjei";
		String magazine="fihjjjjei";
		System.out.println(canConstruct(ransomNote, magazine));
	}
}
