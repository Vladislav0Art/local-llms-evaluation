package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetCommentsFromPath {

    @BeforeEach
    void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    @Test
    public void testGetCommentsFromPath() {
        commentsConfiguration.addComment(new Comment());
        assertNotNull(commentsConfiguration.getComments().get("path"));
        assertEquals(1, commentsConfiguration.getComments().size());
        assertTrue(commentsConfiguration.getComments().containsKey("path"));
        assertFalse(commentsConfiguration.getComments().get("path").isEmpty());
    }

}