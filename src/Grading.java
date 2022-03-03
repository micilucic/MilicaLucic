public class Grading {
    public static void main(String[] args) {

        int points = 100;

        System.out.println(getGrade(points));
    }

    public static String getGrade(int points) {
        String grade;
        if (points >= 90) {
            grade = "outstanding";
        } else if (points >= 78) {
            grade = "excellent";
        } else if (points >= 65) {
            grade = "acceptable";
        } else if (points >= 51) {
            grade = "passing";
        } else {
            grade = "fail";
        }
        return grade;
    }
}

