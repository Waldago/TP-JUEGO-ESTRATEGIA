package ar.edu.uno.trabajo.practico;

public class Caballero extends Unidad{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Unidad c1 = new Caballero(2,3);
		Unidad c2 = new Caballero(2,1);
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
		if(this.getCont()<3) {
			this.setHorse(false);
		}
		else this.setHorse(true);
	}

	public void atack(Unidad b) {
		if(this.dead()==true) {
			System.out.println("La unidad esta muerta");
			return;
		}
		this.revelde();
		if (this.distance(b)<=3 && this.distance(b)>=1) {
			if (this.isHorse()!=true) {
				b.setHp(b.getHp()-this.getP_atk());
				cont++;
			}
			else System.out.println("El caballo esta revelde");
		}
		else System.out.println("It out of Range");
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
