package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
        String[] commentLines = {"comment1", "comment2"};
        commentsConfiguration.setComment(path, commentLines);

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertNotNull(comments);
        assertEquals(1, comments.size());

        List<String> testPathComments = comments.get(path);
        assertNotNull(testPathComments);
        assertEquals(Arrays.asList(commentLines), testPathComments);
    }

}