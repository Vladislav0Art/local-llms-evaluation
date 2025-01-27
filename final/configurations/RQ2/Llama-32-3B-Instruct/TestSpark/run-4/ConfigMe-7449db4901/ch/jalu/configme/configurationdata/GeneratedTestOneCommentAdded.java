package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestOneCommentAdded {

    @Test
    public void testOneCommentAdded() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("commentLine1"));
        CommentsConfig config = new CommentsConfig(comments);
        assertEquals(1, config.getCommentSet().size());
        assertTrue(config.getCommentSet().containsKey("path1"));
    }

}