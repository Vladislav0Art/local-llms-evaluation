package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void commentsConfigurationDefaultConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> inputMap = new HashMap<>();
        inputMap.put("test-path", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(inputMap);

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(inputMap, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentSingleLineTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test-path", "test-comment");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Arrays.asList("test-comment"), commentsConfiguration.getAllComments().get("test-path"));
    }

    @Test
    public void setCommentMultiLineTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test-path", "test-comment1", "test-comment2", "test-comment3");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Arrays.asList("test-comment1", "test-comment2", "test-comment3"), commentsConfiguration.getAllComments().get("test-path"));
    }

    @Test
    public void setCommentOverrideTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("test-path", "test-comment1", "test-comment2");
        commentsConfiguration.setComment("test-path", "override-comment1", "override-comment2");

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertEquals(Arrays.asList("override-comment1", "override-comment2"), commentsConfiguration.getAllComments().get("test-path"));
    }

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> inputMap = new HashMap<>();
        inputMap.put("test-path1", Arrays.asList("comment1", "comment2"));
        inputMap.put("test-path2", Arrays.asList("comment3", "comment4"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(inputMap);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(2, allComments.size());
        assertEquals(inputMap, allComments);
    }

}