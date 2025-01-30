package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationWithMapConstructorTest {

    @Test
    public void CommentsConfigurationWithMapConstructorTest() {
        Map<String, List<String>> originalMap = new HashMap<>();
        originalMap.put("path1", Collections.singletonList("comment1"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(originalMap);
        assertEquals(originalMap, commentsConfig.getAllComments());
    }

}