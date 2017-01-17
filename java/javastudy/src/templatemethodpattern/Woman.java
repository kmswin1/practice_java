package templatemethodpattern;

import java.util.ArrayList;
import java.util.Random;

public class Woman extends Human{
	public void search(){
		System.out.println("맘에드는 남성을 찾아요!!");
	}
	public void doAction(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("활짝 웃어요!!");
		list.add("리액션을 크게해요!!");
		list.add("얘기를 잘 들어줘요!!");
		int num = (new Random()).nextInt(list.size());
		System.out.println(list.get(num));
	}
}
