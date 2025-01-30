package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("testPath", Arrays.asList("line1", "line2"));
        commentsConfiguration.setComment("testPath", "line1", "line2");

        Assert.assertEquals(expectedComments, commentsConfiguration.getAllComments());

        commentsConfiguration.setComment("newPath", "newline");
        expectedComments.put("newPath", Collections.singletonList("newline"));

        Assert.assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}