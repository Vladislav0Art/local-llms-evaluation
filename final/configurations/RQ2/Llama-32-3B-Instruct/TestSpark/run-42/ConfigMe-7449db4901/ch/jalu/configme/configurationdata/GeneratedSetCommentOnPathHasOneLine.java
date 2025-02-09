package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedSetCommentOnPathHasOneLine {

    @Test
    public void setCommentOnPathHasOneLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setCommentOnPath("path1", "line1");
        assertEquals(1, ((Map<String, List<String>>) config.getAllComments()).get("path1").size());
    }

}