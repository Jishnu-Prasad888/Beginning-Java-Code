abstract class figure {
	protected double i,j;
	double figurearea;

	figure(double a, double b) {
		this.i = a;
		this.j = b;
	}

	abstract void area();
}


class rectangle extends figure {
	//double area;

	rectangle(double a , double b){
		super(a,b);
	}

	@Override
	void area(){
		figurearea = i * j;
		System.out.println("area of rectangle :" + figurearea); 
	}
}


class triangle extends figure {
	// double areatri;

	triangle(double a,double b) {
		super(a,b);
	}

	@Override
	void area() {
		figurearea = 0.5 * i * j;
		System.out.println("Area of triangle : " + figurearea);
	}
}


class abstractfigure{
	public static void main(String[] args) {
		rectangle r= new rectangle(10,4);
		triangle t= new triangle(3,5);

		figure f;

		f = r;
		r.area();
		f = t;	
		t.area();
	}
}