package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void setCommentNewCommentTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path1", "comment1", "comment2");

        Map<String, List<String>> savedComments = commentsConfig.getAllComments();
        assertNotNull(savedComments);
    }

    @Test
    public void setCommentOverrideExistingCommentTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path2", Arrays.asList("initialComment1", "initialComment2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(initialComments);

        commentsConfig.setComment("path2", "newComment1", "newComment2");

        Map<String, List<String>> savedComments = commentsConfig.getAllComments();
        assertNotNull(savedComments.get("path2"));
        assertNotEquals(initialComments.get("path2"), savedComments.get("path2"));
    }

    @Test
    public void getAllCommentsEmptyTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> savedComments = commentsConfig.getAllComments();
        assertTrue(savedComments.isEmpty());
    }

    @Test
    public void getAllCommentsNotEmptyTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path3", Arrays.asList("initialComment1", "initialComment2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(initialComments);

        Map<String, List<String>> savedComments = commentsConfig.getAllComments();
        assertFalse(savedComments.isEmpty());
    }

}