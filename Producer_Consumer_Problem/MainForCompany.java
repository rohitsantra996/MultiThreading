package Producer_Consumer_Problem;
//Project name : Producer consumer problem
//mini project tha with Covering Concepts -->Synchronite keyword and Inter thread communication
public class MainForCompany {
    public static void main(String[] args){
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);
        p.start();
        c.start();;
    }
}
