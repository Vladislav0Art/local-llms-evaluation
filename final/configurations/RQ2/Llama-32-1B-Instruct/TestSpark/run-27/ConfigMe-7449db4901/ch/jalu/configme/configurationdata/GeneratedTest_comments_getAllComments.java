package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTest_comments_getAllComments {

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void test_comments_getAllComments() {
        List<String> commentLines1 = Collections.singletonList("");
        List<String> commentLines2 = Arrays.asList("Line 1", "Line 2");
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", commentLines1);
        comments.put("anotherPath", commentLines2);

        Map<String, List<String>> result = commentsConfiguration.getAllComments();
        assertEquals(commentLines1, result.get("path"));
        assertEquals(commentLines2, result.get("anotherPath"));
    }

}