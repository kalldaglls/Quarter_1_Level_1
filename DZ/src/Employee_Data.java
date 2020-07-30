public class Employee_Data {
    public static void main(String[] args) {
        Employee [] employee = new Employee[5];
        employee [0] = new Employee("Thomas Jefferson", "Revolutioner" ,"tommyboss@gmail.us", 74953331, 1000, 57);
        employee [1] = new Employee("Gretta Tundberg", "Activist" ,"grettathesavior@gmail.sw", 749925978, 0, 16);
        employee [2] = new Employee("Svetlana Loboda", "Spivachka" ,"ilovetill@mail.ru", 749944484, 5000, 40);
        employee [3] = new Employee("Ilon Mask", "Developer" ,"roskosmossucks@teslaboy.ru", 749944484, 2335544, 50);
        employee [4] = new Employee("Pavel Dyrov", "God" ,"XXXXXX@XXXXX.su", 512, -1000000, 315);
        System.out.println(employee[0].toString());
        employee[1].showInfo();
        employee[2].showInfo();
        employee[3].showInfo();
        employee[4].showInfo();
    }
    public void showOldAged (Employee[] employee) {
        for (int i = 0; i < 4; i++) {
            if ()
        }
    }
}
