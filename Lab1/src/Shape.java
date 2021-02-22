abstract class Shape
{
    double area;
    public Shape()
    {
        System.out.print("Forma geometrica este: ");
    }
    double getArea()
    {
        return area;
    }
    abstract void onAreaChange();
}

interface Line{
    public void printLength();
}


class Segment implements Line{
    int length;
    public Segment(int n)
    {
        length = n;
    }
    public void printLength(){
        System.out.println("Lungimea segmentului este " + length + ".");
    }
}

class Rectangle extends Shape
{
    double heigth;
    double width;

    public Rectangle()
    {
        System.out.println("dreptunghi");
    }
    void onAreaChange()
    {
        area=heigth*width;
    }
    void setHeigth(double heigth)
    {
        this.heigth=heigth;
        onAreaChange();
    }
    void setWidth(double width)
    {
        this.width=width;
        onAreaChange();
    }
    double getArea()
    {
        System.out.println("Function override!");
        return area;
    }
}

class Triangle extends Shape
{
    double base=0;
    double height=0;

    public Triangle()
    {
        System.out.println("triunghi");
    }
    void onAreaChange()
    {
        area=base*height/2;
    }
    void setBase(double base)
    {
        this.base=base;
        onAreaChange();
    }
    void setHeigth(double height) {
        System.out.println("Am setat o lungime de tip double.");
        this.height = height;
        onAreaChange();
    }
    void setHeigth(int height) {
        System.out.println("Am setat o lungime de tip int.");
        this.height = height;
        onAreaChange();
    }
}

