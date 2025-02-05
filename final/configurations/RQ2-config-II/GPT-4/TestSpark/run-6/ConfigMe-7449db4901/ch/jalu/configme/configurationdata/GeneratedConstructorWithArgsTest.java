package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedConstructorWithArgsTest {

    @Test
    public void constructorWithArgsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("This is a line.", "Another line here."));
        comments.put("path2", Arrays.asList("Third line here."));

        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(2, config.getAllComments().size());
    }

}