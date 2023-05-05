package homeWork;


/*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
 */
public class Students {

    private static int numberOfStudents=0;
    private String Name;
    private int ID;

    public Students(String studentName, int studentID){
        this.Name = studentName;
        this.ID=studentID;
        numberOfStudents++;
    }

    public static void main(String[] args) {
        Students student1 = new Students("John", 1);
        Students student2 = new Students("Alisa", 2);
        Students student3 = new Students("Tom", 3);

        System.out.println("Total number of students:" + numberOfStudents);
    }


}
