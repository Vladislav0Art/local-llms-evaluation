package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEmptyCommentTest {

    @Test
    public void emptyCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path4", "");

        List<String> comments = commentsConfiguration.getAllComments().get("path4");
        assertEquals("There should be one comment for path4", 1, comments.size());
        assertEquals("Comment for path4 should be empty", "", comments.get(0));
    }

}