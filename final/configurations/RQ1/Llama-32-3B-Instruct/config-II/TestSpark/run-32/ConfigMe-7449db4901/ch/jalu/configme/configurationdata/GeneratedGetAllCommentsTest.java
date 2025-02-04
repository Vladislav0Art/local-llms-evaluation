package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line11", "line12"));
        config.comments.put("path1", comments.get("path1"));
        config.comments.put("path2", Collections.emptyList());
        assertEquals(comments, config.getAllComments().get("path1"));
    }

}