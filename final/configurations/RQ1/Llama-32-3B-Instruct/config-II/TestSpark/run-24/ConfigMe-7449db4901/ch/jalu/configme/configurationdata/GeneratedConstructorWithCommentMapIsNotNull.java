package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class GeneratedConstructorWithCommentMapIsNotNull {

    @Test
    public void constructorWithCommentMapIsNotNull() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test", Arrays.asList("line1", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(commentMap);
        assertNotNull(comments);
    }

}