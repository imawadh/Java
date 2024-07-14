class incrementDecrement {
    public static void main(String[] args)  {
        int a = 5;
        int b = 3;
        int c = -1;
        int d = 0;
        int e = -5;
        int res;
        res = --c - a-- + ++e + --b - d-- + ++d - a++ + ++b + c++ -b-- + --a;
        System.out.println("A " + a); // Output: 4
        System.out.println("B " + b); // Output: 2
        System.out.println("C " + c); // Output: -1
        System.out.println("D " + d); // Output: 0
        System.out.println("E " + e); // Output: -4
        System.out.println("Result: " + res); // Output: -11
        
        int s  = 11;
        s = s--;
        System.out.println("S: " + s); // Output: 11
        int t = 11;
        t = ++t;
        System.out.println("t: " + t); // Output: 12
    } 
}
