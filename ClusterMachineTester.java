

import java.io.IOException;

public class ClusterMachineTester 
{
    public static void main(String[] args) throws IOException {
    
        clusterMachine clusterMachine = new clusterMachine();
        clusterMachine.setMaxClusters(101);
        clusterMachine.run("2dPoints.txt");
        clusterMachine.refine(40);
        System.out.println("Finished");
    }
}
