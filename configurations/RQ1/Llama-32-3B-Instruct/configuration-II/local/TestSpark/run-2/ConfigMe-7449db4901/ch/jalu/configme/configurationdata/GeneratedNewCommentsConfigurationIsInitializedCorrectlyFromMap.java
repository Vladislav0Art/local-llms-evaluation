package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

public class GeneratedNewCommentsConfigurationIsInitializedCorrectlyFromMap {

    @Test
    public void newCommentsConfigurationIsInitializedCorrectlyFromMap() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration configuration = new CommentsConfiguration(commentsMap);
        assertNotNull(configuration.comments);
        assertEquals(1, configuration.comments.size());
        assertTrue(configuration.comments.containsKey("path1"));
    }

}