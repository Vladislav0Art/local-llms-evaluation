package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testSetComment() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test_path";
        String[] commentLines = new String[]{"line1", "line2"};

        commentsConfiguration.setComment(path, commentLines);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertNotNull(allComments);
        assertTrue(allComments.containsKey(path));
        assertEquals(Arrays.asList(commentLines), allComments.get(path));
    }

    @Test
    public void testSetComment_newLine() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "test_path";
        String[] commentLines = new String[]{"line1", "\n"};

        commentsConfiguration.setComment(path, commentLines);

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertNotNull(allComments);
        assertTrue(allComments.containsKey(path));
        assertEquals(Arrays.asList(commentLines), allComments.get(path));
    }

}