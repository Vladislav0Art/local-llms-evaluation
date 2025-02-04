package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class GeneratedConstructorMapTest {

    @Test
    public void constructorMapTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        assertNotNull(config.comments);
        assertEquals(1, config.comments.size());
        assertTrue(config.comments.containsKey("path"));
    }

}