package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_isNotEmpty {

    @Test
    public void newCommentsConfiguration_isNotEmpty() {
        // given
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1"));
        config.setComment("path1", "comment1");

        // when
        Map<String, @UnmodifiableView List<String>> actualComments = config.getAllComments();

        // then
        assertEquals(comments, actualComments);
    }

}