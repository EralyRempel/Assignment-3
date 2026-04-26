public class Experiment {
    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        long startTime = System.nanoTime();
        if (type.equalsIgnoreCase("basic")) {
            sorter.basicSort(arr);
        } else if (type.equalsIgnoreCase("advanced")) {
            sorter.advancedSort(arr);
        }
        return System.nanoTime() - startTime;
    }

    public long measureSearchTime(int[] arr, int target) {
        long startTime = System.nanoTime();
        searcher.search(arr, target);
        return System.nanoTime() - startTime;
    }
}
