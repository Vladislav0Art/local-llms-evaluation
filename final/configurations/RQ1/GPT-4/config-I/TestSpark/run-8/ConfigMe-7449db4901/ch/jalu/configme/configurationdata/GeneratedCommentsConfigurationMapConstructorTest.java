package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCommentsConfigurationMapConstructorTest {

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("test comment 1", "test comment 2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertTrue(commentsConfiguration.getAllComments().containsKey("path1"));
        assertTrue(commentsConfiguration.getAllComments().get("path1").contains("test comment 1"));
        assertTrue(commentsConfiguration.getAllComments().get("path1").contains("test comment 2"));
    }

}