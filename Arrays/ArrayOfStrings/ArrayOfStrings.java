package Projects;

public class ArrayOfStrings {
    public static void main(String[] args) {
        String[][] twoDArray = {{"Hello", "world"}, {"Java", "programming", "language"}};

        System.out.println("Printing 2D array using for loop:");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        String[][][] threeDArray = {{{"Apple", "Banana"}, {"Cherry", "Durian"}},
                {{"Eggplant", "Fig"}, {"Grape", "Honeydew"}}};

        System.out.println("\nPrinting 3D array using for each loop:");
        for (String[][] twoDArrayElement : threeDArray) {
            for (String[] oneDArrayElement : twoDArrayElement) {
                for (String element : oneDArrayElement) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}