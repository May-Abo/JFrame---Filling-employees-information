package com.pioneer.employee;

public class Employee {
    
    private String fname;
    private String lname;
    private double salary;
    private String phone;
    private String email;
    private String address;
    private String major;
    private String department;
    private int gender;
    private int status;
    private String nation;
    private int noofexpyear;
    private String title;
    private String age;
    private String ssn;
    private String type;
    private static String compnayName = "Pioneer";
    
    public Employee() {
    }
    
    public Employee(String fname, String lname, double salary, String phone, String email, String address, String major, String department, int gender, int status, String nation, int noofexpyear, String title, String age, String ssn) {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.major = major;
        this.department = department;
        this.gender = gender;
        this.status = status;
        this.nation = nation;
        this.noofexpyear = noofexpyear;
        this.title = title;
        this.age = age;
        this.ssn = ssn;
        this.type = type;
    }
    
    public String getFname() {
        return fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    
    public String getLname() {
        return lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public int getGender() {
        return gender;
    }
    
    public void setGender(int gender) {
        this.gender = gender;
    }
    
    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getNation() {
        return nation;
    }
    
    public void setNation(String nation) {
        this.nation = nation;
    }
    
    public int getNoofexpyear() {
        return noofexpyear;
    }
    
    public void setNoofexpyear(int noofexpyear) {
        this.noofexpyear = noofexpyear;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAge() {
        return age;
    }
    
    public void setAge(String age) {
        this.age = age;
    }
    
    public String getSsn() {
        return ssn;
    }
    
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    public String getType() {
        if (salary >= 1000) {
            this.type = "N";
        } else {
            this.type = "C";
        }
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void printInformation(Employee employee) {
        if ("N".equals(employee.getType())) {
            double yearlySalaryD = 12 * employee.getSalary();
            System.out.println("Company name: " + compnayName);
            System.out.println("First name: " + employee.getFname());
            System.out.println("Last name: " + employee.getLname());
            System.out.println("Title: " + employee.getTitle());
            System.out.println("Major: " + employee.getMajor());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Years of Experience: " + employee.getNoofexpyear());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Address: " + employee.getAddress());
            System.out.println("Phone Number: " + employee.getPhone());
            System.out.println("Email: " + employee.getEmail());
            System.out.println("Gender: " + employee.genderDeclaration(employee));
            System.out.println("Status: " + employee.statusDeclaration(employee));
            System.out.println("Nationality: " + employee.getNation());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Type: " + employee.getType());
            System.out.println("Yearly Salary: " + yearlySalaryD);            
        } else {
            double yearlySalaryC = (12 * employee.getSalary()) + (employee.getSalary() / 2);
            System.out.println("\nThe Emplyee " + employee.getFname() + " " + employee.getLname() + " " + "is C Type \n Can't show his information");
        }
    }
    
    public String genderDeclaration(Employee employee) {
        if (gender == 1) {
            return "Male";
        } else {
            return "Female";
        }
    }
    
    public String statusDeclaration(Employee employee) {
        if (status == 1) {
            return "Married";
        } else {
            return "Single";
        }
    } 
}
