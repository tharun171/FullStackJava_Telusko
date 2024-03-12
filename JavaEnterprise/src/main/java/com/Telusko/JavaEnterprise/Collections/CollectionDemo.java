package com.Telusko.JavaEnterprise.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection nums = new ArrayList();
		nums.add(6);
		nums.add(4);
		nums.add(2);
		nums.add(5);
		
		Collection<Integer> nums1 = new ArrayList<Integer>();
		nums.add(6);
		nums.add(4);
		nums.add(2);
		nums.add(5);
		
		for(Object ele:nums)
		{
			int ele1 = (Integer)ele;
			System.out.println(ele1);
		}
		
		for(int ele:nums1)
		{
			System.out.print(ele+" ");
		}

	}

}
