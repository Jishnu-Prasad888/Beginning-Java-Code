
class refrence { 
	 public static void main(String[] args) {
	 	BoxWeight weightBox = new BoxWeight(10, 20, 15, 34.3);
	 	Box plainBox = new Box();
	 	double vol;

	 	vol = weightBox.volume();
	 	System.out.println("Volume of weightbox is " + vol);
	 	System.out.println("Weight of weightbox is " + weightBox.weight);
	 	System.out.println();

	 	plainBox = weightBox;

	 	vol = plainBox.volume();

	 	System.out.println("Volume of plainbox is " + vol);



	 }
}

class Box {
    double width;
    double height;
    double depth;

    // Construct clone of an object
    Box(Box ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimensions specified
    Box() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }

    // Constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // Compute and return volume
    double volume() {
        return width * height * depth;
    }
}

// Here, Box is extended to include weight.
class BoxWeight extends Box {
    double weight; // weight of box

    // Constructor for BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

