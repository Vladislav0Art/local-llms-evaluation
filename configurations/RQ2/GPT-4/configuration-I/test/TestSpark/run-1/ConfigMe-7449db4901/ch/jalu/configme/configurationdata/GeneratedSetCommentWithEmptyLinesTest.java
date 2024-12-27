package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedSetCommentWithEmptyLinesTest {

    @Test
    public void setCommentWithEmptyLinesTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = new String[]{"line1", "", "line3"};
        configuration.setComment(path, commentLines);

        Map<String, List<String>> allComments = configuration.getAllComments();
        assertEquals(1, allComments.size());
        assertTrue(allComments.containsKey(path));
        List<String> actualCommentLines = allComments.get(path);
        assertEquals(3, actualCommentLines.size());
        assertEquals("line1", actualCommentLines.get(0));
        assertEquals("", actualCommentLines.get(1));
        assertEquals("line3", actualCommentLines.get(2));
    }

}