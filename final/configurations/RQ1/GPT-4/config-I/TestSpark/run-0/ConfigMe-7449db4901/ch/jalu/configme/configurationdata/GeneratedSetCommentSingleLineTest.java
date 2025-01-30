package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentSingleLineTest {

    @Test
    public void setCommentSingleLineTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path1", "comment for path 1");
        assertTrue(commentsConfig.getAllComments().containsKey("path1"));
        assertEquals(Collections.singletonList("comment for path 1"), commentsConfig.getAllComments().get("path1"));
    }

}