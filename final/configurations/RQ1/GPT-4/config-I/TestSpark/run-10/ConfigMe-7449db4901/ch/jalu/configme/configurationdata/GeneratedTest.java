package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Assert.assertNotNull(commentsConfiguration.getAllComments());
        Assert.assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void constructorWithParamsTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("commentLine1", "commentLine2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        Assert.assertNotNull(commentsConfiguration.getAllComments());
        Assert.assertEquals(commentsMap, commentsConfiguration.getAllComments());
    }

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

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("testPath", Arrays.asList("line1", "line2"));
        commentsConfiguration.setComment("testPath", "line1", "line2");

        Assert.assertEquals(expectedComments, commentsConfiguration.getAllComments());

        commentsConfiguration.setComment("newPath", "newline");
        expectedComments.put("newPath", Collections.singletonList("newline"));

        Assert.assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}