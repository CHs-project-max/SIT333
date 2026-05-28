package ontrack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TaskSubmissionServiceTest {

    TaskSubmissionService service = new TaskSubmissionService();

    @Test
    public void testValidSubmissionAccepted() {
        assertEquals("Submission accepted",
                service.submitTask("s123", "9.1P", "My work", false));
    }

    @Test
    public void testEmptyStudentIdRejected() {
        assertEquals("Invalid student ID",
                service.submitTask("", "9.1P", "My work", false));
    }

    @Test
    public void testEmptyTaskIdRejected() {
        assertEquals("Invalid task ID",
                service.submitTask("s123", "", "My work", false));
    }

    @Test
    public void testEmptySubmissionRejected() {
        assertEquals("Submission cannot be empty",
                service.submitTask("s123", "9.1P", "", false));
    }

    @Test
    public void testLateSubmissionRejected() {
        assertEquals("Late submission rejected",
                service.submitTask("s123", "9.1P", "My work", true));
    }
}