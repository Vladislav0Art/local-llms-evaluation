package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("custom.path", "myComment1", "myComment2");
        List<String> commentsForPath = commentsConfiguration.getAllComments().get("custom.path");
        Assert.assertTrue(commentsForPath.contains("myComment1"));
        Assert.assertTrue(commentsForPath.contains("myComment2"));
    }

}