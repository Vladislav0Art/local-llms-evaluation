package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentTests_singleLineWithComment {

    @Test
    public void setCommentTests_singleLineWithComment() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "# line1");
        assertEquals(1, config.getComments().get("path").size());
        assertTrue(config.getComments().get("path").get(0).startsWith("#"));
    }

}