package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedSetCommentForEmptyStringPathAddsLines {

    @Test
    public void setCommentForEmptyStringPathAddsLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("", "line1\n", "line2");
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.containsKey(""));
        assertTrue(comments.get("").containsAll(Arrays.asList("line1")));
    }

}