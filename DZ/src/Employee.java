public class Employee {
    private String personalName;
    private String ocupation;
    private String eMail;
    private long phoneNumber;
    private int salary;
    private int age;

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee () {};

    public Employee (String personalName, String ocupation, String eMail, long phoneNumber, int salary, int age) {

    }

    public void showInfo () {
        System.out.println(String.format("Employee info: [%s][%s][%s][%s][%s][%s]", personalName, ocupation, eMail, phoneNumber, salary, age));
    }


    @Override
    public String toString() {
        return "Employee{" +
                "personalName='" + personalName + '\'' +
                ", ocupation='" + ocupation + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}


