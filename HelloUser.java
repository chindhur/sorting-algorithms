public class HelloUser{
    public static void main(String[] args){
       // Checking if length of args array is > 0
        if(args.length>0){
            System.out.print("Hello \n");
  //Iterating args with for each loop
            for(String name:args){
                //printing command line arguments
                System.out.print(name + ' ');
            }
        }else{
            System.out.println("Hello user");
        }
    }
}