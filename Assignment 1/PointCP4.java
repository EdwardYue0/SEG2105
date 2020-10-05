public class PointCP4
{
  //Instance variables
  private char typeCoord;
  
  //Instance variables for storing Polar Coordinate
  private double x;
  private double y;

  //Instance variables for storing Cartesian Coordinate
  private double rho;
  private double theta;
	

  //Constructor
  public PointCP4(char type, double xOrRho, double yOrTheta)
  {
    if(type != 'C' && type != 'P')
      throw new IllegalArgumentException();

    if(type=='C'){
      x=xOrRho;
      y=yOrTheta;
      rho=(Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
      theta=Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
    }

    if(type=='P'){
      x=(Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
      y=(Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
      rho=xOrRho;
      theta=yOrTheta;
    }
    typeCoord = type;
  }
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
    return x;
  }
  
  public double getY()
  {
    return y;
  }
  
  public double getRho()
  {
    return rho;
  }
  
  public double getTheta()
  {
    return theta;
  }
  
	
  /**
   * Converts Cartesian coordinates to Polar coordinates.
   */
  public void convertStorageToPolar()
  {
    return;
  }
	
  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
  public void convertStorageToCartesian()
  {
    return;
  }

  public String toString()
  {
    return "Stored as Polar  [" + getTheta() + "," + getRho() + "]\n" +
            "Stored as Cartesian ["+getX()+", "+getY()+"]";
  }
}
