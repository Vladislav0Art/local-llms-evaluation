package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentOverwriteTest {

    @Test
    public void setCommentOverwriteTest() {
        // Arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        String initialComment = "Initial comment";
        String newComment = "New comment";

        // Act
        commentsConfiguration.setComment(path, initialComment);
        commentsConfiguration.setComment(path, newComment);

        // Assert
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        Assert.assertTrue(allComments.containsKey(path));
        Assert.assertEquals(Arrays.asList(newComment), allComments.get(path));
    }

}