package TaskSheets;


    class Student {
        private String firstName;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
        private String lastName;

        public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public void printfullName(){
            System.out.println(firstName+" "+lastName);
        }
    }
public class TaskSheet122 {
        public static void main(String[] args) {
            Student[] students = new Student[] {
                    new Student("Morgan", "Freeman"),
                    new Student("Brad", "Pitt"),
                    new Student("Kevin", "Spacey"),
            };
            for (Student s : students) {
                s.printfullName();
            }
}
}
