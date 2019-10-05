package ar.edu.uno.trabajo.practico;

public class Caballero extends Unidad{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caballero c1 = new Caballero(2,3);
		Caballero c2 = new Caballero(2,1);
		Caballero c3 = new Caballero(2,2);
		c1.atack(c2);
		System.out.println(c2);
		c1.atack(c2);
		System.out.println(c2);
		c1.atack(c2);
		System.out.println(c2);
		c1.atack(c2);
		System.out.println(c2);
		System.out.println(c1);	
		c2.move("cnnnf");
		c2.atack(c1);
		c1.atack(c3);
		System.out.println(c1);
		c1.pocionA();
		c1.atack(c3);
		System.out.println(c1);
		System.out.println(c2);
		c2.atack(c3);
	}

	private boolean horse;
	private int cont;

	public Caballero (Integer x, Integer y) {
		super(x,y);
		this.setHp(150);
		this.setP_atk(50);
		this.setHorse(false);
		this.setCont(0);
	}

	private void revelde() {
		if(this.getCont()==3) {
			this.setHorse(true);
		}
		return;
	}

	public void atack(Unidad b) {
		if(this.dead()==true) {
			System.out.println("The Unit is dead!");
			return;
		}
		this.revelde();
		if (this.distance(b)<=3 && this.distance(b)>=1) {
			if (this.isHorse()!=true) {
				b.setHp(b.getHp()-this.getP_atk());
				this.setCont(cont+1);
			}
			else System.out.println("El caballo esta revelde");
		}
		else System.out.println("It out of Range");
	}

	public void pocionA() {
		this.setHorse(false);
		this.setCont(0);
	}
	
	public boolean isHorse() {
		return horse;
	}

	public void setHorse(boolean horse) {
		this.horse = horse;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	@Override
	public String toString() {
		return super.toString()+"Caballero [horse=" + horse + ", cont=" + cont + "]";
	}	
}
