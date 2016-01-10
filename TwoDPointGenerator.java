import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TwoDPointGenerator {
    static int range = 600;
    static int numPoints = 50000;
    public static void main(String[] args) throws IOException {
           
        int xLowRange = 0;
        int xHighRange = range;
        int xRange = xHighRange - xLowRange;
        int yLowRange = 0;
        int yHighRange = range;
        int yRange = yHighRange - yLowRange;
        Integer[] point;
        List<Integer[]> pointList = new ArrayList();
        PrintWriter output;
        Random random = new Random();
        String name = "2dPoints.txt";
        
        
        System.out.println("Generating Points.");
        for(int i = 0; i < numPoints; i++) {
            point = new Integer[2];
            point[0] = random.nextInt(xRange) - xLowRange;          
            point[1] = random.nextInt(yRange) - yLowRange;
            pointList.add(point);
        }
        
        output = new PrintWriter(new BufferedWriter(new FileWriter(name)));
        for(int i = 0; i < numPoints; i++) {
            output.println(pointList.get(i)[0] + "," + pointList.get(i)[1]);
        }
        output.close();
        System.out.println("Points printed to " + name);    
    }
    
}
