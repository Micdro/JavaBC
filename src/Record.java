public class Record {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch(i){
                case 1 -> "Mary";
                case 2 -> "Alexis";
                case 3 -> "Michael";
                case 4 -> "Alice";
                case 5 -> "Amelia";
                default -> "Anonymous";
                    },
                    "02/22/1990",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S9232006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S9232007", "Bill", "05/11/1986", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);
        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 839");
        //recordStudent.classList(recordStudent.classList() + ", Java OCP Exam 829");
        System.out.println(pojoStudent.getName()+ " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name()+ " is taking " + recordStudent.classList());
    }
}
