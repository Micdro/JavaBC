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
    }
}
