package Java2;

public class J058_MyTime {
	 public static void main(String[] args) {  
	        Time time = new Time(1,2,3);  
	        time.diaplay();  
	        time.subHour(1);   
	        time.subSecond(1);  
	        time.diaplay();  
	    }  
}


class Time{  
 
   private int hour;  
   private int minute;  
   private int second;  
   public Time(int hour, int minute, int second) {  
     this.hour = hour;  
     this.minute = minute;  
     this.second = second;  
   }  
   public void diaplay(){  
     System.out.println("当前时间："+hour+":"+minute+":"+second);  
   }  
   public void addMinute(int min){  
     this.minute = minute+min;  
   }  
   public void addHour(int hour){  
     this.hour+=hour;  
   }  
   public void addSecond(int sec){  
     this.second+=sec;  
   }  
  public void subHour(int hour){  
     this.hour-=hour;  
  }  
   public void subMinute(int minute){  
     this.minute-=minute;  
  }  
  public void subSecond(int second){  
      this.second-=second;  
  }  
}  