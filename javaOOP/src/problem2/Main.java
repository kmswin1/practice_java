package problem2;

import java.util.HashSet;
import java.util.Random;

public class Main
{
    public static void main(String args[])
    {
    	// main method 내에서 logic 처리 하는건 있을 수 없는 일.
    	Random rand = new Random();
    	// 자바에서 제공하는 자료구조 Array, HashSet, HashMap, ArrayList
    	HashSet<Integer> set = new HashSet<Integer>();
    	while(set.size()!=10)
    	{
    		int k = rand.nextInt(30)+1;
    		// Integer i = new Integer(k); 원칙적으로 사용해야하는 wrapper class
    		set.add(k); //autoboxing
    	}
    	System.out.println(set);
    }
}