package com.company;
class Fraction {
    int x;
    int y;
    public Fraction(){
        x=0;

        y=1;
    }
    public Fraction(int x,int y){
        if(y==0){
            System.out.println("Denominator cannot be zero...");
        }
        else
        {
            this.x=x;
            this.y=y;
        }
    }
    public void setx(int x){
        this.x =x;
    }
    public void sety(int y){
        this.y =y;
    }
    public int  getx(){
        return x;
    }
    public int  gety(){
        return y;
    }
    public void display(){
        System.out.print("x is: "+ x+ " y is: "+ y);
    }
    public boolean equals(Fraction other)
    {
        if(this.x == other.x && this.y == other.y)
        {
            return true;
        }
        else
            return false;
    }

}
public class RunnerAssignment_5 {
    public static void main(String[] args) {
        Fraction p= new Fraction();
        p.setx(4);
        p.sety(5);
        int j = p.getx();
        int k = p.gety();
        p.display();

        Fraction l = new Fraction();
        l.setx(4);
        l.sety(5);
        int x2 = l.getx();
        int y2 = l.gety();
        p.equals(l);
    }

}

