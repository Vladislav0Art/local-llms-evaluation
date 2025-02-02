package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import ch.jalu.configme.ConfigurationDataTestBase;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.comments.isEmpty());
    }

    @Test
    public void constructorTestWithComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(comments, config.comments);
    }

    @Test
    public void setCommentTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line1");
        assertEquals(1, config.comments.size());
        assertTrue(config.comments.get("path1").contains("line1"));
    }

    @Test
    public void setCommentMultipleLinesTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line1\nline2");
        assertEquals(2, config.comments.size());
        assertTrue(config.comments.get("path1").contains("line1"));
        assertTrue(config.comments.get("path1").contains("line2"));
    }

    @Test
    public void setCommentEmptyLineTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "\n");
        assertEquals(1, config.comments.size());
        assertTrue(config.comments.get("path1").isEmpty());
    }

    @Test
    public void setCommentNullPathTest() {
        assertThrows(NullPointerException.class, () -> new CommentsConfiguration().setComment(null, "line1"));
    }

    @Test
    public void setCommentNullCommentLinesTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> config.setComment("path1", null));
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(comments, config.getAllComments());
    }

    @Test
    public void getAllCommentsEmptyTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.getAllComments().isEmpty());
    }

}