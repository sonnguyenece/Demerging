import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) {
//        MyGenericQueue<String> myQueue = new MyGenericQueue();
        Student[] studentList = new Student[100];
        Student[] student = init(studentList);
        MyGenericQueue<Object> femaleList = new MyGenericQueue();
        MyGenericQueue<Object> maleList = new MyGenericQueue();

        for (int i = 0; i < 10; i++) {
            if (student[i].isGender()) maleList.push(student[i]);
            else femaleList.push(student[i]);
        }
        while (femaleList.size() > 0) {
            Student female = new Student();
            female =(Student) femaleList.pop();
            System.out.print(female.getGender() + " "+female.getBirth()+"\n");
        }
        while (maleList.size() > 0) {
            Student male = new Student();
            male =(Student) maleList.pop();
            System.out.print(male.getGender() + " "+male.getBirth()+"\n");
        }
    }

    private static Student[] init(Student[] studentList) {

        studentList[0] = new Student(false, "1994");
        studentList[1] = new Student(true, "1995");
        studentList[2] = new Student(false, "1996");
        studentList[3] = new Student(true, "1997");
        studentList[4] = new Student(false, "1998");
        studentList[5] = new Student(true, "1999");
        studentList[6] = new Student(true, "2000");
        studentList[7] = new Student(false, "2001");
        studentList[8] = new Student(false, "2002");
        studentList[9] = new Student(false, "2003");

        for (int i = 0; i < 10; i++) {
            System.out.print(studentList[i].getBirth() + " ");
            if (studentList[i].isGender()) System.out.print("male\n");
            else System.out.print("female\n");
        }
        return studentList;
    }


}
