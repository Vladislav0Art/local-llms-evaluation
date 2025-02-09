package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void commentsConfigurationDefaultConstructorTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("Comment1", "Comment2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);
        assertEquals(comments, commentsConfig.getAllComments());
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path1", "Comment1", "Comment2");
        assertEquals(Arrays.asList("Comment1", "Comment2"), commentsConfig.getAllComments().get("path1"));
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("Comment1", "Comment2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(comments);
        Map<String, List<String>> allComments = commentsConfig.getAllComments();
        assertEquals(comments, allComments);
        assertEquals(Arrays.asList("Comment1", "Comment2"), allComments.get("path1"));
    }

}