public class Conditionals {
    public String question;
    public int randomInt;
    public static void main(String[] args){
        Conditionals MagicEightBall= new Conditionals();

    }
    public Conditionals(){
    MagicEightBall();
    }
    public void MagicEightBall(){
    question = "Did you hand in your work?";
    randomInt = (int) (Math.random() * 11);
    System.out.println(randomInt);
    System.out.println(question);

    if (randomInt >= 0 && randomInt <=2) {
        System.out.println("Yessir!");
    } else if (randomInt == 3) {
        System.out.println("No Chance!");
    } else if (randomInt >= 4 && randomInt <=5) {
        System.out.println("How would I know?");
    } else if (randomInt == 6) {
        System.out.println("Obviously");
    } else if (randomInt >= 7 && randomInt <=9) {
        System.out.println("I'm busy rn. Leave me alone");
    } else {
        System.out.println("Ain't No Way I'm doing that");
    }
    }

}
