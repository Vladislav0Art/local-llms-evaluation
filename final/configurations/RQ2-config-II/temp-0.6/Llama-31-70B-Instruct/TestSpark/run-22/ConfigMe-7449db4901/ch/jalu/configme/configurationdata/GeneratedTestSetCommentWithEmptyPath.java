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

public class GeneratedTestSetCommentWithEmptyPath {

    @Test
    public void testSetCommentWithEmptyPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        String commentLine = "testComment";
        config.setComment("", commentLine);

        Map<String, List<String>> comments = config.getAllComments();
        assertNotNull(comments);
        assertTrue(comments.isEmpty());
    }

}