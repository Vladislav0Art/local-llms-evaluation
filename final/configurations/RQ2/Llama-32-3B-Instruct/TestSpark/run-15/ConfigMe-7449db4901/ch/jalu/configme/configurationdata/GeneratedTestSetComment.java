package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSetComment {

    @Test
    public void testSetComment() {
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Collections.emptyList());
        expectedComments.put("path2", Collections.singletonList(""));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> actualComments = commentsConfiguration.setComment("path1", "commentLines");

        assertEquals(expectedComments, actualComments);
    }

}