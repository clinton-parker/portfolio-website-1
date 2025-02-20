import java.util.Scanner;

public class standarddeviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the number of elements
        System.out.print("Enter the number of data points: ");
        int size = scanner.nextInt();
        
        double[] array = new double[size];
        double sum = 0, sumDev = 0;
        
        // Input elements and compute sum
        System.out.println("Enter the data points: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
            sum += array[i];
        }
        
        // Calculate mean
        double mean = sum / size;
        
        // Calculate sum of squared deviations
        for (int i = 0; i < size; i++) {
            sumDev += Math.pow(array[i] - mean, 2);
        }
        
        // Calculate variance and standard deviation
        double variance = sumDev / size;
        double standardDeviation = Math.sqrt(variance);
        
        // Output results
        System.out.println("Mean = " + mean);
        System.out.println("Total Deviation = " + sumDev);
        System.out.println("Variance = " + variance);
        System.out.println("Standard Deviation = " + standardDeviation);
        
        scanner.close();
    }
}
