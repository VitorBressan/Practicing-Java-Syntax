public class Main {
    public static String getAccessLevel(User user){
        if (user == null || !user.isActive()){
            return "Invalid User";
        } 
        
        int userAge = user.getAge();
        if (userAge < 18){
            return "C";
        } else if (userAge >= 18 && userAge < 24){
            return "B";
        } else {
            return "A";
        }
    }

    public static void main(String[] args){
        User user = new User(19);
        switch (getAccessLevel(user)) {
            case "C":
                System.out.print("Acess Level C, minor permitions granted");
                break;

            case "B":
                System.out.print("Acess Level B, medium permitions granted");
                break;

            case "A":
                System.out.print("Acess Level A, all permitions granted");
                break;

            default:
                System.out.print("Invalid User. No permitions granted!");
                break;
        }
    }
}