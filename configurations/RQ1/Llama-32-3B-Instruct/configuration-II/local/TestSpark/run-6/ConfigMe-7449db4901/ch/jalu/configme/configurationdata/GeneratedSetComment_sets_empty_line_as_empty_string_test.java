package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedSetComment_sets_empty_line_as_empty_string_test {

    @Test
    public void setComment_sets_empty_line_as_empty_string_test() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "path1";

        config.setComment(path, "\n");

        assertEquals(0, config.comments.size());
        assertTrue(config.comments.containsKey(path));
        assertEquals(Arrays.asList(), config.comments.get(path));
    }

}