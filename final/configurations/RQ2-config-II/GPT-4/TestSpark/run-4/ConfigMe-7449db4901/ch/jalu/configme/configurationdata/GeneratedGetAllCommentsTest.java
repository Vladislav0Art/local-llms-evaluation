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
        // arrange
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList("Comment 1", "Comment 2"));
        expectedComments.put("path2", Arrays.asList("Comment 3", "Comment 4"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(expectedComments);

        // act
        Map<String, List<String>> actualComments = commentsConfiguration.getAllComments();

        // assert
        Assert.assertEquals(expectedComments, actualComments);
    }

}