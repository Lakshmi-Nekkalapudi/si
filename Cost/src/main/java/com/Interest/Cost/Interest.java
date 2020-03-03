package com.Interest.Cost;

class Interest
{
    double prin;
    double time;
    double rate;
    Interest(double p,double t,double r)
    {
        this.prin=p;
        this.time=t;
        this.rate=r;
    }
    String getSimpleInterest()
    {
        return "Rupees "+String.format("%.2f", (prin*time*rate)/100);
    }
    String getCompoundInterest()
    {
        return "Rupees "+String.format("%.2f",prin * Math.pow(1.0+rate/100.0,time) - prin);
    }
}