public class Main{
  public static void main(String[]args){
    Movie m1=new Movie("Andala Rakshasi","2 hours.24 min",9);
    m1.details();
    
  }

}
public class Movie {
   String name;
   String duration;
   float rating;

  
  Movie(String name,String duration,float rating){
    this.name=name;
    this.duration=duration;
    this.rating=rating;
    
  }
  void details(){
    System.out.println("------");
    System.out.println("Movie name:"+name);
    System.out.println("Movie duration:"+duration);
    System.out.println("Movie rating:"+rating);
    if(rating>8){
        System.out.println("Movie is Hit");
    }else if(rating>5){
        System.out.println("Movie is avg");
    }else{
        System.out.println("Movie is flop ");
    }
}
}

