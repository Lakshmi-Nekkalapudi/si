package com.Interest.Cost;

class Building
{
    double area;
    int type;
    Building(double a,int t){
        this.area=a;
        this.type=t;
    }
    String getCost()
    {
        if(type==1){
            return "Rupees "+String.format("%.2f", area*2000);
        }
        else if(type==2){
            return "Rupees "+String.format("%.2f", area*3000);
        }
        else if(type==3){
            return "Rupees "+String.format("%.2f",area*3500);
        }
        else{
            return "Rupees "+String.format("%.2f",area*4000);
        }
    }
}
