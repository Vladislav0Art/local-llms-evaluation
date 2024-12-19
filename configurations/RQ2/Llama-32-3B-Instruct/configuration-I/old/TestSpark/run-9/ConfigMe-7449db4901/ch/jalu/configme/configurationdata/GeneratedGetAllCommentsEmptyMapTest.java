package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;
import java.lang.reflect.Field;

public class GeneratedGetAllCommentsEmptyMapTest {

    @Test
    public void getAllCommentsEmptyMapTest() throws Exception {
        CommentsConfiguration comments = new CommentsConfiguration();
        Field field = CommentsConfiguration.class.getDeclaredField("comments");
        field.setAccessible(true);
        Map<String, List<String>> map = (Map<String, List<String>>) ((Map<?, ?>) field.get(comments));
        assertFalse(map.containsKey("testPath"));
    }

}