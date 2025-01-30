package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedSetComment_NewMultipleCommentLinesTest {

    @Test
    public void setComment_NewMultipleCommentLinesTest() {
        String path = "testPath";
        String[] commentLines = new String[]{"Line 1", "Line 2", "Line 3"};
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(path, commentLines);

        Map<String, List<String>> comments = commentsConfiguration.getAllComments();

        assertTrue(comments.containsKey(path));
        assertEquals(Arrays.asList(commentLines), comments.get(path));
    }

}