package test7;

/*
 * 날짜 : 2023/07/20
 * 이름 : 류영호
 * 내용 : 자바 총정리 연습문제
 */
interface Player {
	public abstract void play();
}

class BaseBallPlayer implements Player {
	@Override
	public void play() {
		System.out.println("야구를 합니다.");
	}	
}

class FootBallPlayer implements Player {
	@Override
	public void play() {
		System.out.println("축구를 합니다.");
	}	
}

public class Test7 {
	public static void main(String[] args) {
		
		Player p1 = new BaseBallPlayer();
		Player p2 = new FootBallPlayer();
		
		playGame(p1);
		playGame(p2);		
	}
	
	public static void playGame(Player p) {
		p.play();
	}
}