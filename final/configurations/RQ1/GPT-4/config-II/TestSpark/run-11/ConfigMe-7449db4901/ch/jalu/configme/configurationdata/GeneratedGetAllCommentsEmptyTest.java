package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

public class GeneratedGetAllCommentsEmptyTest {

    @Test
    public void getAllCommentsEmptyTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        Assert.assertTrue(allComments.isEmpty());
    }

}