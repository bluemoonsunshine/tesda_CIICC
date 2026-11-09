public class Task8 {

    public static int calculateCumulativeSums(int... numbers) {
        int totalSum = 0;
        
        System.out.println("Processing parameters:");
        for (int num : numbers) {
            int currentSum = 0;
            StringBuilder formula = new StringBuilder();
            
            for (int i = 1; i <= num; i++) {
                currentSum += i;
                formula.append(i);
                if (i < num) {
                    formula.append("+");
                }
            }
            
            System.out.println("Parameter " + num + " -> Cumulative Sum: " + currentSum + " (" + formula + ")");
            totalSum += currentSum;
        }
        
        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println("--- Test with parameters (4, 5, 10) ---");
        int result = calculateCumulativeSums(4, 5, 10);
        System.out.println("Total return value: " + result);
    }
}
