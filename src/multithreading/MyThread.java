package multithreading;


    class MyThread implements Runnable {
        public void run() {
            for(int i = 1; i <= 10; ++i) {
                System.out.println(" Value of i  is " + i);

                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException var3) {
                }
            }

        }

        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            Thread thr = new Thread(t1);
            thr.start();
            MyAnotherThread t2 = new MyAnotherThread();
            t2.start();
        }
    }


