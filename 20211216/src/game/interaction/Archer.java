package game.interaction;

public class Archer {

	    private int hp;
		private int mp;
		private int atk;
		private int def;
		private int exp;
		
		public Archer() {
			this.hp = 20;
			this.mp = 10;
			this.atk = 4;
			this.def = 1;
			this.exp = 0;
		}
		public void huntOrc(Orc orc) {
			// 궁수가 오크를 때리기 위해서 먼저 Orc의 doBattle를 호출합니다.
			orc.doBattle(this.atk);
			// 궁수도 오크에게 공격을 받습니다.
			this.hp = this.hp + this.def - orc.getAtk();
			System.out.println("교전 결과 궁수의 체력 : " + this.hp);
		}
			
			public void huntTroll(Troll troll) {
				 if(troll.getHp() > 0) {
				this.hp = this.hp + this.def - troll.getAtk();
		    } else {
		    	System.out.println("트롤이 이미 죽어서 교전이 끝났습니다.");
		    }
		    System.out.println("교전 결과 궁수의 체력 : " + this.hp);
		}
}


