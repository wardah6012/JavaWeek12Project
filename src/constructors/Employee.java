package constructors;




        public class Employee {

            public String names, jobTitle;
            public int id;
            public double salary;
            public static String companyName;

            static {
                companyName = "Microsoft";
            }

            public Employee() {
            }

    public Employee(String n, String jobTitle, int id, double salary) {
        names = n;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }



}
