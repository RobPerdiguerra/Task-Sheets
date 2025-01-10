public class TaskSheet122 {
    static class Student {
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

    public static void main(String[] args) {
        Student studentName = new Student("Angel", "Salangsang");

        studentName.printfullName();

    }

}
