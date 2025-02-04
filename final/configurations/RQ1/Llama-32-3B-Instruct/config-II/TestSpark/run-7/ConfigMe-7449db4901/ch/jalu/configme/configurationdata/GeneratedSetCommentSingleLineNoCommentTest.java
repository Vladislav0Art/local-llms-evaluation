package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class GeneratedSetCommentSingleLineNoCommentTest {

    @Test
    public void setCommentSingleLineNoCommentTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "\n");
        assertNotNull(config.comments);
        assertEquals(1, config.comments.size());
        assertEquals(Collections.singletonList("\n"), config.comments.get("path"));
    }

}