package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsNonEmptyTest {

    @Test
    public void getAllCommentsNonEmptyTest() {
        // Arrange
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("Comment 1", "Comment 2"));
        commentsMap.put("path2", Arrays.asList("Comment 3", "Comment 4"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);

        // Act
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        // Assert
        Assert.assertEquals(commentsMap, allComments);
    }

}