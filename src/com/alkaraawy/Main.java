package com.alkaraawy;

public class Main {

    public static void main(String[] args) {
	for(int i=1;i<=8;i++){
	    for(int j=1;j<=i;j++){

            if(j==1){
                System.out.print("*");
            }else if(i==j){
                System.out.print("*");
            }else if (i==8){
                System.out.print("*");
            }
            else
                System.out.print("-");



        }
        System.out.println(" ");
    }
    }
}
