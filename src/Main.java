
public class Main {
    public static void main(String[] args) {
        double[] numbers = { 3.5, 4.2, -1.5, 2.3, -3.0, 5.5, -6.2, 7.1, -2.4, 0.0, 8.8, 1.2, -4.4, 6.6, -7.7};
        System.out.println("Ваш массив" + numbers);
        boolean negative = false;
        double sum = 0.0;
        int count = 0;
        for (double number: numbers) {
            if (!negative) {
                if (number < 0) {
                    negative = true;
                }
            } else {
                if (number > 0) {
                    sum += number;
                    count++;

                }
            }
        }
        if (count > 0) {
            double summ = sum/count;
            System.out.println(sum + "/" + count + "или" + summ);
        }
    }
}
