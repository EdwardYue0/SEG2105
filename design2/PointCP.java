public class PointCP{

	//Instance variables
	private char typeCoord;
	//can store Polar coordinates only
	private double rho;
	private double theta;

	//Constructor
	public PointCP(char type, double xOrRho, double yOrTheta){
		if(type != 'C' && type != 'P'){
			throw new IllegalArgumentException();
		}
		typeCoord = type;
		if(typeCoord != 'P'){
			this.rho =(Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
			this.theta= Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
			typeCoord = 'P';
		}
		if(typeCoord == 'P'){
			this.rho =xOrRho;
			this.theta=yOrTheta;
		}

	}

	public double getX(){
		
		return (Math.cos(Math.toRadians(theta)) * rho);
	}

	public double getY(){
		return (Math.sin(Math.toRadians(theta)) * rho);
	}

	public double getRho(){
		return rho;
	}

	public double getTheta(){
		return theta;
	}

	public void convertStorageToPolar(){
		return;
	}

	public void convertStorageToCartesian(){
		System.out.println("Can only be stored as Polar coordinates!");
		System.out.println("Computed Cartesian as ("+getX()+", "+getY()+")");
		return;
		}
		

	public String toString(){
		return "Stored as Polar  (" + getRho() + "," + getTheta() + ")\n";
	}


}