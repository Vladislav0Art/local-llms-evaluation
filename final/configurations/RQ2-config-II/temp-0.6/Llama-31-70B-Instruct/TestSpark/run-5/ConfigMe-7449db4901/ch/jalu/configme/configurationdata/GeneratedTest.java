package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testSetComment() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "comment1");
        assertEquals(1, config.getAllComments().size());
        assertEquals(Collections.singletonList("comment1"), config.getAllComments().get("path1"));
    }

    @Test
    public void testSetCommentOverride() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "comment1");
        config.setComment("path1", "comment2");
        assertEquals(1, config.getAllComments().size());
        assertEquals(Collections.singletonList("comment2"), config.getAllComments().get("path1"));
    }

    @Test
    public void testSetCommentMultipleComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "comment1", "comment2");
        assertEquals(1, config.getAllComments().size());
        assertEquals(Arrays.asList("comment1", "comment2"), config.getAllComments().get("path1"));
    }

    @Test
    public void testSetCommentEmptyLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "\n");
        assertEquals(1, config.getAllComments().size());
        assertEquals(Collections.singletonList(""), config.getAllComments().get("path1"));
    }

    @Test
    public void testGetAllComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertTrue(config.getAllComments().isEmpty());
        config.setComment("path1", "comment1");
        assertEquals(1, config.getAllComments().size());
        assertEquals(Collections.singletonList("comment1"), config.getAllComments().get("path1"));
    }

}