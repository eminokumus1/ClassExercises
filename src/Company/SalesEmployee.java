package Company;

import java.util.ArrayList;
import java.util.Calendar;

public class SalesEmployee extends RegularEmployee {
    private ArrayList<Product> sales = new ArrayList<>();
    private int numberOfSalesEmployees;

    public SalesEmployee(int id, String firstName, String lastName, String gender, Calendar birthDate,
                         String maritalStatus, String hasDriverLicense, double salary, Calendar hireDate,
                         Department department, double performanceScore, ArrayList<Product> sales) {
        super(id, firstName, lastName, gender, birthDate, maritalStatus, hasDriverLicense, salary,
                hireDate, department, performanceScore);
        this.sales = sales;
        numberOfSalesEmployees++;
    }

    public SalesEmployee(RegularEmployee re, ArrayList<Product> sales) {
        super(re.getId(), re.getFirstName(), re.getLastName(), re.getGender(), re.getBirthDate(),
                re.getMaritalStatus(), re.getHasDriverLicence(), re.getSalary(), re.getHireDate(),
                re.getDepartment(), re.getPerformanceScore());
        this.sales = sales;
        numberOfSalesEmployees++;
    }

    public boolean addSale(Product s) {
        return !sales.contains(s);
    }

    public boolean removeSale(Product s) {
        return sales.contains(s);
    }

    public ArrayList<Product> getSales() {
        return sales;
    }

    public void setSales(ArrayList<Product> sales) {
        this.sales = sales;
    }

    public int getNumberOfSalesEmployees() {
        return numberOfSalesEmployees;
    }

    public void setNumberOfSalesEmployees(int numberOfSalesEmployees) {
        this.numberOfSalesEmployees = numberOfSalesEmployees;
    }

    @Override
    public String toString() {
        String salesInfo = "[";
        for (Product product: sales){
            salesInfo += product.toString()+", ";
        }
        salesInfo += "]";
        return super.toString() +
                "\n" +
                salesInfo +
                '}';
    }
}
