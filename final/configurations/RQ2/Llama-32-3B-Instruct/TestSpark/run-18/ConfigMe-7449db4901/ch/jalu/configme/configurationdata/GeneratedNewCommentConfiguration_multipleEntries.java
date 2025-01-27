package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedNewCommentConfiguration_multipleEntries {

    @Test
    public void newCommentConfiguration_multipleEntries() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(1, config.getAllComments().size());
        assertTrue(config.getAllComments().containsKey("path"));
    }

}