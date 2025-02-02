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
        String path1 = "path1";
        List<String> commentLines1 = Arrays.asList("line1", "line2");
        commentsMap.put(path1, commentLines1);

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, commentsConfiguration.getComments());
    }

}