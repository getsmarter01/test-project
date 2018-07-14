package com.example.android.justjava17;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    this is method: submitOrder,
// this is the point where activity_main.xml layout linked to java file
// used for: calling method display, and method displayPrice
    // this method is called when button clicked

    public void submitOrder(View view) {
        // in Lesson 7 quiz 3 we add method: displayMessage that will take string message and put it in price_text_view  so we delete this command below:
        // displayPrice(quantity*5);//displayPrice is a method to update the price
        // and use this new command:
        // String = priceMessage
        // displayMessage (priceMessage))

        //String  message = "The Total is:  "+ "$ " +quantity*5;
        // String orderNumber = "Order number: " + 23;
        //String barista = "You were served by "+"Jack";
        // String sneakyPromotion = "You are"+2+"Cups away from a free drink";
        int price = quantity * 3;
        String message = "Take " + quantity + " cups of coffee \n for $" + price + "\n";
        message = message + " second is the quntity: " + quantity + "\n";
        message = " the summary is " + message;
        displayMessage(message);


    }


    /*this is a method: display
     used access TextView with id: quantity_text_view
     it'll take whatever symbol there and put it instead of "" and after that it'll take the (number's value) and put it right after*/
    private void display(int number) {

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }

    /*this method:displayPrice
     * sd
     * */

    private void displayPrice(int number) {

        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }


    private void displayMessage(String message) {

        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }



    /*now this is step 2: using + and - button to add and minus quantity
     * we want to have two methods:
     * one called increment: with initial value = 3
     * display (quantity)
     * the second one called decrement: with initial value = 1
     * displaying  display(quantity)*/

    /*    step 2: first  method  (Plus button) is clicked :
     * */

    public void increment(View view) {

        quantity = quantity + 1;

        display(quantity);

    }


    /*    step 2: second  method (Minus button) is clicked:*/


    public void decrement(View view) {

        quantity = quantity / 2;
        display(quantity);

    }


}
