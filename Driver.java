import java.util.*;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Options:");
            System.out.println("0: Exit Application");
            System.out.println("1: Bubble Sort");
            System.out.println("2: Insertion Sort");
            System.out.println("3: Selection Sort");
            System.out.println("4: Heap Sort");

            System.out.print("Enter your option: ");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 0) {
                System.out.println("Exiting Application...");
                break;
            }

            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] array = generateRandomArray(size);

            System.out.println("Random array: " + Arrays.toString(array));

            // Perform the selected sort
            if (option == 1) {
                Sort.bubbleSort(array);
                System.out.println("Sorted array (Bubble Sort): " + Arrays.toString(array));
            } else if (option == 2) {
                Sort.insertionSort(array);
                System.out.println("Sorted array (Insertion Sort): " + Arrays.toString(array));
            } else if (option == 3) {
                Sort.selectionSort(array);
                System.out.println("Sorted array (Selection Sort): " + Arrays.toString(array));
            } else if (option == 4) {
                Sort.heapSort(array);
                System.out.println("Sorted array (Heap Sort): " + Arrays.toString(array));
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); 
        }
        return array;
    }
}
