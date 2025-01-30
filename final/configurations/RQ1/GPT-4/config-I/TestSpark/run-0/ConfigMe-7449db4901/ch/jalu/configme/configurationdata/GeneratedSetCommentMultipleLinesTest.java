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

public class GeneratedSetCommentMultipleLinesTest {

    @Test
    public void setCommentMultipleLinesTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path2", "comment1 for path 2", "comment2 for path 2");
        assertTrue(commentsConfig.getAllComments().containsKey("path2"));
        assertEquals(Arrays.asList("comment1 for path 2", "comment2 for path 2"), commentsConfig.getAllComments().get("path2"));
    }

}