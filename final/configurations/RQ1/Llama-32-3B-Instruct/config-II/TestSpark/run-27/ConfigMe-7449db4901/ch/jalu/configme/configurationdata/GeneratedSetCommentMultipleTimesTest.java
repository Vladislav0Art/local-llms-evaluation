package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedSetCommentMultipleTimesTest {

    @Test
    public void setCommentMultipleTimesTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String path = "path1";
        String[] commentLines = {"comment1", "comment2"};
        config.setComment(path, commentLines);
        config.setComment(path, new String[]{});
        assertEquals(1, config.comments.size());
        assertTrue(config.comments.containsKey(path));
    }

}