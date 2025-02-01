package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

public class GeneratedTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        Assert.assertTrue(allComments.containsKey("path1"));
        Assert.assertEquals(Arrays.asList("comment1", "comment2"), allComments.get("path1"));
    }

    @Test
    public void setCommentOverrideTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        commentsConfiguration.setComment("path1", "comment3", "comment4");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        Assert.assertTrue(allComments.containsKey("path1"));
        Assert.assertEquals(Arrays.asList("comment3", "comment4"), allComments.get("path1"));
    }

    @Test
    public void setCommentWithConstructorTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        Assert.assertTrue(allComments.containsKey("path1"));
        Assert.assertEquals(Arrays.asList("comment1", "comment2"), allComments.get("path1"));
    }

    @Test
    public void getAllCommentsEmptyTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        Assert.assertTrue(allComments.isEmpty());
    }

    @Test
    public void getAllCommentsNotEmptyTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        Assert.assertFalse(allComments.isEmpty());
    }

    @Test
    public void getAllCommentsWithConstructorTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        Assert.assertEquals(comments, allComments);
    }

}