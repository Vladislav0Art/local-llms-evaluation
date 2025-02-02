package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAnotherConstructorTest {

    @Test
    public void anotherConstructorTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("test", Arrays.asList("test1", "test2"));
        CommentsConfiguration commentsConfig = new CommentsConfiguration(commentsMap);
        assertNotNull(commentsConfig.getComments());
        assertEquals(commentsMap, commentsConfig.getComments());
    }

}