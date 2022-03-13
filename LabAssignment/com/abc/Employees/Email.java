package week2.LabAssignment.com.abc.Employees;

public class Email {

    private String email ="fNamelName@hr.abc.com";


     public Email(String fName, String lName, int aDept) throws Exception {
        Employee employee = new Employee( fName,  lName,  aDept);
        email = this.createEmailID(employee);
    }

      public Email(Employee emp) {
          email = this.createEmailID(emp);
      }


    /**
     * getter method for email
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**setter method for email
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /***
     * for Harshit Choudary , Email ID should be of the format::harshitchoudary@tech.abc.com
     * @param emp
     * @return
     */
    public String createEmailID(Employee emp) {
        String emailID="";

        emailID=emp.getFirstName()+emp.getLastName()+"@"+emp.getDept()+".abc.com";
        return emailID;
    }
}
