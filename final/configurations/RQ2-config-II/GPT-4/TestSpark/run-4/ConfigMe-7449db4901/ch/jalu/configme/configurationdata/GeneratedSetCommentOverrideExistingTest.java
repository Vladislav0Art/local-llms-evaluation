package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentOverrideExistingTest {

    @Test
    public void setCommentOverrideExistingTest() {
        // arrange
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("my.path", Arrays.asList("Old comments"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        String expectedPath = "my.path";
        String[] expectedComments = new String[]{"New comment 1", "New comment 2"};

        // act
        commentsConfiguration.setComment(expectedPath, expectedComments);

        // assert
        Map<String, List<String>> actualComments = commentsConfiguration.getAllComments();
        Assert.assertEquals(Arrays.asList(expectedComments), actualComments.get(expectedPath));
    }

}