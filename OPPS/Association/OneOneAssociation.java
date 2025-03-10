public class OneOneAssociation{
    public static void main(String[] args) {
        System.out.println("Hello");
        Address address = new Address(18, "Gorakhpur ", "India");
        Employee emp  = new Employee(45, "Saving", "Awadh", address);
        emp.details();
    }
}

class Employee {
    private int empID;
    private String accType;
    private String accName;
    private Address add;

    // Constructor 
    public Employee(int empID,String accType, String accName,Address add){
        this.empID=empID;
        this.accType = accType;
        this.accName = accName;
        this.add = add;

    }



    public void details(){
        System.out.println("Print the details :: ");
        System.out.println("Emp ID :: "+empID);
        System.out.println("Account Type :: "+accType);
        System.out.println("Account Name :: "+accName);
        System.out.println("Printing the Address Details :: ");
        add.getStreetNum();
        add.getCity();
        add.getCountry();


    }

    
} 

class  Address {
    private int streetNum;
    private String city;
    private String country;

    public Address(int streetNum,String city, String country){
        this.streetNum = streetNum;
        this.city = city;
        this.country = country;
    }
    
    public void getStreetNum(){
        System.out.println("Street Num :: "+streetNum );
    }
    public void getCity(){
        System.out.println("City :: "+city);
    }
    public void getCountry(){
        System.out.println("Country :: "+country);
    }



    
    
}