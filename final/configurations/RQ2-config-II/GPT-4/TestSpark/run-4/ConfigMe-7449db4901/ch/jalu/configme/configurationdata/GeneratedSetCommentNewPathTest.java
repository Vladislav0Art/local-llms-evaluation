package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentNewPathTest {

    @Test
    public void setCommentNewPathTest() {
        // arrange
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String expectedPath = "my.path";
        String[] expectedComments = new String[]{"Comment 1", "Comment 2"};

        // act
        commentsConfiguration.setComment(expectedPath, expectedComments);

        // assert
        Map<String, List<String>> actualComments = commentsConfiguration.getAllComments();
        Assert.assertTrue(actualComments.containsKey(expectedPath));
        Assert.assertEquals(Arrays.asList(expectedComments), actualComments.get(expectedPath));
    }

}