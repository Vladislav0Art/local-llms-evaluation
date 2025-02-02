package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsShouldReturnMapWithAllComments {

    @Test
    public void getAllCommentsShouldReturnMapWithAllComments() {
        Map<String, List<String>> comments = new HashMap<>();
        String commentLines[] = {"line1", "\n", "line2"};
        CommentsConfiguration c = new CommentsConfiguration(comments);
        c.setComment("path1", commentLines);
        assertEquals(1, c.comments.get("path1").size());
        Map<String, @UnmodifiableView List<String>> result = c.getAllComments();
        assertNotNull(result);
        assertTrue(result.containsKey("path1"));
    }

}