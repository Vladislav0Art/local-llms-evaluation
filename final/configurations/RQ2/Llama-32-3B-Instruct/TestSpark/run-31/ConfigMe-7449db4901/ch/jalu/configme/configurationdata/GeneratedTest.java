package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newCommentsConfiguration_isEmpty() {
        // given
        CommentsConfiguration config = new CommentsConfiguration();

        // when
        Map<String, List<String>> comments = config.getAllComments();

        // then
        assertTrue(comments.isEmpty());
    }

    @Test
    public void existingCommentsConfiguration_isNotUpdated() {
        // given
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1"));
        Map<String, List<String>> actualComments = new HashMap<>();
        actualComments.put("path1", Arrays.asList("newComment1"));

        // when
        config.setComment("path1", "newComment2");

        // then
        assertEquals(actualComments, config.getAllComments());
    }

    @Test
    public void newCommentsConfiguration_isEmpty() {
        // given
        CommentsConfiguration config = new CommentsConfiguration();

        // when & then
        assertEquals(0, config.getAllComments().size());
    }

}