package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void defaultConstructorTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertTrue(configuration.getAllComments().isEmpty());
    }

    @Test
    public void parameterizedConstructorTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("comment1", "comment2"));
        commentsMap.put("path2", Collections.singletonList("single comment"));

        CommentsConfiguration configuration = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, configuration.getAllComments());
    }

    @Test
    public void setCommentWithExistingPathTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration configuration = new CommentsConfiguration(commentsMap);

        configuration.setComment("path1", "updated comment1", "updated comment2");
        List<String> updatedComments = configuration.getAllComments().get("path1");
        assertEquals(Arrays.asList("updated comment1", "updated comment2"), updatedComments);
    }

    @Test
    public void setCommentWithNewPathTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("newPath", "new comment1", "new comment2");

        List<String> newComments = configuration.getAllComments().get("newPath");
        assertEquals(Arrays.asList("new comment1", "new comment2"), newComments);
    }

    @Test
    public void setCommentWithEmptyStringTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", "");

        List<String> emptyStrComment = configuration.getAllComments().get("path");
        assertEquals(Collections.singletonList(""), emptyStrComment);
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("comment1", "comment2"));
        commentsMap.put("path2", Collections.singletonList("single comment"));

        CommentsConfiguration configuration = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, configuration.getAllComments());
    }

}