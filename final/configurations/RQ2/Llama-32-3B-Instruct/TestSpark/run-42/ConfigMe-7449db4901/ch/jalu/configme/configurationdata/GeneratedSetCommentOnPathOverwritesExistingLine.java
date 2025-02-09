package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;

public class GeneratedSetCommentOnPathOverwritesExistingLine {

    @Test
    public void setCommentOnPathOverwritesExistingLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setCommentOnPath("path1", "line1");
        config.setCommentOnPath("path1", Arrays.asList("line2"));
        assertEquals(1, ((Map<String, List<String>>) config.getAllComments()).get("path1").size());
    }

}