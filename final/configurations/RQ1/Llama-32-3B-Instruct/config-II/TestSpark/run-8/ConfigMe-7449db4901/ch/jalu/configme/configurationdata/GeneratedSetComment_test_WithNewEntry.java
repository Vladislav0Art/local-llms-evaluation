package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedSetComment_test_WithNewEntry {

    @Test
    public void setComment_test_WithNewEntry() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "comment1\ncomment2", "comment3");
        assertNotNull(config.comments.get("path"));
        assertEquals(2, ((List<String>) config.comments.get("path")).size());
        assertTrue(config.comments.containsKey("path"));
    }

}