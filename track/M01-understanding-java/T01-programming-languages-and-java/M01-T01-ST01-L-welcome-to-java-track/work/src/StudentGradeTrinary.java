public class StudentGradeTrinary {
    public static void main(String[] args) {
        int marks = 85;

        String grade = (marks >= 90) ? "A Grade" : (marks >= 75) ? "B Grade" : "C Grade";
        System.out.println(grade);
    }
}
