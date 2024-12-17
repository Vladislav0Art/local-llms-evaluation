package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentOverwriteExistingLineTest {

    @Test
    public void setCommentOverwriteExistingLineTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line1");
        config.setComment("path1", "line2");
        assertTrue(config.getAllComments().containsKey("path1"));
        assertEquals(1, ((List<String>) config.comments.get("path1")).size());
    }

}