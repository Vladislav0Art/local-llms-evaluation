package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class GeneratedTest {

    // Test 1: Check if the constructor initializes the comments map

    @Test
    public void constructorTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertNotNull(commentsConfiguration.comments);
    }

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test";
        String[] commentLines = {"Line 1", "Line 2"};
        commentsConfiguration.setComment(path, commentLines);

        List<String> comments = commentsConfiguration.comments.get(path);
        assertEquals(2, comments.size());
        assertEquals("Line 1", comments.get(0));
        assertEquals("Line 2", comments.get(1));
    }

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertNotNull(allComments);
        assertEquals(Collections.unmodifiableMap(commentsConfiguration.comments), allComments);
    }

}