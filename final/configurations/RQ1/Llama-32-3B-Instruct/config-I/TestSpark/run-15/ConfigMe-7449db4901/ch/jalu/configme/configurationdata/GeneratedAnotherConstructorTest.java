package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class GeneratedAnotherConstructorTest {

    @Test
    public void AnotherConstructorTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("key1", Arrays.asList("value1"));
        CommentsConfiguration configuration = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, configuration.comments);
    }

}