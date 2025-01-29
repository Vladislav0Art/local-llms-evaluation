package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @BeforeEach
    void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void testSetComment_SingleLineTest() {
        Comment comment = new Comment();
        comment.setLines(1);
        assertEquals(1, commentsConfiguration.getComments().size());
        assertTrue(commentsConfiguration.getComments().containsKey("path"));
        assertFalse(commentsConfiguration.getComments().get("path").isEmpty());
    }

    @Test
    public void testGetCommentsFromPath() {
        commentsConfiguration.addComment(new Comment());
        assertNotNull(commentsConfiguration.getComments().get("path"));
        assertEquals(1, commentsConfiguration.getComments().size());
        assertTrue(commentsConfiguration.getComments().containsKey("path"));
        assertFalse(commentsConfiguration.getComments().get("path").isEmpty());
    }

    @Test
    public void testAddCommentWithMultipleLines() {
        Comment comment = new Comment();
        comment.setLines(2);
        assertEquals(1, commentsConfiguration.getComments().size());
        assertTrue(commentsConfiguration.getComments().containsKey("path"));
        assertFalse(commentsConfiguration.getComments().get("path").isEmpty());
    }

    @Test
    public void testGetCommentsFromMultiplePaths() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.addComment(new Comment());
        assertEquals(1, configuration.getComments().size());

        commentsConfiguration2 = new CommentsConfiguration();
        commentsConfiguration2.addComment(new Comment());
        assertEquals(1, commentsConfiguration2.getComments().size());

        assertTrue(commentsConfiguration.getComments().containsKey("path"));
        assertFalse(commentsConfiguration.getComments().get("path").isEmpty());

        assertTrue(commentsConfiguration2.getComments().containsKey("path"));
        assertFalse(commentsConfiguration2.getComments().get("path").isEmpty());
    }

}