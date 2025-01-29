package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAddCommentWithMultipleLines {

    @BeforeEach
    void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void testAddCommentWithMultipleLines() {
        Comment comment = new Comment();
        comment.setLines(2);
        assertEquals(1, commentsConfiguration.getComments().size());
        assertTrue(commentsConfiguration.getComments().containsKey("path"));
        assertFalse(commentsConfiguration.getComments().get("path").isEmpty());
    }

}