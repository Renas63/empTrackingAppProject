import java.util.Random;

public class Employee {

String  firstName, lastName, email,startDate, title, department;
String employeeId;
int phoneNumber;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", startDate='" + startDate + '\'' +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public Employee(String firstName, String lastName, String email,
                    String startDate, String title, String department, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.startDate = startDate;
        this.title = title;
        this.department = department;
        this.employeeId = generateEmployeeId();
        this.phoneNumber = phoneNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public static   String generateEmployeeId (){
//        int num=(int)(Math.random()*100_000_000);
//        return " "+num;
        Random random= new Random();

        String string = "0abcdefghijk123lmnopq456rstuv789wxyz";

//        string.charAt(random027);
        String employeeId="";
        for (int i = 0; i < 20; i++) {
            int random027=random.nextInt(string.length());
            employeeId+=string.charAt(random027); //1
            if(i==7||i==11||i==15){
                employeeId+="-";
            }

        }


        return employeeId;
    }

    public static void main(String[] args) {
        System.out.println(generateEmployeeId());
    }


/*
    1- Create instance variables for employee firstName, lastName, phoneNumber, email, employeeId, startDate,
    title, department)
    2- Create getter and setter for instance variables
    3- Create the constructor to set the value to the instance variables
    ???4- Create one method to create the employeeId length of 20. This employee id must have letters as well.

       */


//    public Employee createEmployee(String firstName, String lastName, String email, String employeeId, String startDate, String title, String department){
//        Employee emp= new Employee("Larisa","Karpchuk","larisa111@gmail.com","06/01/2021","Scrum master","QA",
//                "")
//    /*
//    this method need to return Employee according to the parameter
//    call the constructor inside this method.
//     */
//        return null;
//    }

//    public String generateEmployeeId(){
//
//        /*
//        this method needs to return the employeeId Length of 20 which includes numbers as well.
//        EmployeeId structure must be length of 20 UUID
//        Example: 61c49c2e-7dcd-11ea-bc55
//         */
//        return "";
    //}
}
