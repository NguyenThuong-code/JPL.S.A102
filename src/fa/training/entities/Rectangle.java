package fa.training.entities;

public class Rectangle implements Shape{
    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int calculatePerimeter() {
        return 2*(getLength()+getWidth());

    }

    @Override
    public int calculateArea() {
        return getWidth()*getLength();
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public int getWidth() {
        return this.width;
    }


    @Override
    public void setLengthWidth(int len, int width) {
        this.length=len;
        this.width=width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
