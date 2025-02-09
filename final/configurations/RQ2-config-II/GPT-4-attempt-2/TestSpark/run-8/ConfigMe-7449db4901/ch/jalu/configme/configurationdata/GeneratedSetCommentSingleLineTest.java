package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentSingleLineTest {

    @Test
    public void setCommentSingleLineTest() {
        // Arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        String comment = "This is a single line comment";

        // Act
        commentsConfiguration.setComment(path, comment);

        // Assert
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        Assert.assertTrue(allComments.containsKey(path));
        Assert.assertEquals(Arrays.asList(comment), allComments.get(path));
    }

}