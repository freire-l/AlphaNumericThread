package org.luisf.model;

public class AphaNumericHW implements Runnable{
    
    Type type;

    public AphaNumericHW(Type type) {
        this.type = type;
    }

    @Override
    public void run() {
        if(type == Type.NUMBER){
            for(int i = 1; i < 10; i++)
                System.out.println("i = " + i);
        }
        else{
            for(int i = 65; i <= 90; i++)
                System.out.println("Letter = " + Character.toString(i));
        }

    }
}
