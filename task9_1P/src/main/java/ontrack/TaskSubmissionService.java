package ontrack;

public class TaskSubmissionService {

    public String submitTask(String studentId, String taskId, String submissionText,
                             boolean isLate, String[] uploadedFiles,
                             int requiredFileCount, String[] allowedFileTypes) {

        if (studentId == null || studentId.trim().isEmpty()) {
            return "Invalid student ID";
        }

        if (taskId == null || taskId.trim().isEmpty()) {
            return "Invalid task ID";
        }

        if (submissionText == null || submissionText.trim().isEmpty()) {
            return "Submission cannot be empty";
        }

        if (uploadedFiles == null || uploadedFiles.length != requiredFileCount) {
            return "Incorrect number of files";
        }

        for (String file : uploadedFiles) {
            if (!isValidFileType(file, allowedFileTypes)) {
                return "Invalid file type";
            }
        }
        
        if (isLate) {
            return "Late submission";
        }

        return "Submission accepted";
    }

    private boolean isValidFileType(String fileName, String[] allowedFileTypes) {
        if (fileName == null || !fileName.contains(".")) {
            return false;
        }

        String extension = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();

        for (String type : allowedFileTypes) {
            if (extension.equals(type.toLowerCase())) {
                return true;
            }
        }

        return false;
    }
}