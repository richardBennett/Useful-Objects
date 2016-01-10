import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
 
public class ArrayPrinter {
     
    public void toFile(double[][] array, String name) throws IOException {
        DecimalFormat df = new DecimalFormat("0.000");
        try (PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(name)))) {
            for (double[] array1 : array) {
                for (int j = 0; j < array[1].length; j++) {
                    output.print(df.format(array1[j]) + ", ");
                }
                output.println();
            }
        output.close();
        }       
        System.out.println("\tArray written to file: " + name);
    }
     
    public void toFile(double[] array, String name) throws IOException {
        DecimalFormat df = new DecimalFormat("0.000");
        try (PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(name)))) {
            for(int i = 0; i < array.length; i++)
                output.print(df.format(array[i]) + ", ");
        output.close();
        }
        System.out.println("\tArray written to file: " + name);
    } 
     
    public void toFile(int[][] array, String name) throws IOException {
        try (PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(name)))) {
            for (int[] array1 : array) {
                for (int j = 0; j < array[1].length; j++) {
                    output.print(array1[j] + ", ");
                }
                output.println();
            }
        output.close();
        }       
        System.out.println("\tArray written to file: " + name);
    }
     
}
