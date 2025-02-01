package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

public class GeneratedSetCommentWithConstructorTest {

    @Test
    public void setCommentWithConstructorTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        Assert.assertTrue(allComments.containsKey("path1"));
        Assert.assertEquals(Arrays.asList("comment1", "comment2"), allComments.get("path1"));
    }

}