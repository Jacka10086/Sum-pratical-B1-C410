package Assignments.Com410.B1;

public class SumAnalysis {
    
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
    long start, duration, result;
    int[] times = {1, 1, 10, 100, 1000, 10000, 100000, 1000000};

    System.out.printf("%15s%15s%15s%15s\n", "Size", "sumA()", "sumB()", "sumC()");

    for (int time : times) {
        System.out.printf("%15d", time);
      
        start = System.nanoTime();
        result = sumA(time);
        duration = System.nanoTime() - start;
        System.out.printf("%15d", duration);

        start = System.nanoTime();
        result = sumB(time);
        duration = System.nanoTime() - start;
        System.out.printf("%15d", duration);

        start = System.nanoTime();
        result = sumC(time);
        duration = System.nanoTime() - start;
        System.out.printf("%15d\n", duration);


    }
   
}
}
