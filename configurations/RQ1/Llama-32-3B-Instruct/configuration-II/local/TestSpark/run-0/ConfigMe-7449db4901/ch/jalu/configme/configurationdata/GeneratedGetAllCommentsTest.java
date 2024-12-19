package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Collections.singletonList("line1"));
        configuration.comments = comments;
        assertNotNull(configuration.getAllComments());
        assertTrue(configuration.getAllComments().containsKey("path"));
        assertEquals(Collections.singletonList("line1"), configuration.getAllComments().get("path"));
    }

}