package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import ch.jalu.configme.SettingsHolder;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedTestSetComment {

    @Test
    public void testSetComment() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "testPath";
        String commentLine = "testComment";
        config.setComment(path, commentLine);

        Map<String, List<String>> comments = config.getAllComments();
        assertNotNull(comments);
        assertTrue(comments.containsKey(path));
        assertEquals(1, comments.get(path).size());
        assertEquals(commentLine, comments.get(path).get(0));
    }

}