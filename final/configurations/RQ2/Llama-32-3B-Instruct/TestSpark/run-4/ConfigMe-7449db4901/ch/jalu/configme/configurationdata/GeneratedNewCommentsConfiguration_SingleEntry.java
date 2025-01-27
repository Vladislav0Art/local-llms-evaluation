package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_SingleEntry {

    @Test
    public void newCommentsConfiguration_SingleEntry() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("comment"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(1, configuration.getAllComments().size());
        assertTrue(configuration.getAllComments().containsKey("path"));
    }

}