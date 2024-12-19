package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration);
    }

    @Test
    public void constructorWithCommentsTest() {
        Map<String, List<String>> comments = Collections.singletonMap("key", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertNotNull(commentsConfiguration);
    }

    @Test
    public void constructorWithNullCommentsTest() {
        new CommentsConfiguration(null);
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertNotNull(allComments);
        assertTrue(allComments.containsKey("path"));
        List<String> comments = allComments.get("path");
        assertNotNull(comments);
        assertEquals(2, comments.size());
        assertEquals("comment1", comments.get(0));
        assertEquals("comment2", comments.get(1));
    }

    @Test
    public void setCommentWithNullPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(null, "comment1", "comment2");
    }

}