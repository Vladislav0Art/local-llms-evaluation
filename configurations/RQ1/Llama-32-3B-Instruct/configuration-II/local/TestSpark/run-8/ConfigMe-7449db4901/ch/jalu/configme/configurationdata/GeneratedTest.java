package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructorTests() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.getComments());
        assertTrue(config.getComments().isEmpty());
    }

    @Test
    public void constructorWithMapTests() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(comments, config.getComments());
    }

    @Test
    public void setCommentTests_emptyPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("", "line1");
        assertNotNull(config.getComments().get(""));
        assertEquals(1, config.getComments().get("").size());
    }

    @Test
    public void setCommentTests_newLineOnly() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "\n");
        assertTrue(config.getComments().get("path").isEmpty());
    }

    @Test
    public void setCommentTests_singleLineWithComment() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "# line1");
        assertEquals(1, config.getComments().get("path").size());
        assertTrue(config.getComments().get("path").get(0).startsWith("#"));
    }

    @Test
    public void setCommentTests_multipleLinesWithComment() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "# line1\n#line2");
        assertEquals(2, config.getComments().get("path").size());
        assertTrue(config.getComments().get("path").get(0).startsWith("#"));
        assertTrue(config.getComments().get("path").get(1).equals("line2"));
    }

    @Test
    public void setCommentTests_multipleLinesWithoutComment() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "line1\nline2");
        assertEquals(2, config.getComments().get("path").size());
        assertFalse(config.getComments().get("path").get(0).startsWith("#"));
    }

    @Test
    public void getAllCommentsTests_emptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.getAllComments().isEmpty());
    }

    @Test
    public void getAllCommentsTests_nonEmptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(1, config.getAllComments().size());
        assertEquals(comments.get("path"), config.getAllComments().get("path"));
    }

}