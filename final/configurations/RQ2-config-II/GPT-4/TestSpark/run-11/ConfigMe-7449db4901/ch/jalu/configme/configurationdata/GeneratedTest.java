package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructorEmptyTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        Assert.assertTrue(comments.isEmpty());
    }

    @Test
    public void constructorWithCommentsTest() {
        Map<String, List<String>> inputComments = new HashMap<>();
        inputComments.put("path1", Arrays.asList("line1", "line2"));
        inputComments.put("path2", Arrays.asList("line3", "line4"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(inputComments);
        Assert.assertEquals(inputComments, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentNewTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "commentLine1", "commentLine2");
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path", Arrays.asList("commentLine1", "commentLine2"));
        Assert.assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentOverwriteTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "oldCommentLine");
        commentsConfiguration.setComment("path", "newCommentLine");
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path", Collections.singletonList("newCommentLine"));
        Assert.assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableTest() {
        Map<String, List<String>> inputComments = new HashMap<>();
        inputComments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(inputComments);
        try {
            commentsConfiguration.getAllComments().put("newPath", Arrays.asList("line3", "line4"));
            Assert.fail("Expected UnsupportedOperationException not thrown.");
        } catch (UnsupportedOperationException e) {
            // Expected exception.
        }
    }

}