package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void commentsConfigurationDefaultConstructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue("Comments map should be empty", commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path1", Collections.singletonList("comment1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);

        assertEquals("Comments should match the initial map", initialComments, commentsConfiguration.getAllComments());
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path2", "comment2");

        List<String> comments = commentsConfiguration.getAllComments().get("path2");
        assertEquals("There should be one comment for path2", 1, comments.size());
        assertEquals("Comment for path2 should match", "comment2", comments.get(0));
    }

    @Test
    public void setCommentOverwriteTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path3", "comment3");
        commentsConfiguration.setComment("path3", "newComment3");

        List<String> comments = commentsConfiguration.getAllComments().get("path3");
        assertEquals("There should be one comment for path3", 1, comments.size());
        assertEquals("Comment for path3 should be overwritten", "newComment3", comments.get(0));
    }

    @Test
    public void emptyCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path4", "");

        List<String> comments = commentsConfiguration.getAllComments().get("path4");
        assertEquals("There should be one comment for path4", 1, comments.size());
        assertEquals("Comment for path4 should be empty", "", comments.get(0));
    }

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path5", "comment5");
        commentsConfiguration.setComment("path6", "comment6");

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals("There should be two elements", 2, allComments.size());
        assertEquals("Comment for path5 should match", "comment5", allComments.get("path5").get(0));
        assertEquals("Comment for path6 should match", "comment6", allComments.get("path6").get(0));
    }

}