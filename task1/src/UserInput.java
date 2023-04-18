public class UserInput {
    public static void main(String[] args) {
        // Checking if length of args array is > 0
        if (args.length > 0) {
            System.out.print("Input user name : \n");
            //Iterating args with for each loop
            for (String name : args) {
                //printing command line arguments
                System.out.print("User Name : " + name + ' ');
            }
        } else {
            System.out.println("Input a valid username!");
        }
    }
}
