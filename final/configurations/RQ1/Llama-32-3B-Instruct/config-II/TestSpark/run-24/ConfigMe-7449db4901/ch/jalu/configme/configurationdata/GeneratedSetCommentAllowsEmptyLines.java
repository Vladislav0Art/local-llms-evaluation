package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedSetCommentAllowsEmptyLines {

    @Test
    public void setCommentAllowsEmptyLines() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test", Arrays.asList("", "line1"));
        String[] commentLines = {"", "line2"};
        comments.setComment("test", commentLines);
        assertEquals(1, comments.comments.get("test").size());
    }

}