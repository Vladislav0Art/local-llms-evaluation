package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentWorksAsExpectedForLines {

    @Test
    public void setCommentWorksAsExpectedForLines() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "comment1\ncomment2");
        assertNotNull(configuration.comments);
        assertEquals(1, configuration.comments.size());
        assertTrue(configuration.comments.containsKey("path"));
        assertEquals(2, ((List<String>) configuration.comments.get("path")).size());
    }

}