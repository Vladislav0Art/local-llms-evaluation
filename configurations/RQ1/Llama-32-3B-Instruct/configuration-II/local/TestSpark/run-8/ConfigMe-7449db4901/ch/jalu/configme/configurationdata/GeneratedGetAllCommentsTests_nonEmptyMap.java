package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsTests_nonEmptyMap {

    @Test
    public void getAllCommentsTests_nonEmptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertEquals(1, config.getAllComments().size());
        assertEquals(comments.get("path"), config.getAllComments().get("path"));
    }

}