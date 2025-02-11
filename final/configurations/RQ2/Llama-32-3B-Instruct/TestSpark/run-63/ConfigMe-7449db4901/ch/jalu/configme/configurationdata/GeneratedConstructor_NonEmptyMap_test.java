package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class GeneratedConstructor_NonEmptyMap_test {

    @Test
    public void constructor_NonEmptyMap_test() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertNotNull(config.getAllComments());
        assertEquals(comments, config.getAllComments());
    }

}