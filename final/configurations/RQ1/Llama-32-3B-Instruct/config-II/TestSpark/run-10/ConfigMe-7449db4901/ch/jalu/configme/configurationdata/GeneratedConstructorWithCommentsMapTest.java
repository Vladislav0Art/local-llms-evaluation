package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedConstructorWithCommentsMapTest {

    @Test
    public void constructorWithCommentsMapTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, commentsConfiguration.comments);
    }

}