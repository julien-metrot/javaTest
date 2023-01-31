public class FizzBuzz2 {
    public static void main(String[] args) {

        for (var i = 1; i < 101; i++) {
            var output = "";
            if (i % 3 == 0){ output += "Fizz"; }
            if (i % 5 == 0){ output += "Buzz"; }
            if (i % 7 == 0){ output += "B0nk"; }

            if ( output.equals("") ){ output += i; }

            System.out.println(output);
        }
    }
}