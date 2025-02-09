package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("commentLine1"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration.getAllComments());
        assertTrue(commentsConfiguration.getAllComments().containsKey("path1"));
    }

}