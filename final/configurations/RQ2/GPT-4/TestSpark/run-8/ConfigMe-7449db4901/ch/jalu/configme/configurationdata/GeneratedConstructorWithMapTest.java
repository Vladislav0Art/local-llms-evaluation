package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedConstructorWithMapTest {

    @Test
    public void constructorWithMapTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Collections.singletonList("comment1"));
        comments.put("path2", Collections.singletonList("comment2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);

        assertEquals(2, commentsConfiguration.getAllComments().size());
        assertTrue(commentsConfiguration.getAllComments().containsKey("path1"));
        assertTrue(commentsConfiguration.getAllComments().containsKey("path2"));
    }

}