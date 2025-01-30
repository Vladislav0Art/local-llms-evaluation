package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void commentsConfigurationDefaultConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Assert.assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path1", List.of("Comment Line"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        Assert.assertEquals(initialComments, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentNewEntryTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "Comment Line");
        List<String> commentsForPath1 = commentsConfiguration.getAllComments().get("path1");
        Assert.assertEquals(List.of("Comment Line"), commentsForPath1);
    }

    @Test
    public void setCommentOverrideEntryTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path1", List.of("Old Comment"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        commentsConfiguration.setComment("path1", "New Comment Line");
        List<String> commentsForPath1 = commentsConfiguration.getAllComments().get("path1");
        Assert.assertEquals(List.of("New Comment Line"), commentsForPath1);
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path1", List.of("Comment Line"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        Assert.assertEquals(initialComments, commentsConfiguration.getAllComments());
    }

}