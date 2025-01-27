package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testSetComment() {
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Collections.emptyList());
        expectedComments.put("path2", Collections.singletonList(""));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> actualComments = commentsConfiguration.setComment("path1", "commentLines");

        assertEquals(expectedComments, actualComments);
    }

    @Test
    public void testSetMultipleComment() {
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Collections.emptyList());
        expectedComments.put("path2", Collections.singletonList(""));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> actualComments = commentsConfiguration.setComment("path3", "commentLines");

        assertEquals(expectedComments, actualComments);
    }
}

class CommentsConfiguration {

    private Map<String, List<String>> comments = new HashMap<>();

    public Map<String, List<String>> setComment(String path, List<String> commentLines) {
        comments.put(path, commentLines);
        return comments;
    }

}