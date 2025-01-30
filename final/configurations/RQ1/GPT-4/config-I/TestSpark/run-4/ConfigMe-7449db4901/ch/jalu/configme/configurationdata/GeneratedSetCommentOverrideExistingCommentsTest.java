package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentOverrideExistingCommentsTest {

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