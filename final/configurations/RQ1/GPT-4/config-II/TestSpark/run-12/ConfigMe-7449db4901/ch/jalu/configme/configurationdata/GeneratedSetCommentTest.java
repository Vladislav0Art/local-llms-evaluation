package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path2", "comment2");

        List<String> comments = commentsConfiguration.getAllComments().get("path2");
        assertEquals("There should be one comment for path2", 1, comments.size());
        assertEquals("Comment for path2 should match", "comment2", comments.get(0));
    }

}