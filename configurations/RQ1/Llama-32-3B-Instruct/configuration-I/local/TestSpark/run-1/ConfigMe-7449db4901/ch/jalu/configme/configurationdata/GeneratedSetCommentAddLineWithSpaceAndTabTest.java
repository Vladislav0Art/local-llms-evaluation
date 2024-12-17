package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentAddLineWithSpaceAndTabTest {

    @Test
    public void setCommentAddLineWithSpaceAndTabTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line 1 \t", "\n");
        assertTrue(config.getAllComments().containsKey("path1"));
        assertEquals(2, ((List<String>) config.comments.get("path1")).size());
    }

}