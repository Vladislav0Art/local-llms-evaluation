package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void constructorNoArgsTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertNotNull(configuration);
    }

    @Test
    public void constructorWithArgsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("commentLine1", "commentLine2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertNotNull(configuration);
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "commentLine1", "commentLine2");
        Map<String, List<String>> allComments = configuration.getAllComments();
        assertNotNull(allComments);
        assertTrue(allComments.containsKey("path"));
        assertEquals(Arrays.asList("commentLine1", "commentLine2"), allComments.get("path"));
    }

    @Test
    public void getAllCommentsEmptyTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> allComments = configuration.getAllComments();
        assertNotNull(allComments);
        assertTrue(allComments.isEmpty());
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("commentLine1", "commentLine2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        Map<String, List<String>> allComments = configuration.getAllComments();
        assertNotNull(allComments);
        assertEquals(allComments, comments);
    }

}