import java.util.Scanner;

public class searchMaxValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do{
            System.out.println("Enter a size for array: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Size should not exceed 20");
            }
        }while (size > 20);

        int [] array = new int[size];
        int i = 0;
        while (i < size){
            System.out.println("Enter element "+ (i+1)+" is: ");
            array[i] = scanner.nextInt();
            i++;
        }
        // display element of array
        System.out.print("Elements of Array: ");
        for (int element : array){
            System.out.print(element +"\t");
        }
        //Search value max, index
        int maxElement = array[0];
        int index = 0;
        for (int j = 0;j < array.length;j++){
            if (array[j] > maxElement){
                maxElement = array[j];
                index = j +1;
            }
        }
        System.out.println(" ");
        System.out.println("Element Max of Array is: "+maxElement +" with index is: "+index);


    }
}
