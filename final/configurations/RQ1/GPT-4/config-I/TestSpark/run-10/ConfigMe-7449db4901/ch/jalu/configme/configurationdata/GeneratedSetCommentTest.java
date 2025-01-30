package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        String path = "testPath";
        String[] lines = new String[]{"line1", "line2"};
        commentsConfiguration.setComment(path, lines);

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        Assert.assertNotNull(comments);
        Assert.assertEquals(1, comments.size());
        Assert.assertTrue(comments.containsKey(path));
        Assert.assertEquals(Arrays.asList(lines), comments.get(path));
    }

}