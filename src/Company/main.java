package Company;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class main {
    public static void main(String[] args) {
        ArrayList<Department> departments = new ArrayList<>();
        ArrayList<Project> projects = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<RegularEmployee> regularEmployees = new ArrayList<>();
        ArrayList<Manager> managers = new ArrayList<>();
        ArrayList<Developer> developers = new ArrayList<>();
        ArrayList<SalesEmployee> salesEmployees = new ArrayList<>();

        File file = new File("D:\\emino\\WorkSpace\\Java\\Company Exercise\\CSE1242_spring2022_homework_1_input.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] splitLine = line.split(" ");
                if (Objects.equals(splitLine[0], "Department")){
                    departments.add(new Department(Integer.parseInt(splitLine[1]), splitLine[2]));
                }else if (Objects.equals(splitLine[0], "Project")){
                    projects.add(new Project(splitLine[1], stringToCalendar(splitLine[2]), splitLine[3]));
                }else if (Objects.equals(splitLine[0], "Product")){
                    products.add(new Product(splitLine[1],stringToCalendar(splitLine[2]), Double.parseDouble(splitLine[3])));
                }else if (Objects.equals(splitLine[0], "Person")){
                    people.add(new Person(Integer.parseInt(splitLine[3]), splitLine[1], splitLine[2], splitLine[4],
                            stringToCalendar(splitLine[5]), splitLine[6], splitLine[7]));
                }else if (Objects.equals(splitLine[0], "Customer")){
                    int customerId = Integer.parseInt(splitLine[1]);
                    customers.add(new Customer(Objects.requireNonNull(findCustomerPerson(people, customerId)),
                            findCustomerProduct(products, splitLine) ));
                    people.remove(findCustomerPerson(people, customerId));
                }else if (Objects.equals(splitLine[0], "Employee")){
                    employees.add(new Employee(findEmployeePerson(people, splitLine), Double.parseDouble(splitLine[2]),
                           stringToCalendar(splitLine[3]), findEmployeeDepartment(departments, splitLine) ));
                    people.remove(findEmployeePerson(people, splitLine));
                }else if (Objects.equals(splitLine[0], "RegularEmployee")){
                    regularEmployees.add(new RegularEmployee(findRegularEmployeesEmployee(employees,splitLine),
                            Double.parseDouble(splitLine[2])));
                    people.remove(findRegularEmployeesEmployee(employees,splitLine));
                }else if (Objects.equals(splitLine[0], "Manager")){
                    managers.add(new Manager(findManagerEmployee(employees,splitLine), Double.parseDouble(splitLine[2])));
                    people.remove(findManagerEmployee(employees,splitLine));
                }else if (Objects.equals(splitLine[0], "Developer")){
                    developers.add(new Developer(findDeveloperRegularEmployee(regularEmployees, splitLine),
                            findDeveloperProjects(projects, splitLine)));
                    people.remove(findDeveloperRegularEmployee(regularEmployees, splitLine));
                }else if (Objects.equals(splitLine[0], "SalesEmployee")){
                    salesEmployees.add(new SalesEmployee(findSalesEmployeeRegularEmployee(regularEmployees,splitLine),
                            findSalesEmployeeSales(products,splitLine)));
                    people.remove(findSalesEmployeeRegularEmployee(regularEmployees,splitLine));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        Manager manager1 = null;
//        Manager manager2 = null;
//        for (Manager manager: managers){
//            if (manager.getId() == 123){
//                manager1 = manager;
//
//            } else if(manager.getId() == 256){
//                manager2 = manager;
//            }
//        }
//        Yukarıdaki şekilde mi daha mantıklı yoksa aşağıdaki şekilde mi?

//        int firstManagerIndex =0;
//        int secondManagerIndex =0;
//        for (Manager manager: managers){
//            if (manager.getId() == 123){
//                firstManagerIndex = managers.indexOf(manager);
//
//            } else if(manager.getId() == 256){
//                secondManagerIndex = managers.indexOf(manager);
//            }
//        }
        for (RegularEmployee re:regularEmployees){
            if (re.getId() == 111){
                managers.get(0).addEmployee(re);
            } else if (re.getId() == 167){
                managers.get(0).addEmployee(re);
            } else if (re.getId() == 156){
                managers.get(0).addEmployee(re);
            }else if (re.getId() == 247){
                managers.get(1).addEmployee(re);
            }else if (re.getId() == 213){
                managers.get(1).addEmployee(re);
            }
        }

        System.out.println(departments.get(0));;
        System.out.println("\t" + managers.get(0));;

        //        Aşağıdaki kodda hepsi RegularEmployee olarak düşüyor, developer ve salesemployee kısmına girmiyor.
//        for (RegularEmployee re : managers.get(firstManagerIndex).getRegularEmployees()) {
//            if (developers.contains(re)) {
//                System.out.println("\t\tDeveloper");
//                System.out.println("\t\t"+developers.get(developers.indexOf(re)));
//                System.out.println();
//            } else if (salesEmployees.contains(re)){
//                System.out.println("\t\tSalesEmployee");
//                System.out.println("\t\t"+salesEmployees.get(salesEmployees.indexOf(re)));
//                System.out.println();
//            } else{
//                System.out.println("\t\tRegularEmployee");
//                System.out.println("\t\t"+re);
//                System.out.println();
//            }
//        }
        ArrayList<RegularEmployee> cloneRe = new ArrayList<>(managers.get(0).getRegularEmployees());
        for (RegularEmployee re : managers.get(0).getRegularEmployees()) {
            for (Developer developer : developers) {
                if (developer.getId() == re.getId()) {
                    System.out.println("\t\tDeveloper");
                    System.out.println(developer);
                    System.out.println();
                    cloneRe.remove(re);
                }
            }
            for (SalesEmployee salesEmployee: salesEmployees){
                if (salesEmployee.getId() == re.getId()){
                    System.out.println("\t\tSalesEmployee");
                    System.out.println(salesEmployee);
                    System.out.println();
                    cloneRe.remove(re);
                }
            }
        }
        for (RegularEmployee regularEmployee: cloneRe){
            System.out.println("\t\tRegularEmployee");
            System.out.println(regularEmployee);
        }


        System.out.println();
        System.out.println("**************************************");

        System.out.println(departments.get(1));
        System.out.println(managers.get(1));

//        Aşağıdaki kodda hepsi RegularEmployee olarak düşüyor, developer ve salesemployee kısmına girmiyor.
//        for (RegularEmployee re : managers.get(1).getRegularEmployees()) {
//
//            if (developers.contains(re) ) {
//                System.out.println("Developer");
//                System.out.println(developers.get(developers.indexOf(re)));
//                System.out.println();
//            } else if (salesEmployees.contains(re)){
//                System.out.println("SalesEmployee");
//                System.out.println(salesEmployees.get(salesEmployees.indexOf(re)));;
//                System.out.println();
//            } else if (regularEmployees.contains(re)){
//                System.out.println("RegularEmployee");
//                System.out.println(re);;
//                System.out.println();
//            }
//        }
        cloneRe = new ArrayList<>(managers.get(1).getRegularEmployees());
        for (RegularEmployee re : managers.get(1).getRegularEmployees()) {
            for (Developer developer : developers) {
                if (developer.getId() == re.getId()) {
                    System.out.println("\t\tDeveloper");
                    System.out.println(developer);
                    System.out.println();
                    cloneRe.remove(re);
                }
            }
            for (SalesEmployee salesEmployee: salesEmployees){
                if (salesEmployee.getId() == re.getId()){
                    System.out.println("\t\tSalesEmployee");
                    System.out.println(salesEmployee);
                    System.out.println();
                    cloneRe.remove(re);
                }
            }
        }
        for (RegularEmployee regularEmployee: cloneRe){
            System.out.println("\t\tRegularEmployee");
            System.out.println(regularEmployee);
        }
        System.out.println();
        System.out.println("**************CUSTOMERS*************************");
        System.out.println();

        for (Customer customer: customers){
            System.out.println(customer);
        }
        System.out.println();
        System.out.println("***************PEOPLE***********************");
        System.out.println();

        for (Person person: people){
            System.out.println(person);
//                if (!(person instanceof Customer)&&!(person instanceof Employee)){
//                    System.out.println(person);
//                }

        }

    }
    private static RegularEmployee findSalesEmployeeRegularEmployee(ArrayList<RegularEmployee> regularEmployees, String[] splitLine){
        for (RegularEmployee re: regularEmployees){
            if (re.getId() == Integer.parseInt(splitLine[1])){
                return re;
            }
        }
        return null;
    }
    private static ArrayList<Product> findSalesEmployeeSales(ArrayList<Product> products, String[] splitLine){
        ArrayList<Product> salesEmployeeSales = new ArrayList<>();
        for (int i = 0; i < splitLine.length ; i++) {
            for (Product product: products){
                if (Objects.equals(product.getProductName(), splitLine[i])){
                    salesEmployeeSales.add(product);
                }
            }
        }
        return salesEmployeeSales;
    }
    private static ArrayList<Project> findDeveloperProjects(ArrayList<Project> projects, String[] splitLine){
        ArrayList<Project> developerProjects = new ArrayList<>();
        for (int i = 0; i < splitLine.length; i++) {
            for (Project project : projects) {
                if (Objects.equals(project.getProjectName(), splitLine[i])){
                    developerProjects.add(project);
                }
            }
        }
        return developerProjects;
    }

    private static RegularEmployee findDeveloperRegularEmployee(ArrayList<RegularEmployee> regularEmployees, String[] splitLine){
        for(RegularEmployee regularEmployee: regularEmployees){
            if (regularEmployee.getId() == Integer.parseInt(splitLine[1])){
                return regularEmployee;
            }
        }
        return null;
    }
    private static Employee findManagerEmployee(ArrayList<Employee> employees, String[] splitLine){
        for(Employee employee: employees){
            if (employee.getId() == Integer.parseInt(splitLine[1])){
                return employee;
            }
        }
        return null;
    }

    private static Employee findRegularEmployeesEmployee(ArrayList<Employee> employees, String[] splitLine){
        for(Employee employee: employees){
            if (employee.getId() == Integer.parseInt(splitLine[1])){
                return employee;
            }
        }
        return null;
    }

    private static Department findEmployeeDepartment(ArrayList<Department> departments, String[] splitLine){
        for(Department department: departments){
            if (department.getDepartmentName() == splitLine[3]){
                return department;
            }
        }
        return null;
    }

    private static Person findEmployeePerson(ArrayList<Person> people, String[] splitLine){
        for(Person person: people){
            if ((person.getId() == Integer.parseInt(splitLine[1]))){
                return person;
            }
        }
        return null;
    }

    private static ArrayList<Product> findCustomerProduct(ArrayList<Product> products, String[] splitLine) {
        ArrayList<Product> customerProducts = new ArrayList<>();
        for (int i = 1; i < splitLine.length ; i++) {
            for(Product product: products){
                if (Objects.equals(product.getProductName(), splitLine[i])){
                    customerProducts.add(product);
                }
            }
        }
        return customerProducts;
    }

    private static Person findCustomerPerson(ArrayList<Person> people, int customerId) {
        for (Person person: people) {
            if(person.getId()==customerId){
                return person;
            }
        }
        return null;

    }

    public static Calendar stringToCalendar(String strDate){
        DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        try {
            Date date = formatter.parse(strDate);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            return cal;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
