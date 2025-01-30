package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCommentsConfigurationMapConstructorTest {

    @Test
    public void commentsConfigurationMapConstructorTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("comment1", "comment2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertEquals("Comments Configuration map should match the input map", commentsMap, commentsConfiguration.getAllComments());
    }

}