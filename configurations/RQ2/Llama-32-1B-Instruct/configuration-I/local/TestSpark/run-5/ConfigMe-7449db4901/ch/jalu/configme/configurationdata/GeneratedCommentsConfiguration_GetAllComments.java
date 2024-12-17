package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import io.mockk.mockk;
import org.junit.jupiter.api.Test;

public class GeneratedCommentsConfiguration_GetAllComments {

    @Test
    public void CommentsConfiguration_GetAllComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("", "line1\nline2");
        // No mocking needed here
        Map<String, List<String>> expectedCommentsMap = new java.util.HashMap<>();
        expectedCommentsMap.put("path", Arrays.asList("line1", "line2"));
        assertEquals(expectedCommentsMap, commentsConfig.getAllComments());
    }

}