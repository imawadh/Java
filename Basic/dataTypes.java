class dataTypes{
    public static void main(String[] args)
    {
        char a = 'A';
        char b = 65;
        char c = 0101;
        char d = 0x0041;
        char e = 0b01000001;
        char f = '\u0041';
        // char g = u+ 0041;

        System.out.println("Character A : " + a);
        System.out.println("Character B : " + b);
        System.out.println("Character C : " + c);
        System.out.println("Character D : " + d);
        System.out.println("Character E : " + e);
        System.out.println("Character F : " + f);


        // Now for symbol 6
        char symbol60 = '6';
        System.out.println("Character 60 : " + symbol60);
        char symbol61 = 54;
        System.out.println("Character 61 : " + symbol61);
        char symbol64 = 0b110110;
        System.out.println("Character 64 : " + symbol64);
    }
}