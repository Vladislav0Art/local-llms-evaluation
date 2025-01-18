package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        boolean commentsEmpty = commentsConfiguration.getAllComments().isEmpty();
        Assert.assertTrue(commentsEmpty);

        commentsConfiguration.setComment("path", "comment line");

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        Assert.assertEquals(1, comments.size());
        Assert.assertEquals("comment line", comments.get("path").get(0));
    }

}