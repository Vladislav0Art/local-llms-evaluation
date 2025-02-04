package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedSetCommentForExistingPathAddsLines {

    @Test
    public void setCommentForExistingPathAddsLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("existingPath", "line1\n");
        config.setComment("existingPath", "line2\n", "line3");
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.containsKey("existingPath"));
        assertTrue(comments.get("existingPath").containsAll(Arrays.asList("line2")));
    }

}