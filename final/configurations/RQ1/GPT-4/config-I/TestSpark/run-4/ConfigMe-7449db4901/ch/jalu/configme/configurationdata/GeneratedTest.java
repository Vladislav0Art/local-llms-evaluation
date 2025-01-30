package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void noArgConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Assert.assertNotNull(commentsConfiguration.getAllComments());
        Assert.assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void argConstructorTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1", "comment2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Assert.assertNotNull(commentsConfiguration.getAllComments());
        Assert.assertEquals(comments, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1", "comment2");

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path1", Arrays.asList("comment1", "comment2"));

        Assert.assertEquals(expected, commentsConfiguration.getAllComments());
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        Assert.assertEquals(comments, allComments);
        Assert.assertTrue(allComments.get("path1").contains("comment1"));
        Assert.assertTrue(allComments.get("path1").contains("comment2"));
    }

    @Test
    public void setCommentOverrideExistingCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment("path1", "comment1-1", "comment2-2");

        Map<String, List<String>> expected = new HashMap<>();
        expected.put("path1", Arrays.asList("comment1-1", "comment2-2"));

        Assert.assertEquals(expected, commentsConfiguration.getAllComments());
    }

}