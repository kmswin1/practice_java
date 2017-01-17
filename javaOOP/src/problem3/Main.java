package problem3;

import java.util.HashMap;
import java.util.Random;

public class Main {
	public static void main(String[] args)
	{
		// 1~100 사이의 난수를 10개 발생 (Random class)
		Random rand = new Random();
		// 이렇게 발생된 나수를 HashMap에 저장 (HashMap class)
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		for(int i = 1; i<11; i++)
		{
			hash.put(i, rand.nextInt(100)+1);
		}
		// 저장된 데이터의 합계와 평균을 출력하세요
		int sum = 0;
		for(int i = 1;i<11;i++)
		{
			sum += hash.get(i);
		}
		double average = sum/10.0;
		System.out.println(sum);
		System.out.println(average);	
	}

}
