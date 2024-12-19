package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

public class GeneratedGetAllCommentsWorksAsExpected {

    @Test
    public void getAllCommentsWorksAsExpected() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("comment1", "comment2"));
        configuration.comments = commentsMap;
        assertNotNull(configuration.getAllComments());
        assertEquals(1, ((Map<String, @UnmodifiableView List<String>>) configuration.getAllComments()).size());
        assertTrue(((Map<String, @UnmodifiableView List<String>>) configuration.getAllComments()).containsKey("path1"));
    }

}