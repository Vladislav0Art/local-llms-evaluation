package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void commentsConfigurationConstructorNoArgsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue("Empty map expected", commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void commentsConfigurationConstructorWithArgsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertEquals("comments different from expected", comments, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] comments = {"comment1", "comment2"};
        commentsConfiguration.setComment("key1", comments);
        List<String> savedComments = commentsConfiguration.getAllComments().get("key1");
        assertEquals("saved comments different from expected", Arrays.asList(comments), savedComments);
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertArrayEquals("getAllComments output is different from expected",
                comments.entrySet().toArray(), allComments.entrySet().toArray());
    }

    @Test
    public void setCommentOverrideTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] comments1 = {"comment1", "comment2"};
        String[] comments2 = {"comment3", "comment4"};
        commentsConfiguration.setComment("key1", comments1);
        commentsConfiguration.setComment("key1", comments2);
        List<String> latestComments = commentsConfiguration.getAllComments().get("key1");
        assertEquals("latest comments different from expected", Arrays.asList(comments2), latestComments);
    }

    @Test
    public void getAllCommentsIsReadOnlyTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("key1", "comment1");
        commentsConfiguration.getAllComments().put("key2", Arrays.asList("comment2"));
    }

}