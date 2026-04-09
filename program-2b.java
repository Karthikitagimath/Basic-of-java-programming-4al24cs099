//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which one is better
public class StringPerformanceTest {
    public static void main(String[] args) {

        int iterations = 10000;

        // Test for StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("AIET");
        }

        long endTimeBuffer = System.nanoTime();
        long timeBuffer = endTimeBuffer - startTimeBuffer;

        // Test for StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("AIET");
        }

        long endTimeBuilder = System.nanoTime();
        long timeBuilder = endTimeBuilder - startTimeBuilder;

        // Output results
        System.out.println("StringBuffer Time: " + timeBuffer + " ns");
        System.out.println("StringBuilder Time: " + timeBuilder + " ns");

        // Conclusion
        if (timeBuffer > timeBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }
    }
}






