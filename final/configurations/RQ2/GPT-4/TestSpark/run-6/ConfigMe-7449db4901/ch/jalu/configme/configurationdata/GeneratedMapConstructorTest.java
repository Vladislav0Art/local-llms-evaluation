package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedMapConstructorTest {

    @Test
    public void mapConstructorTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path4", Arrays.asList("comment1", "comment2", "comment3"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(commentMap, allComments);
    }

}