public class ifcondition {
    public static void main(String[] args) {
      int age=10;
      if(age<18)
      System.out.println("You are a teenager");  
      else
      System.out.println("You are an adult");

    System.out.println("condition inside loop");
        int loop=0;
        while(loop<10)
        {
            System.out.println("Looping is on."+loop);
            loop++;
            if(loop==5){
            break;
        }
    }
    }



}
