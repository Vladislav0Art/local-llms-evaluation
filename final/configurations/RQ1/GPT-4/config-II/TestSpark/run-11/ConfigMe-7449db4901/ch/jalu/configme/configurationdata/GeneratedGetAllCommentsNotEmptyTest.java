package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

public class GeneratedGetAllCommentsNotEmptyTest {

    @Test
    public void getAllCommentsNotEmptyTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "comment1", "comment2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        Assert.assertFalse(allComments.isEmpty());
    }

}