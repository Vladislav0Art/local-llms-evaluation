package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedSetCommentOnPathHasMultipleLines {

    @Test
    public void setCommentOnPathHasMultipleLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setCommentOnPath("path1", Arrays.asList("line1", "line2"));
        assertEquals(2, ((Map<String, List<String>>) config.getAllComments()).get("path1").size());
    }

}