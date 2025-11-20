class Shape {
    int length;
    int breadth;
    int height;
    int radius;

    // default constructor
    Shape() {
    }

    // constructor for cube/cuboid
    Shape(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // constructor for sphere
    Shape(int radius) {
        this.radius = radius;
    }

    // constructor for cylinder
    Shape(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    // calculate volume of cylinder (using pi = 3.14)
    public float calculateAreaOfCylinder() {
        float pi = 3.14f;
        return pi * radius * radius * height;
    }

    // calculate volume of sphere (using pi = 3.14)
    public float calculateAreaOfSphere() {
        float pi = 3.14f;
        return (4.0f / 3.0f) * pi * radius * radius * radius;
    }

    // calculate volume of cuboid (named "cube" in prompt)
    public Integer calculateAreaOfCube() {
        return Integer.valueOf(length * breadth * height);
    }
}
