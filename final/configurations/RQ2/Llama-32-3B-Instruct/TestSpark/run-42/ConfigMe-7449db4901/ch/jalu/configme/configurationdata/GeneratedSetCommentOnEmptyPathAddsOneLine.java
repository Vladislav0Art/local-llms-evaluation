package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedSetCommentOnEmptyPathAddsOneLine {

    @Test
    public void setCommentOnEmptyPathAddsOneLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setCommentOnPath("", "line1");
        assertTrue(((Map<String, List<String>>) config.getAllComments()).containsKey(""));
        assertEquals(1, ((List<String>) ((Map<String, List<String>>) config.getAllComments()).get("")).size());
    }

}