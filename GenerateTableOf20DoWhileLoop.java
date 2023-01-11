package HomeworkWeek3;

public class GenerateTableOf20DoWhileLoop {
    public static void main(String[] args) {
        int x=20;
        int y=1;
        do {
            System.out.println(x+"*"+y+"="+x*y++);
        }while (y<=10);
    }
}
