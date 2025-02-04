package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class GeneratedTest {

    @Test
    public void constructorDefaultTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.comments);
        assertEquals(0, config.comments.size());
    }

    @Test
    public void constructorMapTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        assertNotNull(config.comments);
        assertEquals(1, config.comments.size());
        assertTrue(config.comments.containsKey("path"));
    }

    @Test
    public void setCommentSingleLineNoCommentTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "\n");
        assertNotNull(config.comments);
        assertEquals(1, config.comments.size());
        assertEquals(Collections.singletonList("\n"), config.comments.get("path"));
    }

    @Test
    public void setCommentMultipleLinesWithCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "line1\nline2");
        assertNotNull(config.comments);
        assertEquals(1, config.comments.size());
        assertEquals(Collections.singletonList("line1\nline2"), config.comments.get("path"));
    }

    @Test
    public void setCommentMultipleLinesWithoutCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "\n", "line2");
        assertNotNull(config.comments);
        assertEquals(1, config.comments.size());
        assertTrue(config.comments.get("path").contains("\n"));
    }

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> allCommentsMap = config.getAllComments();
        assertNotNull(allCommentsMap);
        assertEquals(0, allCommentsMap.size());
    }

}