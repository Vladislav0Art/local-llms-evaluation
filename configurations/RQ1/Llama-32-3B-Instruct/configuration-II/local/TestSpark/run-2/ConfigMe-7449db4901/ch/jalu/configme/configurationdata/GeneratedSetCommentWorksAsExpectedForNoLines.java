package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentWorksAsExpectedForNoLines {

    @Test
    public void setCommentWorksAsExpectedForNoLines() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "\n");
        assertNotNull(configuration.comments);
        assertEquals(1, configuration.comments.size());
        assertTrue(configuration.comments.containsKey("path"));
        assertEquals(0, ((List<String>) configuration.comments.get("path")).size());
    }

}