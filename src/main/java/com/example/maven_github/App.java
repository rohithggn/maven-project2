package com.example.maven_github;

import com.example.maven_github.App;

/**
 * Hello world!
 */
public class App {
    public int AvgofTwo(int a,int b){
    	
       return (a+b)/2;
    }
    
    public int AvgofThree(int a,int b,int c){
    	
        return (a+b+c)/3;
     }
   

    
    public static void main(String[] args) {
    	App app=new App();
    	System.out.println(app.AvgofTwo(1,2));
    	System.out.println(app.AvgofThree(1,2,3));
    	
    }

}
