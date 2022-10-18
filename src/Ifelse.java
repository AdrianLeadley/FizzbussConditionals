public class Ifelse {
    public static void main(String [] args) {
        Ifelse objx = new Ifelse();
        // if - obj is it really a instance of Ifelse class

        if(objx instanceof Ifelse ) {
            System.out.println("if block");

        }else {
            System.out.println("else block");
        }
    }
}
