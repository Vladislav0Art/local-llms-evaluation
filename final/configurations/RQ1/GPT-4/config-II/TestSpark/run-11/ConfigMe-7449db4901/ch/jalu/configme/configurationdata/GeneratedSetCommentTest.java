package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        Assert.assertTrue(allComments.containsKey("path1"));
        Assert.assertEquals(Arrays.asList("comment1", "comment2"), allComments.get("path1"));
    }

}