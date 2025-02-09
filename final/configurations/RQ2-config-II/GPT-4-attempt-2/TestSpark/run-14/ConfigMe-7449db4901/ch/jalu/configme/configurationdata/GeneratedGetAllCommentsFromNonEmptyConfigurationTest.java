package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

public class GeneratedGetAllCommentsFromNonEmptyConfigurationTest {

    @Test
    public void getAllCommentsFromNonEmptyConfigurationTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("test.path", Arrays.asList("Comment1", "Comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();

        Assert.assertEquals("The comments map size should be equal to initial map size",
                initialComments.size(), comments.size());
    }

}