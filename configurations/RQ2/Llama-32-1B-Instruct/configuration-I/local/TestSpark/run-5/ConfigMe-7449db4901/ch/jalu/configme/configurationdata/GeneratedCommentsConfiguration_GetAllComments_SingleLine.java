package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import io.mockk.mockk;
import org.junit.jupiter.api.Test;

public class GeneratedCommentsConfiguration_GetAllComments_SingleLine {

    @Test
    public void CommentsConfiguration_GetAllComments_SingleLine() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("", "line1");
        // No mocking needed here
        Map<String, List<String>> expectedCommentsMap = new java.util.HashMap<>();
        expectedCommentsMap.put("path", Collections.singletonList("line1"));
        assertEquals(expectedCommentsMap, commentsConfig.getAllComments());
    }

}