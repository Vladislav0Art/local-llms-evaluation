package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCommentsConfigurationMapConstructorTest {

    @Test
    public void CommentsConfigurationMapConstructorTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("Comment 1", "Comment 2"));

        CommentsConfiguration configuration = new CommentsConfiguration(commentsMap);

        assertEquals(commentsMap, configuration.getAllComments());
    }

}