package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void constructor_default_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNotNull(config.comments);
        assertEquals(0, config.comments.size());
    }

    @Test
    public void constructor_with_comments_test() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertNotNull(config.comments);
        assertEquals(1, config.comments.size());
    }

    @Test
    public void setComment_adds_entry_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path1";
        String commentLine1 = "comment1";
        String commentLine2 = "comment2";

        config.setComment(path, commentLine1, commentLine2);

        assertEquals(1, config.comments.size());
        assertTrue(config.comments.containsKey(path));
        assertEquals(Arrays.asList(commentLine1, commentLine2), config.comments.get(path));
    }

    @Test
    public void setComment_overrides_existing_entry_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path1";
        String commentLine1 = "comment1";

        config.setComment(path, commentLine1);

        config.setComment(path, "newComment");

        assertEquals(1, config.comments.size());
        assertTrue(config.comments.containsKey(path));
        assertEquals(Arrays.asList("newComment"), config.comments.get(path));
    }

    @Test
    public void setComment_sets_empty_line_as_empty_string_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path1";

        config.setComment(path, "\n");

        assertEquals(0, config.comments.size());
        assertTrue(config.comments.containsKey(path));
        assertEquals(Arrays.asList(), config.comments.get(path));
    }

    @Test
    public void getAllComments_returns_unmodifiable_map_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path1 = "path1";
        String commentLine1 = "comment1";

        config.setComment(path1, commentLine1);

        Map<String, @UnmodifiableView List<String>> allComments = config.getAllComments();

        assertTrue(allComments instanceof Map);
        assertEquals(1, allComments.size());
        assertTrue(allComments.containsKey(path1));
        assertEquals(Arrays.asList(commentLine1), allComments.get(path1));
    }

    @Test
    public void getAllComments_returns_empty_map_if_no_comments_test() {
        CommentsConfiguration config = new CommentsConfiguration();

        Map<String, @UnmodifiableView List<String>> allComments = config.getAllComments();

        assertTrue(allComments instanceof Map);
        assertEquals(0, allComments.size());
    }

}