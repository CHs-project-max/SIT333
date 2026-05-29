package ontrack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaskSubmissionServiceTest {

    TaskSubmissionService service = new TaskSubmissionService();

    String[] validFiles = {"report.pdf","TaskSubmissionService.java","TaskSubmissionServiceTest.java"};

    String[] allowedTypes = {"pdf","java"};

    @Test
    public void testValidSubmissionAccepted() {
        assertEquals("Submission",
                service.submitTask("s123", "9.1P", "My work", false,
                        validFiles, 3, allowedTypes));
    }

    @Test
    public void testLateSubmissionMarkedLate() {
        assertEquals("Late submission",
                service.submitTask("s123", "9.1P", "My work", true,
                        validFiles, 3, allowedTypes));
    }

    @Test
    public void testEmptyStudentIdRejected() {
        assertEquals("Invalid student",
                service.submitTask("", "9.1P", "My work", false,
                        validFiles, 3, allowedTypes));
    }

    @Test
    public void testEmptyTaskIdRejected() {
        assertEquals("Invalid task ID",
                service.submitTask("s123", "", "My work", false,
                        validFiles, 3, allowedTypes));
    }

    @Test
    public void testEmptySubmissionRejected() {
        assertEquals("Submission cannot be empty",
                service.submitTask("s123", "9.1P", "", false,
                        validFiles, 3, allowedTypes));
    }

    @Test
    public void testIncorrectFileCountRejected() {
        String[] missingFile = {
                "report.pdf",
                "TaskSubmissionService.java"
        };

        assertEquals("Incorrect number of files",
                service.submitTask("s123", "9.1P", "My work", false,
                        missingFile, 3, allowedTypes));
    }

    @Test
    public void testInvalidFileTypeRejected() {
        String[] invalidFiles = {"report.pdf","TaskSubmissionService.java","screenshot.png"};

        assertEquals("Invalid file type",
                service.submitTask("s123", "9.1P", "My work", false,
                        invalidFiles, 3, allowedTypes));
    }
}