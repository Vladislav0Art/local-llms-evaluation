package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedConstructorWithCommentsTest {

    @Test
    public void constructorWithCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", java.util.Arrays.asList("commentLine1"));
        comments.put("path2", java.util.Collections.emptyList());
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(comments);
        assertNotNull(commentsConfiguration.getComment(comments.keySet().iterator().next()));
    }

}