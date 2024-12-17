package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentWithSingleNewLineTest {

    @Test
    public void setCommentWithSingleNewLineTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "\n");
        assertTrue(config.getAllComments().containsKey("path1"));
        assertEquals(0, ((List<String>) config.comments.get("path1")).size());
    }

}