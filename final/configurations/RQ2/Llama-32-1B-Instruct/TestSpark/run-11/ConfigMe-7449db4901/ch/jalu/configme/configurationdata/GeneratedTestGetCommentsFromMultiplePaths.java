package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetCommentsFromMultiplePaths {

    @BeforeEach
    void setup() {
        commentsConfiguration = new CommentsConfiguration();
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