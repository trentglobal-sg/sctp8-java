public class Main {
    public static void main (String[] args) {
        Employee e = new Employee();
        System.out.println(e.getFirstName());
        System.out.println(e.getLastName());
        System.out.println(e.getAnnualLeaveLeft());
   
        Employee e2 = new Employee(
            "Mary",
            "Sue",
            200,
            4500,
            21
        );
    }
}