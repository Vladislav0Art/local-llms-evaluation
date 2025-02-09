package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorEmptyTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

    @Test
    public void constructorWithParamsTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("key", Arrays.asList("Line 1", "Line 2", "Line 3"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertTrue(commentsConfiguration.getAllComments().containsKey("key"));
        assertEquals(Arrays.asList("Line 1", "Line 2", "Line 3"), commentsConfiguration.getAllComments().get("key"));
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

        commentsConfiguration.setComment("path", "Line 1", "Line 2", "Line 3");
        assertEquals(Arrays.asList("Line 1", "Line 2", "Line 3"), commentsConfiguration.getAllComments().get("path"));

        commentsConfiguration.setComment("path", "Line 4");
        assertEquals(Arrays.asList("Line 4"), commentsConfiguration.getAllComments().get("path"));
    }

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());

        commentsConfiguration.setComment("path", "Line 1", "Line 2", "Line 3");
        assertEquals(1, commentsConfiguration.getAllComments().size());

        commentsConfiguration.setComment("anotherPath", "Line 4", "Line 5");
        assertEquals(2, commentsConfiguration.getAllComments().size());
    }

}