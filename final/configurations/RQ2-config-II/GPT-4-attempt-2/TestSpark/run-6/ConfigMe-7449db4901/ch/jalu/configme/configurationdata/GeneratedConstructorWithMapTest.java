package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class GeneratedConstructorWithMapTest {

    @Test
    public void constructorWithMapTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("comment1", "comment2"));
        commentsMap.put("path2", Collections.singletonList("comment3"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        assertEquals(commentsMap, commentsConfiguration.getAllComments());
    }

}