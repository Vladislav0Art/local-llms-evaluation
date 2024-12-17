package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;
import java.lang.reflect.Field;

public class GeneratedConstructorWithCommentMapTest {

    @Test
    public void constructorWithCommentMapTest() throws Exception {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path", Arrays.asList("line1", "line2"));
        Field field = CommentsConfiguration.class.getDeclaredField("comments");
        field.setAccessible(true);
        CommentsConfiguration comments = new CommentsConfiguration(commentMap);
        Object o = field.get(comments);
        assertEquals(1, ((Map<?, ?>) o).size());
    }

}