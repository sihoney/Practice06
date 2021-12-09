package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        if(str.equals("앱")) {
        	playApp();
        } else {
        	super.execute(str);
        }
        
    }
 
    //메소드작성
    public void playApp() {
    	System.out.println("앱실행");
    }
    //메소드작성
    
    
    
}
