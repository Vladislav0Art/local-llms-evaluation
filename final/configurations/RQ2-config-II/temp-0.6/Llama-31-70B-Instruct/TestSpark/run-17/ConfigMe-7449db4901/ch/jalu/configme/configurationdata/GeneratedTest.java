package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void setComment_ValidPathAndCommentLines_AddsComment() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "somePath";
        String[] commentLines = new String[]{"line1", "line2"};

        commentsConfiguration.setComment(path, commentLines);

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.containsKey(path));
        assertEquals(Arrays.asList(commentLines), comments.get(path));
    }

    @Test
    public void setComment_EmptyPath_ThrowsException() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "";
        String[] commentLines = new String[]{"line1", "line2"};

        try {
            commentsConfiguration.setComment(path, commentLines);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Path must not be empty", e.getMessage());
        }
    }

    @Test
    public void setComment_NullPath_ThrowsException() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = null;
        String[] commentLines = new String[]{"line1", "line2"
        }

    }