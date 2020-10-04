public class PointCP3{

	//Instance variables
	private char typeCoord;
	//can store Cartesian coordinates only
	private double x;
	private double y;

	//Constructor
	public PointCP3(char type, double xOrRho, double yOrTheta){
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
		return;
	}

	public void convertStorageToCartesian(){
		return;
		}
		

	public String toString(){
		return "Stored as Cartesian  [" + getX() + "," + getY() + "]\n" +
                "Computed Polar as ["+getTheta()+", "+getRho()+"]";
	}


}