package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void setCommentWhenPathExistsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test.path", "test comment 1", "test comment 2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(2, allComments.get("test.path").size());
        assertEquals("test comment 1", allComments.get("test.path").get(0));
        assertEquals("test comment 2", allComments.get("test.path").get(1));
    }

    @Test
    public void setCommentWhenPathNotExistsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("new.path", "new comment");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(1, allComments.get("new.path").size());
        assertEquals("new comment", allComments.get("new.path").get(0));
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("existing.path", Arrays.asList("existing comment 1", "existing comment 2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(2, allComments.get("existing.path").size());
        assertEquals("existing comment 1", allComments.get("existing.path").get(0));
        assertEquals("existing comment 2", allComments.get("existing.path").get(1));
    }

    @Test
    public void getAllCommentsWhenNoCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertTrue(allComments.isEmpty());
    }

}