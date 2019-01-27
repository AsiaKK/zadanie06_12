public class ShowAllEvenNumber {

    public static void main(String[] args) {
        int result = 0;
        int number = 0;

        while (number <= 100) {

            if (number % 2 == 0) {
                System.out.println(number);
                result = result+number;
            }
            number++;
        }

        System.out.println("Suma wszystkich liczb parzystych: " + result);
    }
}
