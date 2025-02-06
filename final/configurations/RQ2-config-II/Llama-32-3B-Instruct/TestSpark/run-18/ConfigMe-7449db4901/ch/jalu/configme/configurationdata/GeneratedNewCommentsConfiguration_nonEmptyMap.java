package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedNewCommentsConfiguration_nonEmptyMap {

    @Test
    public void newCommentsConfiguration_nonEmptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(comments, configuration.getAllComments());
    }

}