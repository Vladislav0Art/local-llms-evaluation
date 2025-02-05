package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedConstructorWithParamsTest {

    @Test
    public void constructorWithParamsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", Arrays.asList("comment1", "comment2"));
        comments.put("key2", Arrays.asList("comment3", "comment4"));

        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(comments, config.getAllComments());
    }

}