package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConstructorWithParamsTest {

    @Test
    public void constructorWithParamsTest() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("key", Arrays.asList("Line 1", "Line 2", "Line 3"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(map);

        assertEquals(1, commentsConfiguration.getAllComments().size());
        assertTrue(commentsConfiguration.getAllComments().containsKey("key"));
        assertEquals(Arrays.asList("Line 1", "Line 2", "Line 3"), commentsConfiguration.getAllComments().get("key"));
    }

}