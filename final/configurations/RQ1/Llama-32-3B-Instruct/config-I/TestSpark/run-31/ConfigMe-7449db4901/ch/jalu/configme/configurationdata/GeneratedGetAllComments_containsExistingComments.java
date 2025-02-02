package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class GeneratedGetAllComments_containsExistingComments {

    @Test
    public void getAllComments_containsExistingComments() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.comments.put("path5", Arrays.asList("existing-line"));
        Map<String, List<String>> commentMap = config.getAllComments();
        assertTrue(commentMap.containsKey("path5"));
        assertEquals(1, commentMap.get("path5").size());
    }

}