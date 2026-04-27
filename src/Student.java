public class Student {

    private String name;
    private int age;
    private double gpa;

    public void setName(String name)

    {

        if(name == null || name.isEmpty()){
            this.name = "invalid";
        }

        else{
            this.name = name;
        }

    }

    public void setAge(int age)

    {

        if(age <= 100 && age >= 16){
            this.age = age;
        }

        else{
            System.out.println("Invalid Age");
        }
    }

    public void setGpa(double gpa)
    {
        if(gpa >= 0.0 && gpa <= 4.0){
            this.gpa = gpa;
        }

        else{
            this.gpa = 0.0;
        }
    }

    public  String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public double getGpa()
    {
        return this.gpa;
    }

    public void printDetails()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("GPA: " + this.gpa);
    }
}
