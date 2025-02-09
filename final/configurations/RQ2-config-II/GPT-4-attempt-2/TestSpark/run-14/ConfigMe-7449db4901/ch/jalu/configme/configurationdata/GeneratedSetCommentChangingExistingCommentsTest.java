package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

public class GeneratedSetCommentChangingExistingCommentsTest {

    @Test
    public void setCommentChangingExistingCommentsTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("test.path", Arrays.asList("Comment1", "Comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);

        commentsConfiguration.setComment("test.path", "Changed comment");

        Map<String, List<String>> updatedComments = commentsConfiguration.getAllComments();

        Assert.assertEquals("The comment should be changed",
                Collections.singletonList("Changed comment"), updatedComments.get("test.path"));
    }

}