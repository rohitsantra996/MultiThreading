package Producer_Consumer_Problem;

public class Producer extends Thread{

    Company c;
    Producer(Company c){
        this.c =c; // <-- obj assign ho raha h
    }

    public void run(){
        int i =1;
        while (true) {

            try{
                Thread.sleep(1000);//Exception throw karta h

                this.c.produce_item(i);// calling by obj

            }catch (Exception e){

            }
            i++;
        }

    }
}
