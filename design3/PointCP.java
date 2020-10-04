public class PointCP{

	//Instance variables
	private char typeCoord;
	//can store Polar coordinates only
	private double x;
	private double y;

	//Constructor
	public PointCP(char type, double xOrRho, double yOrTheta){
		if(type != 'C' && type != 'P'){
			throw new IllegalArgumentException();
		}
		if(type != 'P'){
			this.x =(Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
			this.y= (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);}
		
		if(type=='C'){
			this.x =xOrRho;
			this.y=yOrTheta;
		}
		typeCoord ='C';

	}

	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}

	public double getRho(){
		return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
	}

	public double getTheta(){
		return Math.toDegrees(Math.atan2(y, x));
	}

	public void convertStorageToPolar(){
		System.out.println("Can only be stored as Polar coordinates!");
		System.out.println("Computed Cartesian as ("+getRho()+", "+getTheta()+")");
		return;
	}

	public void convertStorageToCartesian(){
		return;
		}
		

	public String toString(){
		return "Stored as Cartesian  (" + getX() + "," + getY() + ")\n";
	}


}