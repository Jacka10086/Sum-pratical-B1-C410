package Assignments.Com410.B1;

public class Sumintegers {
    
    public static long sumA(int n)
    {
        long sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    public static long sumB(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            sum = sum + 1;
    }
}
    return sum;
}

public static long sumC(int n) {
    long sum = 0;
    sum = n * (n + 1) / 2;
    return sum;
}

public static void main(String[] args) {
    long start, duration;

    start = System.nanoTime();
    System.out.println("sumA to 10000 = " + sumA(10000));
    duration = System.nanoTime() - start;
    System.out.println(duration + "ns");

       start = System.nanoTime();
    System.out.println("sumB to 10000 = " + sumB(10000));
    duration = System.nanoTime() - start;
    System.out.println(duration + "ns");

       start = System.nanoTime();
    System.out.println("sumC to 10000 = " + sumC(10000));
    duration = System.nanoTime() - start;
    System.out.println(duration + "ns");
}
}
