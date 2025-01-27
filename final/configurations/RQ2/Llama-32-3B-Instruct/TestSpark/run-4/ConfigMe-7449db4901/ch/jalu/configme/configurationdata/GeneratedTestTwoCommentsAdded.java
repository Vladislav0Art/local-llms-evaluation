package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTwoCommentsAdded {

    @Test
    public void testTwoCommentsAdded() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("commentLine1"));
        comments.put("path2", Arrays.asList("commentLine2"));
        CommentsConfig config = new CommentsConfig(comments);
        assertEquals(2, config.getCommentSet().size());
        assertTrue(config.getCommentSet().containsKey("path1"));
        assertTrue(config.getCommentSet().containsKey("path2"));
    }

}