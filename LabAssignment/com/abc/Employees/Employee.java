
package week2.LabAssignment.com.abc.Employees;

public class Employee {
    private String firstName = "";
    private String lastName = "";
    private String dept ;
    private String email ;
    private String password ;


    public Employee() {

    }

    /**
     * Constructor
     */
    public Employee(String fName, String lName){
         firstName=fName;
         lastName=lName;
     }

    /**
     * Constructor
     */
     public Employee (String fName, String lName, int aDept) throws Exception {
         firstName=fName;
         lastName=lName;
         this.setDept(aDept);
         dept=this.getDept();
    }


    /**
     * getter method for First Name
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setter method for first name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     * getter method for First Name
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setter method for First Name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * getter method for Department
     * @return returns department of the employee
     */
    public String getDept() {
        return dept;
    }

    /**
     * setter method for department
     *  * Department
     *  * 1-> Technical
     *  * 2-> Admin
     *  * 3-> Human Resources
     *  * 4-> Legal
     * @param dept
     */
    public void setDept(int dept) throws Exception {
        switch(dept){
            case 1:  this.dept = "tech";
                    break;
            case 2: this.dept ="adm";
                    break;
            case 3: this.dept ="hr";
                    break;
            case 4: this.dept ="lgl";
                    break;
            default: {
                System.err.println("Invalid dept number!");
                throw new Exception("Dept Number is Invalid");
            }

        }

    }

    /**
     * getter method for Email
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * setter method for email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getter method for Password
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * setter method for password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
