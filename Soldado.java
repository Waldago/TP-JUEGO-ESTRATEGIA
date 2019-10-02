package ar.edu.uno.trabajo.practico;

public class Soldado extends Unidad{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unidad a = new Soldado(1,2);
		Unidad b = new Soldado(1,3);
		System.out.println("b:"+b);
		System.out.println("a:"+a);
		a.atack(b);
		System.out.println("b:"+b);
		a.atack(b);
		//a.atack(b);
		//a.atack(b);
		System.out.println("b:"+b);
		b.atack(a);		
		System.out.println("a:"+a);
		a.move("cnnnnof");
		System.out.println("a:"+a);
		a.atack(b);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	
	private Integer ep;	
	
	public Soldado(Integer x,Integer y) {
		super(x,y);
		this.setHp(200);
		this.setP_atk(10);
		this.setEp(20);		
	}
	
	public void atack(Unidad b) {
		if(this.dead()==true) {
			System.out.println("La unidad esta muerta");
			return;
		}
		if (this.distance(b)==1) {
			if(this.getEp()!=0) {
				b.setHp(b.getHp()-this.getP_atk());
				this.setEp(this.getEp()-10);
			}	
			else System.out.println("I need more energy");
		}
		else System.out.println("It out of Range");
	}	

	public Integer getEp() {
		return ep;
	}

	public void setEp(Integer ep) {
		this.ep = ep;
	}

	@Override
	public String toString() {
		return super.toString()+"Soldado [ep=" + ep + "]";
	}	
}
