package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        // Given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("Path1", "Comment1");

        // When
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        // Then
        Assert.assertEquals(1, allComments.size());
        Assert.assertEquals("Comment1", allComments.get("Path1").get(0));
    }

}