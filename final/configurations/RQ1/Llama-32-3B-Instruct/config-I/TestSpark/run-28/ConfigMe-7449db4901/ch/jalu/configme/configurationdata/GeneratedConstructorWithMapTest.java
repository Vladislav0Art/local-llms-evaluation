package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class GeneratedConstructorWithMapTest {

    @Test
    public void constructorWithMapTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, config.comments);
    }

}