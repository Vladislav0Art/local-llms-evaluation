package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class GeneratedSetCommentMultipleLinesWithCommentsTest {

    @Test
    public void setCommentMultipleLinesWithCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "line1\nline2");
        assertNotNull(config.comments);
        assertEquals(1, config.comments.size());
        assertEquals(Collections.singletonList("line1\nline2"), config.comments.get("path"));
    }

}