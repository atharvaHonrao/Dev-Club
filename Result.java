public interface Result{

    int CheckCorrect(String[][]s,int ans,int y);

}
class MathsResult implements Result {

    public int CheckCorrect(String[][] s, int ans, int y) {

        int m = 0;
        if (s[y][ans - 1] == s[y][5]) {
            System.out.println("Good!!Your ans is correct");
            m++;
        } else {
            System.out.println("Sorry! Your answer is wrong\nThe correct ans is: " + s[y][5]);
        }
        return m;
    }
}

class JavaResult implements Result{

    public int CheckCorrect(String [][]s,int ans,int y){
        int m = 0;
        if (s[y][ans - 1] == s[y][5]) {
            System.out.println("Good!!Your ans is correct");
            m++;
        } else {
            System.out.println("Sorry! Your answer is wrong\nThe correct ans is: " + s[y][5]);
        }
        return m;

    }
}
