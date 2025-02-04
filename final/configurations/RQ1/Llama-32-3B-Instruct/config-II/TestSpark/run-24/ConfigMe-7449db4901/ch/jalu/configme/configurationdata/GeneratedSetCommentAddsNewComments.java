package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedSetCommentAddsNewComments {

    @Test
    public void setCommentAddsNewComments() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test", Arrays.asList("line1"));
        comments.setComment("test", "line2");
        assertEquals(2, comments.comments.get("test").size());
    }

}