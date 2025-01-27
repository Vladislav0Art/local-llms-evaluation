package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedGetAllComments_emptyMap {

    @Test
    public void getAllComments_emptyMap() {
        Map<String, List<String>> comments = Collections.singletonMap("path", new ArrayList<>());
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertTrue(config.getAllComments().isEmpty());
    }

}