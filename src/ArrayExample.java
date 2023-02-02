// Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

public class ArrayExample {
    public static void main(String[] args) {
        String[] cats = {"Dash", "Carl", "Eleven", "Rick"};
        int[] age = {2, 8, 1, 2};

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }

        System.out.println();

        for (String i : cats) {
            System.out.println(i);
        }

        System.out.println();

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.print(myNumbers[i][j]);
            }
        }

        System.out.println();

        String[][] myFruits = { {"Apple", "Banana", "Pineapple", "Pear"}, {"Citrus", "Melon", "Berry"}};
        for (int i = 0; i < myFruits.length; i++) {
            for (int j = 0; j < myFruits[i].length; j++) {
                System.out.print(myFruits[i][j] + " ");
            }
        }
    }
}
