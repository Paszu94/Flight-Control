public class Home {

    public void isDivided(int min, int max) {
        for (int i = min; i <= max; i++)
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
    }

    public void getEvenSum(int min, int max) {
        for (int a = min, b = min; a <= max && b <= max; a = a + 1, b = a + 2)
            if (a % 2 == 0 && b % 2 == 0) {
                System.out.println(a + b);
            }

    }

    public void getNumbers(int min, int max){
        for (int a = min; a>=max; a = a-1){
            System.out.println(a);
        }
    }
}
