package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedConstructorWithCommentMapTest {

    @Test
    public void constructorWithCommentMapTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        assertEquals(commentMap, commentsConfiguration.getComments());
    }

}