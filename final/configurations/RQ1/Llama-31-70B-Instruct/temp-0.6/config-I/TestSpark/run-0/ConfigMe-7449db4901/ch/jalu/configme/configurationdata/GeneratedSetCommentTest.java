package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "testPath";
        String[] commentLines = new String[]{"line1", "line2"};
        commentsConfiguration.setComment(path, commentLines);
        Map<String, List<String>> comments = commentsConfiguration.getAllComments();
        assertEquals(1, comments.size());
        assertTrue(comments.containsKey(path));
        assertEquals(Arrays.asList(commentLines), comments.get(path));
    }

}