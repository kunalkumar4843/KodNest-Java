public class ProgressReport {
    public static void main(String[] args) {
        int completedTopics = 17;
        int totalTopics = 20;
        int dailyLearningHours = 3;
        int learningDays = 5;

        double progressPercentage = (double) completedTopics * 100 / totalTopics;

        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Remaining Topics:" + (totalTopics - completedTopics));
        System.out.println("Weekly Learning Hours: " + (dailyLearningHours * learningDays));
        System.out.println("Progress Percentage: " + progressPercentage);
    }
}