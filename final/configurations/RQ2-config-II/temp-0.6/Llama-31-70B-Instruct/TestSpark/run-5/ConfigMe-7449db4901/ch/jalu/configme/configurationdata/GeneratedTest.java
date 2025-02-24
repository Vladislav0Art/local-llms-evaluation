package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void commentsConfigurationTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), config.getAllComments());
    }

    @Test
    public void commentsConfigurationWithMapTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line 1", "line 2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(comments, config.getAllComments());
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path2", "line 3", "line 4");
        assertEquals(Collections.singletonMap("path2", Arrays.asList("line 3", "line 4")), config.getAllComments());
    }

    @Test
    public void setCommentWithEmptyLinesTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path3", "line 5", "");
        assertEquals(Collections.singletonMap("path3", Arrays.asList("line 5")), config.getAllComments());
    }

}