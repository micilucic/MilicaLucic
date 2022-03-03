public class Noten {
    public static void main(String[] args) {

        System.out.println(getGradeText(1));
        System.out.println(getGradeText(2));
        System.out.println(getGradeText(3));
        System.out.println(getGradeText(4));
        System.out.println(getGradeText(5));
    }

    public static String getGradeText(int grade) {
        String gradeText;
        return switch (grade) {
            case 1 -> gradeText = "Outstanding";
            case 2 -> gradeText = "Excellent";
            case 3 -> gradeText = "Acceptable";
            case 4 -> gradeText = "Passing";
            case 5 -> gradeText = "Fail";
            default -> gradeText = null;
        };


    }
}
