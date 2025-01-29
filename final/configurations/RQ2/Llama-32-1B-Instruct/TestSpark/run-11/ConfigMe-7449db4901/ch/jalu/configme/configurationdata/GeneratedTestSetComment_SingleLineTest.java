package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSetComment_SingleLineTest {

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

}