package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParameterizedConstructorTest {

    @Test
    public void parameterizedConstructorTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("comment1", "comment2"));
        commentsMap.put("path2", Collections.singletonList("single comment"));

        CommentsConfiguration configuration = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, configuration.getAllComments());
    }

}