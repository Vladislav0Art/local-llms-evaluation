package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String[] commentLines = new String[]{"line1", "line2"};
        commentsConfiguration.setComment(path, commentLines);
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.containsKey(path));
        assertEquals(Arrays.asList(commentLines), comments.get(path));
    }

    @Test
    public void setCommentNullPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] commentLines = new String[]{"line1", "line2"};
        commentsConfiguration.setComment(null, commentLines);
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(0, comments.size());
    }

    @Test
    public void setCommentNullCommentLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        commentsConfiguration.setComment(path, null);
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(0, comments.size());
    }

}