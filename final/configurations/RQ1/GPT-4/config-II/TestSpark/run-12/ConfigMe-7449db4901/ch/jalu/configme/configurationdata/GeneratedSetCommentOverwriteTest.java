package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentOverwriteTest {

    @Test
    public void setCommentOverwriteTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path3", "comment3");
        commentsConfiguration.setComment("path3", "newComment3");

        List<String> comments = commentsConfiguration.getAllComments().get("path3");
        assertEquals("There should be one comment for path3", 1, comments.size());
        assertEquals("Comment for path3 should be overwritten", "newComment3", comments.get(0));
    }

}