package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedSetEmptyCommentTest {

    @Test
    public void setEmptyCommentTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(comments);
        String path = "path1";
        config.setComment(path, "");
        assertEquals(0, config.comments.size());
        assertTrue(config.comments.containsKey(path));
    }

}