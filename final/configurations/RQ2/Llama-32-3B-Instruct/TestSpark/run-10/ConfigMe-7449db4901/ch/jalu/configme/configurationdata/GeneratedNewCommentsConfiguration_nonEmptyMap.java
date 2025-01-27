package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_nonEmptyMap {

    @Test
    public void newCommentsConfiguration_nonEmptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertNotNull(config.getAllComments());
        assertEquals(1, ((Map<String, List<String>>) config.getAllComments()).size());
    }

}