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
    public void commentsConfigurationDefaultConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration);
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void commentsConfigurationConstructorWithCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1", "comment2"));
        comments.put("path2", Arrays.asList("comment3", "comment4"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertNotNull(commentsConfiguration);
        assertEquals(comments, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("comment1", "comment2"));
        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

    @Test
    public void replaceCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        commentsConfiguration.setComment("path1", "comment3", "comment4");
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("comment3", "comment4"));
        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1", "comment2"));
        comments.put("path2", Arrays.asList("comment3", "comment4"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Map<String, List<String>> retrievedComments = commentsConfiguration.getAllComments();
        assertEquals(comments, retrievedComments);
        assertNotSame(comments, retrievedComments);
    }

}