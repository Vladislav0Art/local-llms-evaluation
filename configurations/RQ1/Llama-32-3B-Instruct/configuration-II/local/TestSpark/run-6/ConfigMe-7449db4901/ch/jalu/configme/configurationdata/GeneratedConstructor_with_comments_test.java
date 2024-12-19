package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedConstructor_with_comments_test {

    @Test
    public void constructor_with_comments_test() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertNotNull(config.comments);
        assertEquals(1, config.comments.size());
    }

}