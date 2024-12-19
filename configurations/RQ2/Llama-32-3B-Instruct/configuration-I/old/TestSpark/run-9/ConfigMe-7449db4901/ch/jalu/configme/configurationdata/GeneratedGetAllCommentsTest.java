package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;
import java.lang.reflect.Field;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() throws Exception {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(commentMap);
        Field field = CommentsConfiguration.class.getDeclaredField("comments");
        field.setAccessible(true);
        Map<String, List<String>> map = (Map<String, List<String>>) ((Map<?, ?>) field.get(comments));
        assertTrue(map.containsKey("testPath"));
    }

}