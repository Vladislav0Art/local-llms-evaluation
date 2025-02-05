package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructorEmptyTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertTrue(configuration.getAllComments().isEmpty());
    }

    @Test
    public void constructorWithCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(configuration.getAllComments(), comments);
    }

    @Test
    public void setCommentAddTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();

        configuration.setComment("path1", "comment1", "comment2");

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path1", Arrays.asList("comment1", "comment2"));

        assertEquals(expected, configuration.getAllComments());
    }

    @Test
    public void setCommentReplaceTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);

        configuration.setComment("path1", "newComment1", "newComment2");

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path1", Arrays.asList("newComment1", "newComment2"));

        assertEquals(expected, configuration.getAllComments());
    }

    @Test
    public void setCommentEmptyLineTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();

        configuration.setComment("path1", "");

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path1", Collections.singletonList(""));

        assertEquals(expected, configuration.getAllComments());
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);

        assertEquals(configuration.getAllComments(), comments);
    }

}