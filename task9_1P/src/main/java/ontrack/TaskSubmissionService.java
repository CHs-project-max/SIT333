package ontrack;

public class TaskSubmissionService {

    public String submitTask(String studentId, String taskId, String submissionText,
                             boolean isLate, String[] uploadedFiles,
                             int requiredFileCount, String[] allowedFileTypes) {

        if (studentId == null || studentId.trim().isEmpty()) {
            return "Invalid student ID";
        }
 
        if (isLate) {
            return "Late submission";
        }

        return "Submission accepted";
    }
}