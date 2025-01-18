package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentOverrideTest {

    @Test
    public void setCommentOverrideTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path1", Arrays.asList("old comment1", "old comment2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        commentsConfiguration.setComment("path1", "new comment1", "new comment2");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("new comment1", "new comment2"));

        Assert.assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}