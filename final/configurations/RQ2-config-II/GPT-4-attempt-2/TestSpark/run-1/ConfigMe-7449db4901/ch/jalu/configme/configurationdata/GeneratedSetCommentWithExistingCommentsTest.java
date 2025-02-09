package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentWithExistingCommentsTest {

    @Test
    public void setCommentWithExistingCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("testPath", "comment1", "comment2");
        // Try to override existing comments
        commentsConfiguration.setComment("testPath", "newComment1", "newComment2");

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(1, allComments.size());
        assertEquals(Arrays.asList("newComment1", "newComment2"), allComments.get("testPath"));
    }

}