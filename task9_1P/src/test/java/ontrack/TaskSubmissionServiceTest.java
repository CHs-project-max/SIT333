package ontrack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TaskSubmissionServiceTest {

    TaskSubmissionService service = new TaskSubmissionService();

    String[] validFiles = {"report.pdf","TaskSubmissionService.java","TaskSubmissionServiceTest.java"};

    String[] allowedTypes = {"pdf","java"};

    @Test
    public void testValidSubmissionAccepted() {
        assertEquals("Submission accepted",
                service.submitTask());
    }}
}