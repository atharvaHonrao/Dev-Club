//import java.util.Scanner;

public abstract class Topic extends Data{

    abstract String[][] getQuestion();

    abstract void printQuestion(String [][]g,int y);
    //abstract void Input();

}

class TopicMaths extends Topic{

    String[][] getQuestion(){
        System.out.println();
        return MathsQuestions ;
     }

     void RandomizeQuestion(String [][]g) {

         //TopicMaths s = new TopicMaths();
         //String[][] g = s.getQuestion();

         random u = new random();
         u.ran(g);

     }
     void printQuestion(String [][]g,int y ){

             for (int r = 0; r < 4; r++) {

                 System.out.println(r + 1 + "." + g[y][r]);
             }
     }

     //void Input(int a,int b){
        // Scanner opt = new Scanner(System.in);
     //}

}
class TopicJava extends Topic {
    String[][] getQuestion(){
        System.out.println();
        return JavaQuestions ;
    }

    void RandomizeQuestion(String [][]g) {

        //TopicMaths s = new TopicMaths();
        //String[][] g = s.getQuestion();

        random u = new random();
        u.ran(g);
    }
    void printQuestion(String [][]g,int y ){

        for (int r = 0; r < 4; r++) {

            System.out.println(r + 1 + "." + g[y][r]);
        }
    }
    //void Input(int a,int b){
    // Scanner opt = new Scanner(System.in);
    //}
}