import java.util.Scanner;

public class Main extends Data{
    public static void main(String[] args) {

        int optTopic;
        int ans,p=0;
        System.out.println("Welcome to the Quiz!!!!");
        Scanner sc =new Scanner(System.in);


        do {
            System.out.println("The menu for the quiz is:\n1.Maths\n2.Java\n3.Exit the Quiz");
            optTopic=sc.nextInt();

            switch (optTopic) {

                case 1:

                    System.out.println("You have entered the Maths Quiz");
                    TopicMaths s1 = new TopicMaths();
                    MathsResult l1 = new MathsResult();
                    String[][] g1 = s1.getQuestion();
                    s1.RandomizeQuestion(g1);

                    for (int y = 0; y < 3; y++) {

                        int m = 0;
                        System.out.println("Q.no." + (y + 1) + ": " + g1[y][4]);
                        s1.printQuestion(g1, y);
                        ans = sc.nextInt();

                        if (y < 2) {
                            m = l1.CheckCorrect(g1, ans, y);
                        }
                        if (m == 1) {
                            p++;
                        }
                        if (y == 2) {
                            m = l1.CheckCorrect(g1, ans, y);
                            if (m == 1) {
                                p++;
                            }
                            System.out.println("Your Result for the Maths Quiz is: " + p + "/3");

                        }
                    }
                    break;

                case 2:
                    System.out.println("You have entered the Java Quiz");
                    TopicJava s2 = new TopicJava();
                    JavaResult l2 = new JavaResult();
                    String[][] g2 = s2.getQuestion();
                    s2.RandomizeQuestion(g2);

                    for (int y = 0; y < 3; y++) {

                        int m = 0;
                        System.out.println("Q.no." + (y + 1) + ": " + g2[y][4]);
                        s2.printQuestion(g2, y);
                        ans = sc.nextInt();

                        if (y < 2) {
                            m = l2.CheckCorrect(g2, ans, y);
                        }
                        if (m == 1) {
                            p++;
                        }
                        if (y == 2) {
                            m = l2.CheckCorrect(g2, ans, y);

                            if (m == 1) {
                                p++;
                            }
                            System.out.println("Your Result for the Java Quiz is: " + p + "/3");
                        }
                    }
                    break;


                    case 3:
                        break;

                        default:
                            System.out.println("Warning!! Wrong Input");
                            break;

            }
            p=0;

        }while(optTopic!=3);

        System.out.println("Thank You!!!!");

    }

}