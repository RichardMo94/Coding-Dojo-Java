public class ProjectTest{
    public static void main(String[] args){
        Project user1 = new Project("richard", "this is a ninja", 200);
        System.out.println(user1.getName());
        System.out.println(user1.getDescription());
        System.out.println(user1.getCost());
        System.out.println(user1.elevatorPitch());
    }
}