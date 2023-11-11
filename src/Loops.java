public class Loops {
    public static void main(String[] args) {
        Loops myCount= new Loops();
    }
public Loops() {
     countUp();
     countByThrees();
     countDown();
    }
public void countUp(){
        for(int h = 1; h <= 5; h++){
            System.out.println(h);
    }
}
public void countByThrees(){
        for (int s=3; s<= 15; s=s+3){
            System.out.println(s);
        }
    }
public void countDown() {
    for (int t = 10; t >= 1; t = t - 1) {
        System.out.println(t);
    }
        System.out.println("Happy Loop Year");
    }
}

