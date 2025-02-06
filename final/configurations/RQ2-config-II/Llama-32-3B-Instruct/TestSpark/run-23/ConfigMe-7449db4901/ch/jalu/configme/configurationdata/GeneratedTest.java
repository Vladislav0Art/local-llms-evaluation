package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructorEmptyMapTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.getAllComments());
    }

    @Test
    public void constructorNonEmptyMapTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key", Arrays.asList("value1", "value2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(comments, config.getAllComments());
    }

    @Test
    public void setCommentSingleLineTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "");
        assertNotNull(config.getAllComments().get("path"));
        assertTrue(config.getAllComments().get("path").isEmpty());
    }

    @Test
    public void setCommentMultipleLinesTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] commentLines = {"line1", "line2"};
        config.setComment("path", commentLines[0], commentLines[1]);
        assertEquals(Arrays.asList(commentLines), config.getAllComments().get("path"));
    }

    @Test
    public void setCommentMultiplePathsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] path1 = {"path1"};
        String[] path2 = {"path2"};
        String[] commentLine1 = {"line1", "line2"};
        String[] commentLine2 = {"line3", "line4"};
        config.setComment(path1[0], commentLine1[0], commentLine1[1]);
        config.setComment(path2[0], commentLine2[0], commentLine2[1]);
        assertEquals(Arrays.asList(new String[][]{{commentLine1}, {commentLine2}}), config.getAllComments());
    }

    @Test
    public void setCommentNewLinesOnlyTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "", "", "");
        assertNotNull(config.getAllComments().get("path"));
        assertTrue(config.getAllComments().get("path").isEmpty());
    }

    @Test
    public void getAllCommentsEmptyMapTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(Collections.emptyMap(), config.getAllComments());
    }

}