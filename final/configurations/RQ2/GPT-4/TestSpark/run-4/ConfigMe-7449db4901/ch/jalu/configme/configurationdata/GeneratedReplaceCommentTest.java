package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedReplaceCommentTest {

    @Test
    public void replaceCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "initial comment line");
        commentsConfiguration.setComment("path", "new comment line");

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        Assert.assertEquals(1, comments.size());
        Assert.assertEquals("new comment line", comments.get("path").get(0));
    }

}