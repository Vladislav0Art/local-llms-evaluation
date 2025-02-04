package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newCommentsConfigurationIsEmpty() {
        CommentsConfiguration cfg = new CommentsConfiguration();
        assertEquals(0, cfg.comments.size());
    }

    @Test
    public void newCommentsConfigurationWithConstructorHasCorrectMap() {
        Map<String, List<String>> expected = new HashMap<>();
        String[] lines = {"line1", "line2"};
        CommentsConfiguration cfg = new CommentsConfiguration(expected);
        assertTrue(cfg.comments.equals(expected));
    }

    @Test
    public void setCommentSetsCommentsForPath() {
        CommentsConfiguration cfg = new CommentsConfiguration();
        String path = "/path";
        String line1 = "line1";
        String line2 = "line2";
        cfg.setComment(path, line1, line2);
        assertTrue(cfg.comments.containsKey(path));
        assertEquals(Arrays.asList(line1, line2), cfg.comments.get(path));
    }

    @Test
    public void setCommentSetsCorrectPathAndLines() {
        CommentsConfiguration cfg = new CommentsConfiguration();
        String path = "/path";
        String[] lines = {"line1", "line2"};
        cfg.setComment(path, lines);
        assertTrue(cfg.comments.containsKey(path));
        assertEquals(lines, cfg.comments.get(path).toArray());
    }

    @Test
    public void setCommentSetsEmptyLineForNewLine() {
        CommentsConfiguration cfg = new CommentsConfiguration();
        String path = "/path";
        cfg.setComment(path, "\n");
        assertTrue(cfg.comments.containsKey(path));
        assertEquals(Collections.singletonList(""), cfg.comments.get(path));
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("/path", Arrays.asList("line1"));
        CommentsConfiguration cfg = new CommentsConfiguration(expected);
        assertTrue(cfg.getAllComments().equals(expected));
        assertFalse(cfg.getAllComments().containsKey("/other/path"));
    }

    @Test
    public void getAllCommentsDoesNotAddNewEntries() {
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("/path", Arrays.asList("line1"));
        CommentsConfiguration cfg = new CommentsConfiguration(expected);
        cfg.setComment("/newPath", "newLine");
        assertTrue(cfg.getAllComments().equals(expected));
    }

}