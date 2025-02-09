package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentMultiLineTest {

    @Test
    public void setCommentMultiLineTest() {
        // Arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        String[] comments = new String[]{"First comment", "Second comment", "Third comment"};

        // Act
        commentsConfiguration.setComment(path, comments);

        // Assert
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        Assert.assertTrue(allComments.containsKey(path));
        Assert.assertEquals(Arrays.asList(comments), allComments.get(path));
    }

}