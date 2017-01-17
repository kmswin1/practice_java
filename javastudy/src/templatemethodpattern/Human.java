package templatemethodpattern;

public abstract class Human {
		public void dress(){
			System.out.println("옷을 입어요!!");
		}
		public void confess(){
			System.out.println("고백을 해요!!");
		}
		public abstract void search();
		public abstract void doAction();	
		public void makeFriends(){
			dress();
			search();
			doAction();
			confess();
		}
}
