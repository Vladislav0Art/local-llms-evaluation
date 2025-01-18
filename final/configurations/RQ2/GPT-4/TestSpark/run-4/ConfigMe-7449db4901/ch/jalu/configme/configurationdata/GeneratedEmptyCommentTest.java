package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedEmptyCommentTest {

    @Test
    public void emptyCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "");

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        Assert.assertEquals(1, comments.size());
        Assert.assertTrue(comments.get("path").isEmpty());
    }

}