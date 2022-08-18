package lab3.Exercise2;

import java.util.Scanner;

public class Tile {
    private String number;
    private Color color;
    private short numOfTiles, length, width;
    private long price;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public short getNumOfTiles() {
        return numOfTiles;
    }

    public void setNumOfTiles(short numOfTiles) {
        this.numOfTiles = numOfTiles;
    }

    public short getLength() {
        return length;
    }

    public void setLength(short length) {
        this.length = length;
    }

    public short getWidth() {
        return width;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Tile() {
        number = "";
        color = Color.RED;
        numOfTiles = length = width = 0;
        price = 0;
    }
    public static Tile create() {
        Scanner sc = new Scanner(System.in);
        Tile t = new Tile();
        System.out.print("Enter number: ");
        t.setNumber(sc.nextLine());
        while (true) {
            System.out.print("Enter color: ");

            String color = sc.nextLine();
            if (Color.contains(color.toUpperCase())) {
                t.setColor(Color.valueOf(color.toUpperCase()));
                break;
            }
        }
        return t;
    }
    public float retailPrice(){
        return (this.price/this.numOfTiles)*1.25f;
    }
    public float theMaxArea(){
        return (this.length * this.width * this.numOfTiles) /10000;
    }
    public int theNumberOfBox(int w, int l) {
        int numTileInWidth = w/this.getWidth();
        if(w%this.getWidth()!= 0) numTileInWidth++;

        int numTileInLength = l/this.getLength();
        if(l%this.getLength()!= 0) numTileInLength++;

        int total = numTileInWidth*numTileInLength;

        int numBox = total/this.numOfTiles;

        if(total%this.numOfTiles != 0) numBox++;
        return numBox;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "number='" + number + '\'' +
                ", color=" + color +
                '}';
    }
}
