package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

public class GeneratedSetCommentAddingNewCommentsTest {

    @Test
    public void setCommentAddingNewCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test.path", "New comment");

        Map<String, List<String>> updatedComments = commentsConfiguration.getAllComments();

        Assert.assertEquals("The comment should be added",
                Collections.singletonList("New comment"), updatedComments.get("test.path"));
    }

}