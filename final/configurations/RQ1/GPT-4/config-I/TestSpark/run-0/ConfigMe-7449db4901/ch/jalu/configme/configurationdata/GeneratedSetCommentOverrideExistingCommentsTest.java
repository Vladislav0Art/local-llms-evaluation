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

public class GeneratedSetCommentOverrideExistingCommentsTest {

    @Test
    public void setCommentOverrideExistingCommentsTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path3", "initial comment for path 3");
        commentsConfig.setComment("path3", "updated comment for path 3");
        assertTrue(commentsConfig.getAllComments().containsKey("path3"));
        assertEquals(Collections.singletonList("updated comment for path 3"), commentsConfig.getAllComments().get("path3"));
    }

}