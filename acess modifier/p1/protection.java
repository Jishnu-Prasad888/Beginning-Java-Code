package p1;

class protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    // Constructor
    public protection() {
        System.out.println("base Constructor");
        System.out.println(" n = " + n);         // Default access
        System.out.println(" n_pri = " + n_pri); // Private access
        System.out.println(" n_pro = " + n_pro); // Protected access
        System.out.println(" n_pub = " + n_pub); // Public access
    }
}
