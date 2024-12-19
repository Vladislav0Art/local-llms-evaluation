package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertNotNull(allComments);
        assertTrue(allComments.containsKey("path"));
        List<String> comments = allComments.get("path");
        assertNotNull(comments);
        assertEquals(2, comments.size());
        assertEquals("comment1", comments.get(0));
        assertEquals("comment2", comments.get(1));
    }

}