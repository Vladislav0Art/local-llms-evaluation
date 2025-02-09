package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void constructorDefaultTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), commentsConfiguration.getAllComments());
    }

    @Test
    public void constructorWithMapTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("comment1", "comment2"));
        commentsMap.put("path2", Collections.singletonList("comment3"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("newPath", "newComment1", "newComment2");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("newPath", Arrays.asList("newComment1", "newComment2"));

        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentOverwriteTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path", Arrays.asList("initialComment1", "initialComment2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        commentsConfiguration.setComment("path", "newComment");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path", Collections.singletonList("newComment"));

        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("comment1", "comment2"));
        commentsMap.put("path2", Collections.singletonList("comment3"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(commentsMap, allComments);
    }

}