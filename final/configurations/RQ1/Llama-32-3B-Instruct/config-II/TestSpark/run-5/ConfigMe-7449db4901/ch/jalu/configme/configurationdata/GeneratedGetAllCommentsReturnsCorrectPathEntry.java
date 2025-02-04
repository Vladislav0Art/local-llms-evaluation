package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GeneratedGetAllCommentsReturnsCorrectPathEntry {

    @Test
    public void getAllCommentsReturnsCorrectPathEntry() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = configuration.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.containsKey("path1"));
        assertTrue(((List) comments.get("path1")).size() == 2);
    }

}