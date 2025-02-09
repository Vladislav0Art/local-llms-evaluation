package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsInitialCommentsTest {

    @Test
    public void getAllCommentsInitialCommentsTest() {
        String path = "path";
        String comment = "comment";
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put(path, Arrays.asList(comment));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(1, allComments.size());
        assertTrue(allComments.containsKey(path));
        assertEquals(Arrays.asList(comment), allComments.get(path));
    }

}