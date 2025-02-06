package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_fromMap_isNotEmpty {

    @Test
    public void newCommentsConfiguration_fromMap_isNotEmpty() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("line1", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(commentsMap);
        assertFalse(comments.getAllComments().isEmpty());
    }

}