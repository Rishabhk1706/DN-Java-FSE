package Week1.DataStructuresAndAlgorithms.EmployeeManagementSystem;

public class EmployeeManagement {

    Employee[] employees;
    int size;

    EmployeeManagement(int capacity){
        employees = new Employee[capacity];
        size = 0;
    }

    // Add Employee
    void addEmployee(Employee emp){
        if(size == employees.length){
            System.out.println("Employee array is full.");
            return;
        }
        employees[size] = emp;
        size++;
    }

    // Search Employee by ID
    Employee searchEmployee(int id){
        for(int i=0;i<size;i++){
            if(employees[i].employeeId == id){
                return employees[i];
            }
        }
        return null;
    }

    // Traverse Employees
    void displayEmployees(){
        if(size==0){
            System.out.println("No Employees Found.");
            return;
        }

        for(int i=0;i<size;i++){
            employees[i].display();
        }
    }

    // Delete Employee
    void deleteEmployee(int id){
        int ind = -1;
        for(int i=0;i<size;i++){
            if(employees[i].employeeId == id){
                ind = i;
                break;
            }
        }

        if(ind==-1){
            System.out.println("Employee not found.");
            return;
        }

        for(int i=ind;i<size-1;i++){
            employees[i] = employees[i+1];
        }

        employees[size-1] = null;
        size--;

        System.out.println("Employee deleted successfully.");
    }

    public static void main(String[] args) {

        EmployeeManagement system = new EmployeeManagement(5);

        system.addEmployee(new Employee(101, "Rishabh", "Developer", 70000));
        system.addEmployee(new Employee(102, "Amit", "Tester", 50000));
        system.addEmployee(new Employee(103, "Rahul", "Manager", 90000));

        System.out.println("Employee List:");
        system.displayEmployees();

        System.out.println("\nSearching Employee 102:");
        Employee emp = system.searchEmployee(102);

        if(emp != null)
            emp.display();
        else
            System.out.println("Employee Not Found.");

        System.out.println("\nDeleting Employee 102:");
        system.deleteEmployee(102);

        System.out.println("\nUpdated Employee List:");
        system.displayEmployees();
    }
}