package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_nonEmptyMap {

    @Test
    public void newCommentsConfiguration_nonEmptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        List<String> line1 = new ArrayList<>();
        line1.add("line1");
        comments.put("path1", line1);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertEquals(comments, configuration.getAllComments());
    }

}