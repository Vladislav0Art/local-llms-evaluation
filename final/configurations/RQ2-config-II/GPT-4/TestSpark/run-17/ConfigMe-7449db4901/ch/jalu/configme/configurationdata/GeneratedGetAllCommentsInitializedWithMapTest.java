package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetAllCommentsInitializedWithMapTest {

    @Test
    public void getAllCommentsInitializedWithMapTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path1", Arrays.asList("comment1", "comment2", "comment3"));
        initialComments.put("path2", Collections.singletonList("comment4"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();

        assertEquals(2, comments.size());
        assertEquals(3, comments.get("path1").size());
        assertEquals("comment4", comments.get("path2").get(0));
    }

}