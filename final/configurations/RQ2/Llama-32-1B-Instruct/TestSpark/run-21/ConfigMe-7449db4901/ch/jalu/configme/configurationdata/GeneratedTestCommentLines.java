package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ch.jalu.configme.configurationdata.CommentsConfiguration;

public class GeneratedTestCommentLines {

    @Test
    public void testCommentLines() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("", "commentLine1"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(Arrays.asList(), config.getAllComments().get("path1"));
    }

}