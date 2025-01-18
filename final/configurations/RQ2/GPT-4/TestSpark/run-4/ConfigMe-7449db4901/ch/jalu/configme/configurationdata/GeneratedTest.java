package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void commentsConfigurationDefaultConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Assert.assertNotNull(commentsConfiguration);
    }

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Collections.singletonList("comment line"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Assert.assertNotNull(commentsConfiguration);
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment line");

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        Assert.assertEquals(1, comments.size());
        Assert.assertEquals("comment line", comments.get("path").get(0));
    }

    @Test
    public void replaceCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "initial comment line");
        commentsConfiguration.setComment("path", "new comment line");

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        Assert.assertEquals(1, comments.size());
        Assert.assertEquals("new comment line", comments.get("path").get(0));
    }

    @Test
    public void emptyCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "");

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        Assert.assertEquals(1, comments.size());
        Assert.assertTrue(comments.get("path").isEmpty());
    }

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