package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void CommentsConfigurationDefaultConstructorTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertTrue(commentsConfig.getAllComments().isEmpty());
    }

    @Test
    public void CommentsConfigurationWithMapConstructorTest() {
        Map<String, List<String>> originalMap = new HashMap<>();
        originalMap.put("path1", Collections.singletonList("comment1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(originalMap);
        assertEquals(originalMap, commentsConfig.getAllComments());
    }

    @Test
    public void setCommentSingleLineTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path1", "comment for path 1");
        assertTrue(commentsConfig.getAllComments().containsKey("path1"));
        assertEquals(Collections.singletonList("comment for path 1"), commentsConfig.getAllComments().get("path1"));
    }

    @Test
    public void setCommentMultipleLinesTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path2", "comment1 for path 2", "comment2 for path 2");
        assertTrue(commentsConfig.getAllComments().containsKey("path2"));
        assertEquals(Arrays.asList("comment1 for path 2", "comment2 for path 2"), commentsConfig.getAllComments().get("path2"));
    }

    @Test
    public void setCommentOverrideExistingCommentsTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path3", "initial comment for path 3");
        commentsConfig.setComment("path3", "updated comment for path 3");
        assertTrue(commentsConfig.getAllComments().containsKey("path3"));
        assertEquals(Collections.singletonList("updated comment for path 3"), commentsConfig.getAllComments().get("path3"));
    }

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        commentsConfig.setComment("path4", "comment for path 4");
        Map<String, List<String>> allComments = commentsConfig.getAllComments();
        assertEquals(1, allComments.size());
        assertTrue(allComments.containsKey("path4"));
        assertEquals(Collections.singletonList("comment for path 4"), allComments.get("path4"));
    }

}