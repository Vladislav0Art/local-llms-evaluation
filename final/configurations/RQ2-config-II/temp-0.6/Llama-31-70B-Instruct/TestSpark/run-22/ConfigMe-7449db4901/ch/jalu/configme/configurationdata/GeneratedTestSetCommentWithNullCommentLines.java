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

public class GeneratedTestSetCommentWithNullCommentLines {

    @Test
    public void testSetCommentWithNullCommentLines() {
        CommentsConfiguration config = new CommentsConfiguration();
        String path = "testPath";
        String[] commentLines = null;
        config.setComment(path, commentLines);

        Map<String, List<String>> comments = config.getAllComments();
        assertNotNull(comments);
        assertTrue(comments.containsKey(path));
        assertTrue(comments.get(path).isEmpty());
    }

}