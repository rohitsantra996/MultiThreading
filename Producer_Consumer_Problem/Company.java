package Producer_Consumer_Problem;


//Covered ---> synchronized ka concept


public class Company {



     int n;
     boolean f = false;
//f =false : chance ---> producer
// f = true : chance ---> cosumer

  synchronized  public void produce_item(int n) throws Exception{
      if(f){
          wait();//<-- exception throw karta h, for solving it u can use try-catch ,
      }
  this.n = n;
  System.out.println("Produced : "+this.n);
      f = true;
   notify(); // Object class parent ka mehtod notification dekata h Next synchronised method ko
    }


   synchronized public int consume_item()throws Exception{
        if(!f){
            wait();//It belongs to Object Class parent It takes Pause , Exception through Karta Hey
        }
        System.out.println("Consumed : "+this.n);
        f = false;
        notify(); // Object class parent ka mehtod notification dekata h Next synchronised method ko
      return this.n;
    }

}
