package ar.edu.uno.trabajo.practico;

public class Arquero extends Unidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arquero a = new Arquero(5,2);
		Unidad b = new Arquero(1,2);
		System.out.println("b:"+b);
		System.out.println("a:"+a);
		a.atack(b);
		System.out.println("b:"+b);
		System.out.println("a:"+a);
		a.paquete();
		System.out.println("a:"+a);
		a.paquete();
		a.paquete();
		System.out.println("a:"+a);
		
		
	}

	private Integer arrows;
	
	
	public Arquero(Integer x, Integer y) {
		super(x,y);
		this.setHp(050);
		this.setP_atk(5);
		this.setArrows(20);
	}

	public void atack(Unidad b) {
		if(this.dead()==true) {
			System.out.println("The Unity is dead!");
			return;
		}
		if (this.distance(b)<=5 && this.distance(b)>=2) {
			if(this.getArrows()!=0) {
				b.setHp(b.getHp()-this.getP_atk());
				this.setArrows(this.getArrows()-1);
			}	
			else System.out.println("I need more arrows");
		}
		else System.out.println("It out of Range");
	}
	
	public void paquete() {
		if(this.getArrows()<=14) {
			this.setArrows(getArrows()+6);
		}
		else this.setArrows(20);
	}
	
	public Integer getArrows() {
		return arrows;
	}

	public void setArrows(Integer arrows) {
		this.arrows = arrows;
	}

	@Override
	public String toString() {
		return super.toString()+"Arquero [arrows=" + arrows + "]";
	}
		
}
