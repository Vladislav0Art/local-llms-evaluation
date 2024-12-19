package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedConstructor_with_comments_test {

    @Test
    public void constructor_with_comments_test() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(comments, config.comments);
    }

}