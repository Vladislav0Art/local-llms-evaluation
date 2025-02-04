package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedSetCommentForNewPathAddsLines {

    @Test
    public void setCommentForNewPathAddsLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("newPath", "line1\n", "line2");
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.containsKey("newPath"));
    }

}