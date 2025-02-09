package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsEmptyTest {

    @Test
    public void getAllCommentsEmptyTest() {
        // Arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        // Act
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        // Assert
        Assert.assertTrue(allComments.isEmpty());
    }

}