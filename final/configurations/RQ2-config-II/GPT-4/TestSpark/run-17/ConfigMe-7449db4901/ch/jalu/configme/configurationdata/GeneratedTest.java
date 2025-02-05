package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("myPath", "comment1", "comment2", "comment3");
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        List<String> commentLines = comments.get("myPath");

        assertEquals(3, commentLines.size());
        assertEquals("comment1", commentLines.get(0));
        assertEquals("comment2", commentLines.get(1));
        assertEquals("comment3", commentLines.get(2));
    }

    @Test
    public void setCommentOverrideTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("myPath", "comment1", "comment2");
        commentsConfiguration.setComment("myPath", "comment3");
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        List<String> commentLines = comments.get("myPath");

        assertEquals(1, commentLines.size());
        assertEquals("comment3", commentLines.get(0));
    }

    @Test
    public void setCommentNoCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("myPath");
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        List<String> commentLines = comments.get("myPath");

        assertEquals(0, commentLines.size());
    }

    @Test
    public void setCommentNullPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        try {
            commentsConfiguration.setComment(null, "comment1");
            fail("Expected an NullPointerException to be thrown");
        } catch (NullPointerException e) {
            // Test passed
        }
    }

    @Test
    public void getAllCommentsInitializedWithMapTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path1", Arrays.asList("comment1", "comment2", "comment3"));
        initialComments.put("path2", Collections.singletonList("comment4"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();

        assertEquals(2, comments.size());
        assertEquals(3, comments.get("path1").size());
        assertEquals("comment4", comments.get("path2").get(0));
    }

    @Test
    public void getAllCommentsInitializedWithEmptyConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();

        assertTrue(comments.isEmpty());
    }

}