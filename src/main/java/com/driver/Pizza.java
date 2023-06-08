package com.driver;

public class Pizza {

    private int price;
    private int toppings;

    private Boolean isVeg;
    private String bill;

    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeAway;
    private boolean isBillingFinished;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price =300;
            this.toppings = 70;
        }
        else {
            this.price = 400;
            this.toppings=120;
        }

        bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded)
        {
            this.price += 80;
            isExtraCheeseAdded = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded)
        {
            this.price +=this.toppings;
            isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway)
        {
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillingFinished) {
            if(isExtraCheeseAdded)
                bill+="Extra Cheese Added: "+80+"\n";
            if(isExtraToppingsAdded)
                bill+="Extra Toppings Added: "+this.toppings+"\n";
            if(isTakeAway)
            {
                bill+="Paperbag Added: "+20+"\n";
            }
            bill+="Total Price: "+this.price+"\n";
            isBillingFinished = true;
            return this.bill;
        }
            return "";
    }
}
