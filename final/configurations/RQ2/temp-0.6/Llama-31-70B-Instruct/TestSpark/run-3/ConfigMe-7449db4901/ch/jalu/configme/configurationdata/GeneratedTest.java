package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void testSetComment() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "comment1", "comment2");

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path", Arrays.asList("comment1", "comment2"));

        assertEquals(expected, configuration.getAllComments());
    }

    @Test
    public void testSetCommentNoComments() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path");

        Map<String, List<String>> expected = new HashMap<>();

        assertEquals(expected, configuration.getAllComments());
    }

    @Test
    public void testGetAllComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);

        assertEquals(comments, configuration.getAllComments());
    }

}