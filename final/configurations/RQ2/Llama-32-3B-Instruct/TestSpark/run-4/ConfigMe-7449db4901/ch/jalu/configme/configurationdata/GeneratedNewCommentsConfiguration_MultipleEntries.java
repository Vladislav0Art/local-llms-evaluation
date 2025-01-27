package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_MultipleEntries {

    @Test
    public void newCommentsConfiguration_MultipleEntries() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("comment1"));
        comments.put("path2", Arrays.asList("comment2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(2, configuration.getAllComments().size());
    }

}