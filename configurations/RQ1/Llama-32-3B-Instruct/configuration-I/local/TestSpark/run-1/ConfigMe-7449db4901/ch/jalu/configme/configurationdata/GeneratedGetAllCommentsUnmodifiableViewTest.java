package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsUnmodifiableViewTest {

    @Test
    public void getAllCommentsUnmodifiableViewTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", Collections.singletonList("line1"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        Map<String, @UnmodifiableView List<String>> unmodifiableMap = config.getAllComments();
        assertTrue(unmodifiableMap.containsKey("key1"));
        assertEquals(1, ((List<String>) unmodifiableMap.get("key1")).size());
    }

}