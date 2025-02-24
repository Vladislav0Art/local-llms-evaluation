package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import ch.jalu.configme.SettingsHolder;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorWithoutParametersTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void constructorWithNullCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(null);
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void constructorWithEmptyCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(Collections.emptyMap());
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void constructorWithNonEmptyCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", Arrays.asList("comment1", "comment2"));
        comments.put("key2", Arrays.asList("comment3", "comment4"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(2, allComments.size());
        assertTrue(allComments.containsKey("key1"));
        assertTrue(allComments.containsKey("key2"));
        assertEquals(Arrays.asList("comment1", "comment2"), allComments.get("key1"));
        assertEquals(Arrays.asList("comment3", "comment4"), allComments.get("key2"));
    }

}