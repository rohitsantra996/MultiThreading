package Producer_Consumer_Problem;

public class Consumer extends Thread {
    Company c;
    Consumer(Company c){
        this.c = c; // obj assign hua
    }
    public void run(){

        while (true){


            try{
                Thread.sleep(3000);

                this.c.consume_item();

            }catch (Exception e){

            }
        }
    }




}
