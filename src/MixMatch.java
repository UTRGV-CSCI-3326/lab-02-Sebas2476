public class MixMatch{

    public static void main(String[] args) {
        String Name = "sebas";
        char letter = 't';
        short Var_short = 200;
        int Var_Int = 2;
        long var_long = 5;
        float var_float = 2.40f;
        double var_double = 2.444;
        boolean var_bool = true;
        

        System.out.println(Name + " This is a String Data Type, once you create a type string, it cannot be modified, when you intialize it to a different string value it actually just creates a new object of the string within memory");
        System.out.println(letter + " This is a char data type, it specifically holds one character as the name would suggest");
        System.out.println(Var_short + " This is a short type, they hold 2 bytes of memory and can store whole numbers from -32,768 to 32,767");
        System.out.println(Var_Int + " This is a int type, theu hold numbers between -2,147,483,648 to 2,147,483,647");
        System.out.println(var_long + " This is a long type, it can store just as much numbers compared to a normal int type ");
        System.out.println(var_float + " This is a float type, a float value can hold somewhere between 6-7 decimals  ");
        System.out.println(var_double + " Meanwhile a double type can hold twice as much by like 15 to 16 decimals ");
        System.out.println(var_bool + " This is a Boolean type, it declares whether something is true or not");

        System.out.println(" "); //this is to space between the lines above 

        System.out.println("Name: " + "(" + Name + ")" + " Letter: " + "(" +letter + ")" + " Short: " + "(" +Var_short + ")" + " Int: " + "(" +Var_Int + ")" + " Long: " + "(" +var_long + ")" + " Float: " + "(" +var_float + ")" + " Double: " + "(" +var_double + ")" +  " Bool: " + "(" +var_bool + ")");



    }
}