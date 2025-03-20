public class Rectangle {
    private Point topleft;
    private int sideA, sideB;

    public Rectangle(Point topleft, int sideA) {
        this.topleft = topleft;
         setSideA(sideA);
         setSideB(sideA);
    }

    public Rectangle(Point topleft, int sideA, int sideB) {
        this.topleft = topleft;
        setSideA(sideA);
        setSideB(sideB);
    }

    public Point getTopleft() {
        return topleft;
    }

    public void setTopleft(Point topleft) {
        this.topleft = topleft;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideA<0){
            this.sideB = 0;
            System.out.println("sideB cannot be negative");
        }else{
            this.sideB = sideB;
        }
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA<0){
            this.sideA = 0;
            System.out.println("sideA cannot be negative");
        }else{
        this.sideA = sideA;
        }
    }
    public int perimeter(){
        return (2*sideA) + (2*sideB);
    }
    public int area(){
        return sideA*sideB;
    }
}
