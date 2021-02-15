import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HRDepartment {


    private String location;
    private String companyName;
    private ArrayList<Employee> allEmployees;

    public HRDepartment(String location, String companyName){
        this.location=location;
        this.companyName=companyName;
        this.allEmployees=new ArrayList<Employee>();
    }

    public boolean addEmployee(Employee employee){
        String departmentName = employee.getDepartment();

        if(allEmployees.contains(employee)){
            return false;
        }if (countOfEmployeeInDepartment(departmentName)>=5){
            return false;
        }
        return allEmployees.add(employee);
        /*
        This method will take the parameter as a Employee object and
        if the Employee is not added to the list before it will add to the arraylist.
        To be able to understand employee is registered or not you need to check employeeId.
        Because employee id is unique value.
        Also, This company can hold up to 30 employee.
        NOTE: The company has 6 department and in each department can have max 5 employee.
dpt name--> as a parm, i will cand
         */
    }
    public int countOfEmployeeInDepartment(String departmentName){
        int count =0;
        for (int i = 0; i <allEmployees.size() ; i++) {
            if (allEmployees.get(i).getDepartment().equalsIgnoreCase(departmentName)){
                count++;
            }
        }
        return count;
    }

    public void printEmailAddress(String departmentName){
        for (int i = 0; i <allEmployees.size() ; i++) {
            if(allEmployees.get(i).getDepartment().equalsIgnoreCase(departmentName))
            System.out.println(allEmployees.get(i).getEmail());

        }

        /*
        this method is taking one parameter department name and it will print all the email address.
         which is available in this list related with department id
         */
    }

    public boolean updateEmailAddress(String employeeId, String newEmailAddress){
//        for (Employee employee:allEmployees) {
//            if(employee.getEmployeeId().equalsIgnoreCase(employeeId)){
//                employee.setEmployeeId(newEmailAddress);
//            }
//        }
        for (int i = 0; i <allEmployees.size() ; i++) {
            if(allEmployees.get(i).getEmployeeId().equalsIgnoreCase(employeeId)){
                allEmployees.get(i).setEmail(newEmailAddress);
            }


        }

        /*
        This method is taking parameter as employeeId and email address.
        According to the employeeId, you will update the old email address with new email.
        if it is updated this method will return true else return false
         */
        return false;
    }


        public boolean updatePhonenumber(String employeeId, Integer newPhoneNumber){

            for (int i = 0; i <allEmployees.size() ; i++) {
                if(allEmployees.get(i).getEmployeeId().equalsIgnoreCase(employeeId)){
                    allEmployees.get(i).setPhoneNumber(newPhoneNumber);
                }


            }
            return false;
        }
        public boolean updateTitle(String emailAddress,String newTitle){
            for (int i = 0; i < allEmployees.size(); i++) {
                if(allEmployees.get(i).getEmail().equalsIgnoreCase(emailAddress)){
                    allEmployees.get(i).setTitle(newTitle);
                }
            }
            return  false;
        }
        public void information (String employeeId){

        }

        public boolean remove(String employeeId){
            for (int i = 0; i <allEmployees.size() ; i++) {
               if(allEmployees.get(i).getEmployeeId().equalsIgnoreCase(employeeId))
                   allEmployees.remove(i);
            }
            return false;
        }
        public void printAll(){
            for (int i = 0; i < allEmployees.size(); i++) {
                    System.out.println(allEmployees.get(i).getDepartment()+allEmployees.get(i).getEmployeeId());


            }

        }

    /*
    REST OF THE METHODS
       // 1- Create the method will take parameter as employeeId and new phone number, it will update old phone number with new phone number.
        //2- Create the method will take parameter as emailAddress and newTitle, it will update old title with new title.
        3- Create the method will take one parameter as a employeeId and it will print all other information of employee like
        name, email, phone, title, department etc.
       ???? 4- Create the method will take one parameter as a employeeId and it will remove the employee from the list.
        5- Create the method will take no parameter and it will print all the department names with employee numbers
        The Company has 6 different department Finance, Marketing, IT, HR, Purchasing and Sales department.
        For example:
        Finance department - 5 employee
        Marketing department - 5 employee
        IT department - 5 employee
        ...
        .
        */
}
