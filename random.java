import java.util.Random;

public class random {

    String temp;
    int a, b;

    static Random k = new Random();
    static Random h = new Random();

    /* public   void swap(String a1, String b1) {
        temp = a1;
        a1 = b1;
        b1 = temp;
    }*/

    public void ran(String[][] m) {

        //RandomizeOptions
        for (int w = 0; w < 3; w++) {

            for (int i = 0; i < 7; i++) {

                a = k.nextInt(4);
                b = h.nextInt(4);

                //random obj = new random();
                //obj.swap(m[w][a],m[w][b]);
                //problem: no swap happening, reference not passing

                temp = m[w][a];
                m[w][a] = m[w][b];
                m[w][b] = temp;
            }
        }

        //RandomizeQuestions
        for (int i = 0; i < 5; i++) {
            a = k.nextInt(3);
            b = h.nextInt(3);
            for (int c = 0; c < 6; c++) {


                temp = m[a][c];
                m[a][c] = m[b][c];
                m[b][c] = temp;

                //random o = new random();
                //o.swap(m[a][c], m[b][c]);
            }

        }

    }
}