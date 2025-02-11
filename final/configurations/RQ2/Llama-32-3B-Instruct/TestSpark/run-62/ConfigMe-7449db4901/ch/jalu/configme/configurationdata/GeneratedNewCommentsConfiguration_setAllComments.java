package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedNewCommentsConfiguration_setAllComments {

    @Test
    public void newCommentsConfiguration_setAllComments() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = {"line1", "line2"};
        java.util.Map<String, java.util.List<String>> map = new java.util.HashMap<>();
        map.put(path, Arrays.asList(commentLines));
        commentsConfig.setComment((java.util.Map<String, java.util.List<String>>) map);
        assertEquals(1, commentsConfig.getAllComments().size());
        assertTrue(commentsConfig.getAllComments().containsKey(path));
    }

}