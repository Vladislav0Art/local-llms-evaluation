package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedGetAllComments_multipleEntries {

    @Test
    public void getAllComments_multipleEntries() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1"));
        comments.put("path2", Arrays.asList("comment2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(2, config.getAllComments().size());
    }

}