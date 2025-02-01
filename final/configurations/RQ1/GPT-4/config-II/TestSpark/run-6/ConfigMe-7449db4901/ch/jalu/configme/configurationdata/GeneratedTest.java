package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
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
    public void commentsConfigurationParametrizedConstructorTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path", Arrays.asList("This is a comment"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        Assert.assertEquals(commentMap, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("XYZ", "This is a comment on XYZ");
        Assert.assertEquals(Arrays.asList("This is a comment on XYZ"), commentsConfiguration.getAllComments().get("XYZ"));
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("This is a comment on path1"));
        commentMap.put("path2", Arrays.asList("This is a comment on path2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        Assert.assertEquals(2, allComments.size());
        Assert.assertEquals(Arrays.asList("This is a comment on path1"), allComments.get("path1"));
        Assert.assertEquals(Arrays.asList("This is a comment on path2"), allComments.get("path2"));
    }

}