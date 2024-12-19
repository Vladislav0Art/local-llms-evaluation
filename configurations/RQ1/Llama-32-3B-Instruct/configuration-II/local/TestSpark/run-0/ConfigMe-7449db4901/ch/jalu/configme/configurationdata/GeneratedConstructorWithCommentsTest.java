package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedConstructorWithCommentsTest {

    @Test
    public void constructorWithCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(comments, configuration.comments);
    }

}