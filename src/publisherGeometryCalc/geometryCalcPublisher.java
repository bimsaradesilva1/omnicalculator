package publisherGeometryCalc;

public interface geometryCalcPublisher {
	
	public String calculatorServiePublish();
	
	
	
	//Area Calculator
	public double circleArea(double r);
	public double rectangleArea(double h, double w);
	public double triangeArea(double h, double b);
	
	
	//Perimeter Calculator
	 public void periCircle(); 
	 public void periRectangle(); 
	 public void periTriangle(); 
	
	 //Percentage Calculator
     public void volumeSphere();
     public void volumeCube();

}
