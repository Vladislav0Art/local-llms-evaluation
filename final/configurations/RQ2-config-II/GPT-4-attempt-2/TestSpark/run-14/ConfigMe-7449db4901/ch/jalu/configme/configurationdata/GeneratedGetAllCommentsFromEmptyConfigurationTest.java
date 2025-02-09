package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

public class GeneratedGetAllCommentsFromEmptyConfigurationTest {

    @Test
    public void getAllCommentsFromEmptyConfigurationTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();

        Assert.assertTrue("The comments map should be empty", comments.isEmpty());
    }

}