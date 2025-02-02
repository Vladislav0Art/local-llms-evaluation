package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedConstructorWithMapTest {

    @Test
    public void constructorWithMapTest() {
        Map<String, List<String>> map = new HashMap<>();
        CommentsConfiguration comments = new CommentsConfiguration(map);
        assertNotNull(comments);
        assertEquals(map, comments.comments);
    }

}