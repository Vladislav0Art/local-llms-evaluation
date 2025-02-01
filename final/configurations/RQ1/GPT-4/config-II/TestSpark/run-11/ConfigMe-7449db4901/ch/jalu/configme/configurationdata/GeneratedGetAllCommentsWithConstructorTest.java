package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

public class GeneratedGetAllCommentsWithConstructorTest {

    @Test
    public void getAllCommentsWithConstructorTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        Assert.assertEquals(comments, allComments);
    }

}