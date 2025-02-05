package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentWithExistingPathTest {

    @Test
    public void setCommentWithExistingPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1");
        commentsConfiguration.setComment("path1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertTrue(allComments.containsKey("path1"));
        assertEquals("comment2", allComments.get("path1").get(0));
    }

}