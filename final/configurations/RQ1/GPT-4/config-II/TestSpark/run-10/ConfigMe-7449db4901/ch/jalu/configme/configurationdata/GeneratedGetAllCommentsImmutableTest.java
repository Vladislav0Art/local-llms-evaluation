package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsImmutableTest {

    @Test
    public void getAllCommentsImmutableTest() {
        // Given
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("Path1", "Comment1");

        // When
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        // Then
        allComments.put("New key", Arrays.asList("New value")); // should throw exception
    }

}