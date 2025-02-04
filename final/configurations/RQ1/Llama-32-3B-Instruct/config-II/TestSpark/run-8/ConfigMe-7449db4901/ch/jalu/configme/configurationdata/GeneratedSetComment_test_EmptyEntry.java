package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedSetComment_test_EmptyEntry {

    @Test
    public void setComment_test_EmptyEntry() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "\n");
        assertNotNull(config.comments.get("path"));
        assertEquals(0, ((List<String>) config.comments.get("path")).size());
        assertTrue(config.comments.containsKey("path"));
    }

}