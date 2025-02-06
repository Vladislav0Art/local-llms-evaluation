package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConstructorNonEmptyMapTest {

    @Test
    public void constructorNonEmptyMapTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key", Arrays.asList("value1", "value2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(comments, config.getAllComments());
    }

}