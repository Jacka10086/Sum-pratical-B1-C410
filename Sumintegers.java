package Assignments.Com410.B1; // 定义包路径

// Sumintegers类包含了计算从1加到n的不同方法
public class Sumintegers {
    
    // sumA方法：使用单循环累加从1到n的整数
    public static long sumA(int n) {
        long sum = 0; // 初始化总和为0
        for (int i = 1; i <= n; i++) // 循环从1加到n
            sum += i; // 将每个i加到总和上
        return sum; // 返回总和
    }

    // sumB方法：使用嵌套循环计算总和
    public static long sumB(int n) {
        long sum = 0; // 初始化总和为0
        for (int i = 1; i <= n; i++) { // 对于每个从1到n的i
            for (int j = 1; j <= i; j++) { // 内层循环从1加到i
                sum = sum + 1; // 每次循环加1
            }
        }
        return sum; // 返回总和
    }

    // sumC方法：使用等差数列求和公式直接计算总和
    public static long sumC(int n) {
        long sum = 0; // 初始化总和为0
        sum = n * (n + 1) / 2; // 应用公式n(n+1)/2计算总和
        return sum; // 返回总和
    }

    // main方法用于比较三种方法的效率
    public static void main(String[] args) {
        long start, duration; // 声明计时变量

        // 测试sumA方法
        start = System.nanoTime(); // 记录开始时间
        System.out.println("sumA to 10000 = " + sumA(10000)); // 输出sumA方法的结果
        duration = System.nanoTime() - start; // 计算耗时
        System.out.println(duration + "ns"); // 输出耗时

        // 测试sumB方法
        start = System.nanoTime(); // 记录开始时间
        System.out.println("sumB to 10000 = " + sumB(10000)); // 输出sumB方法的结果
        duration = System.nanoTime() - start; // 计算耗时
        System.out.println(duration + "ns"); // 输出耗时

        // 测试sumC方法
        start = System.nanoTime(); // 记录开始时间
        System.out.println("sumC to 10000 = " + sumC(10000)); // 输出sumC方法的结果
        duration = System.nanoTime() - start; // 计算耗时
        System.out.println(duration + "ns"); // 输出耗时
    }
}
