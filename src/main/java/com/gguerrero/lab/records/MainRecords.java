package com.gguerrero.lab.records;

public class MainRecords {

    public static void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord("Guillermo", "GGB1234");
        EmployeeRecord employeeRecord2 = new EmployeeRecord("Guillermo", "GGB1235");

        System.out.println(employeeRecord.hashCode());
        System.out.println(employeeRecord2.hashCode());

        System.out.println(employeeRecord.equals(employeeRecord2));

        Employee employee = new Employee("Guillermo", "GGB1235");
        System.out.println(employee.hashCode());


    }
}
