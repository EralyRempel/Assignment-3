import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Searcher searcher = new Searcher();
        Experiment experiment = new Experiment();

        int[] sizes = {10, 100, 1000};

        System.out.println("Algorithm Analysis System Results");
        System.out.println("=================================");

        for (int size : sizes) {
            System.out.println("\nDataset Size: " + size);

            int[] originalArray = sorter.generateRandomArray(size);
            int[] basicTestArr = Arrays.copyOf(originalArray, originalArray.length);
            int[] advancedTestArr = Arrays.copyOf(originalArray, originalArray.length);

            long basicTime = experiment.measureSortTime(basicTestArr, "basic");
            System.out.println("Selection Sort Time: " + basicTime + " ns");

            long advancedTime = experiment.measureSortTime(advancedTestArr, "advanced");
            System.out.println("Quick Sort Time:     " + advancedTime + " ns");

            int target = advancedTestArr[size / 2];
            long searchTime = experiment.measureSearchTime(advancedTestArr, target);
            System.out.println("Binary Search Time:  " + searchTime + " ns");
        }

        System.out.println("\n=================================");
        System.out.println("Experiment Completed.");
    }
}