package ontrack;

public class TaskSubmissionService {

    public String submitTask(String studentId, String taskId, String submissionText, boolean isLate) {

        if (studentId == null || studentId.trim().isEmpty()) {
            return "Invalid student ID";
        }

        if (taskId == null || taskId.trim().isEmpty()) {
            return "Invalid task ID";
        }

        if (submissionText == null || submissionText.trim().isEmpty()) {
            return "Submission cannot be empty";
        }

        if (isLate) {
            return "Late submission rejected";
        }

        return "Submission accepted";
    }
}