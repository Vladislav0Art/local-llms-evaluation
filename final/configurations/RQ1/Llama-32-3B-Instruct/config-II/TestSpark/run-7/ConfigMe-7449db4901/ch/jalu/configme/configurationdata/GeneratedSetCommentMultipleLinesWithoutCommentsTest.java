package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class GeneratedSetCommentMultipleLinesWithoutCommentsTest {

    @Test
    public void setCommentMultipleLinesWithoutCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "\n", "line2");
        assertNotNull(config.comments);
        assertEquals(1, config.comments.size());
        assertTrue(config.comments.get("path").contains("\n"));
    }

}