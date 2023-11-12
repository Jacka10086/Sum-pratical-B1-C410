package Assignments.Com410.B1; // 定义包路径

// SumAnalysis类用于分析不同求和方法的效率
public class SumAnalysis {
    
    // 使用循环进行求和
    public static long sumA(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) // 从1加到n
            sum += i;
        return sum;
    }
     

    // 使用嵌套循环进行求和
    public static long sumB(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) { // 对于每一个i从1加到n
            for (int j = 1; j <= i; j++) { // j从1加到i
                sum = sum + 1;
            }
        }
        return sum;
    }

    // 使用公式进行求和
    public static long sumC(int n) {
        long sum = 0;
        sum = n * (n + 1) / 2; // 使用等差数列求和公式
        return sum;
    }

    // main方法用于测试三种求和方法的执行时间
    public static void main(String[] args) {
        long start, duration, result; // 声明计时变量
        int[] times = {1, 1, 10, 100, 1000, 10000, 100000, 1000000}; // 定义测试的数值大小

        // 打印表头
        System.out.printf("%15s%15s%15s%15s\n", "Size", "sumA()", "sumB()", "sumC()");

        // 遍历数组，测试每个数值
        for (int time : times) {
            System.out.printf("%15d", time); // 打印数值大小
            
            // 测试sumA方法的执行时间
            start = System.nanoTime();
            result = sumA(time);
            duration = System.nanoTime() - start;
            System.out.printf("%15d", duration);

            // 测试sumB方法的执行时间
            start = System.nanoTime();
            result = sumB(time);
            duration = System.nanoTime() - start;
            System.out.printf("%15d", duration);

            // 测试sumC方法的执行时间
            start = System.nanoTime();
            result = sumC(time);
            duration = System.nanoTime() - start;
            System.out.printf("%15d\n", duration);
        }
    }
}
