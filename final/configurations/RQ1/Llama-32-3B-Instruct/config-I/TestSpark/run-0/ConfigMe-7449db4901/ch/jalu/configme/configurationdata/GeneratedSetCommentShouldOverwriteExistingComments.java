package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentShouldOverwriteExistingComments {

    @Test
    public void setCommentShouldOverwriteExistingComments() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration c = new CommentsConfiguration(comments);
        c.setComment("path1", "line1");
        assertEquals(1, c.comments.get("path1").size());
    }

}