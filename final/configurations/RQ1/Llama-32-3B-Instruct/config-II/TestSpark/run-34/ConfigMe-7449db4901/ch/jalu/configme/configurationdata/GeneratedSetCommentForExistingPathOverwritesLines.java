package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedSetCommentForExistingPathOverwritesLines {

    @Test
    public void setCommentForExistingPathOverwritesLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "line1\n");
        config.setComment("path", "line2\n", "line3");
        Map<String, List<String>> comments = config.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.containsKey("path"));
        assertTrue(comments.get("path").containsAll(Arrays.asList("line2")));
    }

}