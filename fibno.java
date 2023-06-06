public class fibno {
    public static void main (String[] args)
    {
        int count=10;
    for (int i = 0; i < count; i++)
    {
        System.out.println(fib(i));
    }
}

public static long fib(long n) {
    if (n == 0 )
    {return 0;}
    else if ( n == 1) {
    return 1;}
    else {
    return fib(n - 1) + fib(n - 2);
}
}
}

