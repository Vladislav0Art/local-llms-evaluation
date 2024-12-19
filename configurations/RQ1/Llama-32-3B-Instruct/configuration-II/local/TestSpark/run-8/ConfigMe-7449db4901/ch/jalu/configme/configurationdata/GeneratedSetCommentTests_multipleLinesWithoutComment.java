package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentTests_multipleLinesWithoutComment {

    @Test
    public void setCommentTests_multipleLinesWithoutComment() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "line1\nline2");
        assertEquals(2, config.getComments().get("path").size());
        assertFalse(config.getComments().get("path").get(0).startsWith("#"));
    }

}