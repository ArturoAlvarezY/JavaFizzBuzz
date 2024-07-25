package dev.arturo.models;

public class FizzBuzz {

    public String checkNumber(int numb){

        boolean divisibleBy3 = numb % 3 == 0;
        boolean containsThree = Integer.toString(numb).contains("3");

        boolean divisibleBy5 = numb % 5 == 0;
        boolean containsFive = Integer.toString(numb).contains("5");

    
    if(divisibleBy3 && divisibleBy5){
        return "FizzBuzz";
    }
    else if (divisibleBy3 || containsThree) {
        return "Fizz";
    } 
    else if(divisibleBy5 || containsFive){
        return "Buzz";
    }
    else{
        return Integer.toString(numb);
    }
    }

    
}
