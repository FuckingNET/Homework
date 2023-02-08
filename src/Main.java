public class Main {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("test", 1, 200);
        employees[1] = new Employee("test1", 1, 200);
        employees[2] = new Employee("test2", 4, 600);
        employees[3] = new Employee("test3", 3, 100);
        employees[4] = new Employee("test4", 5, 700);
        employeeList();
        sumSalary();
        allFullName();
        minSalary();
        maxSalary();
        avgSalary();

    }

    public static void employeeList() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    public static void sumSalary() {
        int sum = 0;
        for (Employee e : employees) {
            if (e != null) {
                sum += e.getSalary();
            }
        }
        System.out.println(sum);
    }

    public static void minSalary() {
        int minSalary = Integer.MAX_VALUE;
        Employee employeeMinSalary = null;
        for (Employee e : employees) {
            if (e != null) {
                if (e.getSalary() < minSalary) {
                    minSalary = e.getSalary();
                    employeeMinSalary = e;
                }
            }
        }
        System.out.println(employeeMinSalary);
    }

    public static void maxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        Employee employeeMaxSalary = null;
        for (Employee e : employees) {
            if (e != null) {
                if (e.getSalary() > maxSalary) {
                    maxSalary = e.getSalary();
                    employeeMaxSalary = e;
                }
            }
        }
        System.out.println(employeeMaxSalary);
    }

    public static void avgSalary() {
        double sum = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e != null) {
                sum += e.getSalary();
                count++;
            }
        }
        System.out.println(sum/count);
    }

    public static void allFullName() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e.getFullName());
            }
        }
    }
}